use shoppingmall;
drop trigger if exists insert_purchase_list;

delimiter //
-- purchase_list 테이블에 insert 이벤트가 발생된 후에 동작하는 트리거
-- 데이터가 추가된 후에 동작하며 추가된 데이터는 new를 통해 접근할 수 있다.
create trigger insert_purchase_list after insert on purchase_list
-- for each row는 update나 delete와 같이 조건에 의해 여러 행이 수정되거나 삭제될때
-- 변경되는 각행을 의미
for each row
begin
	-- _amount 변수 선언
	declare _amount int default 0;
    declare _price int default 0;
    declare _total_price int default 0;
    -- 구매 리스트에 추가된 제품의 현재 제고량을 가져와서 _amount에 저장
    -- new.pl_pd_code는 지금 테이블에 추가된 구매리스트의 제품 코드
    set _amount = 
		(select rl_amount from registration_list where rl_pd_code = new.pl_pd_code);
	-- 현재 제고량에서 구매한 제고량을 뺌
	set _amount = _amount - new.pl_amount;
    update registration_list
		set rl_amount = _amount
        where rl_pd_code = new.pl_pd_code;
	
    set _total_price
		= (select pc_price 
			from purchase
			where new.pl_pc_num = pc_num);
	
    /*set _price
		= (select pd_price from purchase_list
			join product on pd_code = pl_pd_code
            where new.pl_pd_code = pd_code
            limit 0,1);*/
	/*set _price
		= (select pd_price product
            where new.pl_pd_code = pd_code);*/
	set _price
		= (select pd_price from purchase_list
			join product on pd_code = pl_pd_code
            where new.pl_pd_code = pd_code
            group by pd_code);
	set _total_price = _total_price 
		+ _price * new.pl_amount;
    
    update purchase
		set pc_price = _total_price
        where new.pl_pc_num = pc_num;
    
end//
delimiter ;
show triggers;

/*
트리거
구매리스트 테이블에 구매한 제품을 등록
 => 제품 등록 리스트 테이블에 있는 제고량을 변경
    1. 해당 제품의 현재 제고량을 가져옴
    2. 현재 제고량에서 추가된 구매 제품의 구매량을 뺌
    3. 구매 제품의 제고량을 변경
 => 구매 테이블에 있는 총 가격을 변경
    1. 현재 구매에 대한 총 가격을 가져옴
    2. 추가된 구매제품의 가격을 가져옴
    3. 추가된 구매제품의 수량을 가져옴
    4. 총가격 = 총가격 + 가격*수량을 계산
    5. 총가격을 변경

회원이 제품을 구매했을 때 DB에서 일어나는 상황
1. 구매(purchase) 테이블 insert 이벤트
2. 구매 리스트(purchase_list) 테이블 insert 이벤트
   => 구매한 제품 종류만큼
3. 제품등록리스트(resitration_list) 테이블 update 이벤트 => 제고량
4. 구매(purchase) 테이블 update 이벤트 => 총가격
3.4번은 순서가 바뀌어도 된다. 각 정보들이 서로 영향을 받지 않기 때문에

관리자가 판매글을 등록 했을 때 DB에서 일어나는 상황
상황1 - 판매글을 등록하기 위한 제품이 이미 있는 경우
1. 제품 등록(product_registration) 테이블 insert이벤트
2. 제품 등록 리스트(registration_list)테이블 insert이벤트 => 등록하려는 제품 종류만큼

상황2 - 판매글을 등록하기 위한 제품이 없는 경우
1. 제품(product) 테이블 insert 이벤트 => 등록하려는 제품 종류만큼
2. 제품 등록(product_registration) 테이블 insert이벤트
3. 제품 등록 리스트(registration_list)테이블 insert이벤트 => 등록하려는 제품 종류만큼


비회원이 판매자로 등록되기 위한 과정
1. 회원(member) 테이블 insert이벤트 => 회원가입
2. 회원(member) 테이블 update이벤트 => 관리가 권한 부여
*/