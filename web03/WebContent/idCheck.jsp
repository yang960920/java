<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //입력한 값 받아오기
     String id = request.getParameter("id");
      //입력한 id 가 배열에 있는지 확인.
      String[] list = {"root","admin","hong"};
      
      String result = "중복이 되지않아, 사용가능";
     
      //결과를 응답하자
      for (String s : list){
    	  if(s.equals(id)){
    		  result = "중복된 id이므로 사용불가능";
    		  break;
    	  }
      }
    %><%=result %>