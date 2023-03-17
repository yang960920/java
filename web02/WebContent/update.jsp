<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
    
    // 가방을 만들고 값들을 넣어서
    MemberVO bag = new MemberVO();
    bag.setId(id);
    bag.setTel(tel);
    // dao에게 전달하자
    MemberDAO3 dao = new MemberDAO3();
    dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 수정 페이지 입니다!!
<hr color="red">
수정한 id = <%=id %> <br>
수정한 tel = <%=tel %> <br>

</body>
</html>