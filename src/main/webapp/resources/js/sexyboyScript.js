$("#wishBtn").click(e => {
	let store_no = e.target.dataset.storeno
			
	$.post({
		url: "wishClick",
		data: {store_no}
	}).done(res => {
		if(res == -1)
			alert("비회원 찜은 어렵다.")
		if(res == 1)
			alert("회원찜도 아직이다.")
	})
	
	console.log("상점번호" + e.target.dataset.storeno)
})