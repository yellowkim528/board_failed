function 삼육구게임(num) {
	if (num % 9 == 0) {
		console.log("박수x2");
	} else if (num % 3 == 0) {
		console.log("박수");
	} else {
		console.log("패스");
	}
}
삼육구게임(9);

function 합격했냐(s1, s2) {
  if (s1 < 0 || s1 > 100 || s2 < 0 || s2 > 100){
    window.alert('0~100사이 숫자를 입력하세요');
    return;
  }
	if (s1 >= 40 && s2 >= 40 && s1 + s2 >= 120) {
		console.log("합격");
	} else {
		console.log("불합격");
	}
}
합격했냐(0, 120);
