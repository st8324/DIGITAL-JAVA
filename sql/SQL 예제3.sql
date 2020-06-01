/* 제품 등록을 하려면 선행되어야 하는 작업은 무엇인가? 
1. member 테이블에 회원 정보를 추가
2. product 테이블에 제품 정보를 추가
*/

/* 제품 등록을 할 수 있는 회원을 확인하기 위한 SQL문을 작성하세요. 
권한이 USER가 아닌 회원으로 검색 => 추후에 판매자가 등록될 수도 있기 때문에 */

select * from shoppingmall.member where m_authority <> 'USER';

-- 현재 구입할 수 있는 제품들을 확인하는 SQL문을 작성하세요.
select pd_name as '제품명', rl_amount as '제고량'
	from registration_list 
		join product 
			on pd_code = rl_pd_code
	where rl_amount > 0;

/* abcd123 회원이 구매한 제품들을 확인하는 SQL문을 작성하세요. */
select m_id as '구매자', pd_name as '제품명', pl_amount as '구매량'
	from purchase_list
		join product
			on pl_pd_code = pd_code
		join purchase
			on pl_pc_num = pc_num
		join shoppingmall.member
			on m_id = pc_m_id
	where m_id ='abcd123';

/* 테이블 A의 기본키 속성을 수정하려 할 때 에러가 나는 경우
원인 : 테이블 B의 외래키로 테이블 A의 기본키가 설정된 경우
해결 : 
 1. 테이블 B의 외래키 해제
 2. 테이블 A의 기본키 속성 변경
 3. 테이블 B의 외래키 재설정
*/