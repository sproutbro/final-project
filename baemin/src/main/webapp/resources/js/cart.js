$(function(){

	// cartBtn, orderBtn click시 css
	$("#cartBtn, #orderBtn").click(function(){
		$(this).css("background-color", "RGB(101, 166, 170)");
		setTimeout(function(){
			$(this).css("background-color", "RGB(121, 186, 190)");
		}, 7);
		
	});
	
	// + 버튼 클릭시 
	$(".cartCntAdd").click(function(){
		var price = $(this).parent().attr("data-price");
		var num = Number($(this).prev().attr("data-num"));
		var num = num + 1;
		
		console.log(num);
		console.log(price);
		
		
		$(this).prev().text(num + "개");
		$(".cartCnt").text(num + " 개 담기").attr("data-totalCnt", num);
		$(".detail-footer-cartBtn>span:last-child").text(price * num + "원").attr("data-totalAmt", price * num);
		$("#cnt").attr("data-num", num);
	})
	
	// - 버튼 클릭시
	$(".cartCntMinus").click(function(){
		var price = $(this).parent().attr("data-price");
		var num = Number($(this).next().attr("data-num"));
		if(num == 1) {
			return false;
		}
		var num = num - 1;
		
		$(this).next().text(num + "개");
		$(".cartCnt").text(num + " 개 담기").attr("data-totalCnt", num);
		$(".detail-footer-cartBtn>span:last-child").text(price * num + "원").attr("data-totalAmt", price * num);
		$("#cnt").attr("data-num", num);
	});

	// cartBtn 버튼 클릭시 폼 서브밋
	$("#cartBtn").click(function(){
		
		var totalCnt = $(".cartCnt").attr("data-totalCnt");
		var totalAmt = $(".detail-footer-cartBtn>span:last-child").attr("data-totalAmt");
		$("#totalCnt").attr("value", totalCnt);
		$("#totalAmt").attr("value", totalAmt);
		
		$("#cartForm").submit();
		
	})
	
	// + 버튼 클릭시 
	var totalCnt = Number($("#totalCnt").val());
	var totalAmt = Number($("#totalAmt").val());			
		
	$(".orderAdd").click(function(){
		
		var price = Number($(this).parent().attr("data-price"));
		var num = Number($(this).prev().attr("data-num"));
		var num = num + 1;
		totalCnt = totalCnt + 1;
		totalAmt = totalAmt + price;
		
		
		$(this).prev().text(num + "개");
		$(this).prev().attr("data-num", num);			
		$(this).parent().attr("data-amt", num * price);
		$(this).parent().prev().find('span.amt').text("총 : " + num * price + " 원");
		
		$(".cartCnt").text(totalCnt + " 개 담기").attr("data-totalCnt", totalCnt);
		$(".detail-footer-cartBtn>span:last-child").text(totalAmt + "원").attr("data-totalAmt", totalAmt);
		
	})
	
	// - 버튼 클릭시
	$(".orderMinus").click(function(){
		var price = $(this).parent().attr("data-price");
		var num = Number($(this).next().attr("data-num"));
		
		if(num == 1) {
			return false;
		}
		
		num = num - 1;
		totalCnt = totalCnt - 1;
		totalAmt = totalAmt - price;
		$(this).next().text(num + "개");
		$(this).next().attr("data-num", num);			
		$(this).parent().attr("data-amt", num * price);
		$(this).parent().prev().find('span.amt').text("총 : " + num * price + " 원");
		console.log(price);
		console.log(num);
		console.log(totalCnt);
		console.log(totalAmt);
		
		$(".cartCnt").text(totalCnt + " 개 담기").attr("data-totalCnt", totalCnt);
		$(".detail-footer-cartBtn>span:last-child").text(totalAmt + "원").attr("data-totalAmt", totalAmt);
		

	});

	// orderBtn 버튼 클릭시 폼 서브밋
	$("#orderBtn").click(function(){
		$("#cartForm").submit();
		
	})
		
	// Order Form 전송
	$("#odrInsert").click(function(){
		// 핸드폰 번호 세팅
		var odrPhone = $("#orderUserPhone").text();
		$("#odrPhone").val(odrPhone);
		
		// 사장님 메시지 유효성 검사
		var odrCeoMsg = $("input[name=odrCeoMsg]").val();
		if(odrCeoMsg.length == 0) {
			$("input[name=odrCeoMsg]").val("메세지 없음");
		}
		var odrCeoMsg = $("input[name=odrCeoMsg]").val();
		
		// 일회용품 사용여부 체크
		var odrIsDis = $("input[name=odrIsDis]").is(':checked');
		if(odrIsDis == true) {
			$("input[name=odrIsDis]").attr("value", 1);
		} else {
			$("input[name=odrIsDis]").attr("value", 0);
		}
		

		// 추후 addr 테이블 생성 후 보안 예정
		$("#odrAddr2").val($("#user_addr2").text());
		
		// 폼 전송
		$("#odrForm").submit();
		
	});
		
		
		
		

})
