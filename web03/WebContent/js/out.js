function 로그인(){
	var id2 = 'root'; // var는 생략가능 var 일경우에만 생략이 된다.	
	id = prompt('아이디를 입력하세요.')
	if (id == id2) { // == 만 있음 = 불가능
		alert("로그인성공")
	} else {
		alert("로그인실패")
	}
}

function 비교(){
	n1 = 100
	n2 = 200
	// 두 숫자가 동일한지/ 동일하지 않은지 판별하여 프린
	if (n1 == n2) {
		alert("두 숫자는 동일합니다")
	} else {
		alert("두 숫자는 동일하지않습니다")

	}
}

function 기분(){
	친구 = prompt('기분이 어때?')
	나 = prompt('기분이 어때?')
	if (나 == 친구) {
		alert("두 사람의 기분이 일치합니다")
	} else {
		alert("두 사람의 기분이 다릅니다")

	}
}