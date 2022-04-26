let wishCount;

$("#wishBtn").click(e => {
	let store_no = e.target.dataset.storeno
			
	$.post({
		url: "wishClick",
		data: {store_no}
	}).done(res => {
		if(res == -1)
			alert("비회원 찜은 어렵다.")
		if(res == 1) {
			$("#wishCount").html("").html(++wishCount)
			alert("찜등록")
		}
		if(res == 0) {
			$("#wishCount").html("").html(--wishCount)
			alert("찜 삭제 ~~~~~~~~~~~~~")
		}
	})
	
})

$(() => {
	let store_no = $("#wishBtn").data("storeno")
	$.post({
		url: "wishCount",
		data: {store_no}
	}).done(res => {
		wishCount = res
		$("#wishBtn").append("<span id='wishCount'>"+res+"</span>")
	})
})
