<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함 !! ==> java로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <% // 스크립트릿 - 조금 코드를 써서 만드는 작은 프로그램
    // 자바 코드 넣는 부분!!
    // main 도 필요 없고 딱 본인이 필요한 것만 조금만 넣어도 된다.
    // HttpServletRequest request = new HttpServletRequest();
    // tomcat 은 미리 request를 만들어서 내장시켜 놨다!
    String id = request.getParameter("id"); // "apple"
    String pw = request.getParameter("pw"); // "1234"
    String name = request.getParameter("name"); // "apple"
    String tel = request.getParameter("tel"); // "010"
    
    // 가방을 만들고 값들을 넣어서
    MemberVO bag = new MemberVO();
    bag.setId(id);
    bag.setPw(pw);
    bag.setName(name);
    bag.setTel(tel);
    // dao에게 전달하자
    MemberDAO3 dao = new MemberDAO3();
    dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: lime;
}
</style>
</head>
<body>
회원가입 요청됐음.
<hr color="red">
가입한 id : <%= id%> <br>
가입한 pw : <%= pw%> <br>
가입한 name : <%= name%> <br>
가입한 tel : <%= tel%> <br>



</body>
</html>