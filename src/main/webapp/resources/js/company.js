$(function(){
	$("#selectDomain").on("change", function(){
	let str = $(this).val();
	
	if(str == "직접입력"){
		$("#domain").val("");
		$("#domain").prop("readonly", false);
	}else if(str == "네이버"){
		$("#domain").val("naver.com");
		$("#domain").prop("readonly", true);
	}else if(str == "다음"){
		$("#domain").val("daum.net");
		$("#domain").prop("readonly", true);
	}else if(str == "한메일"){
		$("#domain").val("hanmail.net");
		$("#domain").prop("readonly", true);
	}else if(str == "구글"){
		$("#domain").val("gmail.com");
		$("#domain").prop("readonly", true);
	}
	});
	
	$("#companydeleteProcess").on("click", function(e){
		let input = confirm("정말 회원탈퇴 하시겠습니까?")
		
		if(input){
			 $("#companydeleteProcess").attr("action", "companydeleteProcess");
			 $("#companydeleteProcess").submit();
		}else{
			alert('취소합니다.');
		}
		
	});
	
	$("#companyUpdateForm").on("submit", function(e){

		return joinFormCheck();
	});
	
function joinFormCheck(){
	let id = $("#comId").val();
	let pass = $("#comPass").val();
	let pass1 = $("#comPass1").val();
	let ceoName = $("#comCeoName").val();
	let name = $("#comName").val();
	let Phone2 = $("#comPhone2").val();
	let phone3 = $("#comPhone3").val();
	let addr1 = $("#comAddr1").val();
	let addr2 = $("#comAddr2").val();
	let license = $("#comLicense").val();
	let email = $("#comEmail").val();
	let domain = $("#domain").val();
	
	if(id.length == 0){
	 	alert("아이디가 입력되지 않았습니다.\n아이디를 입력해주세요");
	 	return false;
	}
	if(pass.length == 0){
	 	alert("비밀번호가 입력되지 않았습니다.\n비밀번호를 입력해주세요");
	 	return false;
	}
	if(pass1.length == 0){
	 	alert("비밀번호 확인이 입력되지 않았습니다.\n비밀번호 확인을 입력해주세요");
	 	return false;
	}
	if(pass != pass1){
	 	alert("비밀번호와 비밀번호 확인이 일치하지않습니다.");
	 	return false;
	}
	if(ceoName.length == 0){
	 	alert("대표자이름이 입력되지 않았습니다.\n대표자이름을 입력해주세요");
	 	return false;
	}
	if(name.length == 0){
	 	alert("사장이름이 입력되지 않았습니다.\n사장이름을 입력해주세요");
	 	return false;
	}
	if(Phone2.length == 0){
	 	alert("휴대폰번호가 입력되지 않았습니다.\n휴대폰번호를 입력해주세요");
	 	return false;
	}
	if(phone3.length == 0){
	 	alert("휴대폰번호가 입력되지 않았습니다.\n휴대폰번호를 입력해주세요");
	 	return false;
	}
	if(addr1.length == 0){
	 	alert("주소가 입력되지 않았습니다.\n주소를 입력해주세요");
	 	return false;
	}
	if(addr2.length == 0){
	 	alert("주소가 입력되지 않았습니다.\n주소를 입력해주세요");
	 	return false;
	}
	if(license.length == 0){
	 	alert("라이센스가 입력되지 않았습니다.\n라이센스를 입력해주세요");
	 	return false;
	}
	if(email.length == 0){
	 	alert("이메일이 입력되지 않았습니다.\n이메일을 입력해주세요");
	 	return false;
	}
	if(domain.length == 0){
	 	alert("도메인이 입력되지 않았습니다.\n도메인을 입력해주세요");
	 	return false;
	}
}

});


