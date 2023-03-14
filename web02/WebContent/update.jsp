<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
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