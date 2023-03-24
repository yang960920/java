<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String won = request.getParameter("won");
    int won2 = Integer.parseInt(won);
    int dallor = 1283;
    int result = won2/dallor;
    %><%=result %>
