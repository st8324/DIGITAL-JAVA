$(function(){
	$('html').scrollTop(0);
	$('.btn-container-whale').click(function(e){
		$('.box-whale').addClass('display-none');
		//3일동안 보지 않기 버튼을 클릭했을 때 URL에 #이 붙는걸 방지
		e.preventDefault();
	})
	//자동 완성 버튼을 클릭하면 
	$('.btn-auto-search').click(function(){
		//자동 완성 기능이 활성화/비활성화
		$('.box-auto-box').toggleClass('display-none');
		//자동 완성 버튼 모양을 위로/아래로
		$('.icon-auto-search').toggleClass('active');
	})
	$('.link-auto-close').click(function(e){
		$('.btn-auto-search').click();
		e.preventDefault();
	})
	//더보기/접기 버튼 클릭
	$('.btn-more').click(function(){
		$('.box-group-keyword').toggleClass('display-none');
		$('.box-service-menu.display').toggleClass('display-none');
		$('.box-container-servicelist').toggleClass('display-none');
		$('.btn-more').toggleClass('display-none');
		if($(this).hasClass('fold')){
			initMenu();
		}
	})
	$('.box-serivce-check').click(function(){
		$(this).find('.icon-check').toggleClass('checked');
	})
	//메뉴 설정 버튼 클릭
	$('.btn-menu-set').click(function(){
		$('.box-service-menu.display').addClass('display-none');
		$('.box-service-menu.set').removeClass('display-none');
		$('.box-container-servicelist .container.display').addClass('display-none');
		$('.box-container-servicelist .container.set').removeClass('display-none');
	})
	function initMenu(){
		$('.box-service-menu.display').addClass('display-none');
		$('.box-service-menu.set').addClass('display-none');
		$('.box-container-servicelist .container.display').removeClass('display-none');
		$('.box-container-servicelist .container.set').addClass('display-none');
		//메뉴 설정에서 선택된 체크박스를 전부 해제
		$('.icon-check').removeClass('checked');
	}
})