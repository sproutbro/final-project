$(function(){
	$(".main_category img,.minus, .add, #cartBtn, #orderBtn, #odrInsert")
		.css("cursor", "pointer")
		.css("padding","0px");
	
	
	$(".back").css("cursor","pointer").click(function(){
		window.history.back();
	})
	

});