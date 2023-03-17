
<%@page import="multi.MemberDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    
    MemberDAO3 dao = new MemberDAO3();
    dao.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 탈퇴 성공 다음에도 또 뵙길 바래요~
<hr color="red">
탈퇴한 id : <%=id %>

</body>
</html>