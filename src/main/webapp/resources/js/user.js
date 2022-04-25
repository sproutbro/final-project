$(function(){
	$("#userFindId").on("click", function(){
		
		var user_email = $("#user_email").val();
		var user_name = $("#user_name").val();
		console.log("ajax1");
		$.ajax({
			type : "post",
			url: "userFindProcess.ajax",
			data: "user_email=" + user_email + "&user_name=" + user_name,
			success : function(map, status, xhr){
			console.log("ajax2");
			
			if(map.result == -1) {
				console.log(map.result);
				alert("아이디가 존재하지 않습니다.");
			}else if(map.result == 0) {
				console.log(map.result);
				alert("이름이 잘못 입력되었습니다.");
			}else {
				console.log(map.user_id);
				alert(map.user_id);
			}
			console.log("ajax3");
			
			}, 
			error: function(xhr, status, error) {
			alert("ajax 실패 : " + status + " - " + xhr.status);
			}
		})
	});
	
	
	$("#userFindPass").on("click", function(){
		var user_email = $("#user_email").val();
		var user_name = $("#user_name").val();
		var user_id = $("#user_id").val();
		
			$.ajax({
				type : "post",
				url : "userFind.ajax",
				data : "user_email=" + user_email + "&user_name=" + user_name
					+ "&user_id=" + user_id,
				success : function(map, status, xhr){
				console.log(map.user_pass);
				console.log(map.user_email);
				console.log(map.user_name);
				
				if(map.result == 0) {
					console.log(map.user_email + " 11");
					alert("이름이 잘못 입력 되었습니다.");
				}else if(map.result == 1) {
					console.log(map.result + " 22");
					alert("아이디가 잘못 입력되었습니다.");
				}else {
					console.log(map.result + " 55");
					alert(map.user_pass);
					console.log(map.result + " 55");
				}
				
				},
				erorr: function(erorr, status, xhr){
				alert("ajax 실패 : " + status + " - " + xhr.status);
				}
			})
		});
	
	
});