<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String no = request.getParameter("no");
    String content = request.getParameter("content");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정된 내용은 아래와 같습니다.
<hr>
당신이 수정을 원하는 번호 : <%= no %>
당신이 수정을 원하는 내용 : <%= content %>

</body>
</html>