//wish
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

//search 
let searchForm = $("#searchForm")

searchForm.submit(e => {
	e.preventDefault();
	let searchKey = e.target.searchKey.value
	
	$.post({
		url: "storeSearch",
		data: {searchKey}
	}).done(res => {

		for(var i in res) {
			console.log(res[i])
			$(".searchList").append(
				`<a href="storeDetailForm?storeNo=` + res[i].storeNo + `">
				<div class="storeList">
					<div class="storeImg">
						<img src="` + res[i].storeImg + `">
					</div>
					<div class="storeContent">
						<div class="storeName-min">` + res[i].storeName + `</div>
						<div class="storeScope">
							<span class="scopeSpan">` + res[i].storeScope + `</span>
						</div>
						<div class="deliveryDiv">
							<span class="deliverySpan">최소주문 6000원</span>
							배달팁 
							<span class="deliverySpan">0원 ~ 4000원</span>
						</div>
						<div class="deliveryTime">
							<img src="#">
							<span> 35~40분 </span>
						</div>
					</div>
				</div>
				</a>`
			)
		}

		
	})
	
})

//
$(() => {
	
	//wish Count		
	let store_no = $("#wishBtn").data("storeno")
			
	if(store_no) {
		$.post({
			url: "wishCount",
			data: {store_no}
		}).done(res => {
			wishCount = res
			$("#wishBtn").append("<span id='wishCount'>"+res+"</span>")
		})
	}
	
	
})
