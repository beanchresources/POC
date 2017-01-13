<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>
<body>
<h1>Customer Registration</h1>
<%-- <form action="${pageContext.request.contextPath}/rest_customer/save" method="post"></form> --%>


<form:form action="${pageContext.request.contextPath}/customer/save" method="post" modelAttribute="cust">

Customer Name: &nbsp; <form:input path="name" /><br><br>

Customer Address: &nbsp; <form:input path="address" /><br><br>

<input type="submit" name="submit">

</form:form>
</body>
</html>