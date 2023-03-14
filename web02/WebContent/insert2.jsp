<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 작성 완료.
<hr color="red">
게시판 번호 : <%=no %> <br>
게시판 제목 : <%=title %> <br>
게시판 내용 : <%=content %> <br>
게시판 작성자 : <%=writer %> <br>


</body>
</html>