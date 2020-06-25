
$(function(){
	var newsRolling = setInterval(function(){
		$('.box-rolling-news').first()
		.animate({'margin-top':'-24px'},700,function(){
			$(this).detach().appendTo('.box-rolling-newslist')
				.css('margin-top','0px').removeAttr('stytle');
		});
	},2000)
	var cardRollingNum = cardRolling();
	$('.box-right2').hover(function(){
		//마우스가 요소 안으로 들어갈때
		clearInterval(cardRollingNum);
	},function(){
		//마우스가 요소 밖으로 나갈때
		cardRollingNum = cardRolling();
	})
	function cardRolling(){
		return setInterval(function(){
			$('.box-card-nav>.card').first().animate({'margin-left':'-281px'},1000,function(){
				$(this).detach().appendTo('.box-card-nav').removeAttr('style');
			})
		},3000)
	}
})
