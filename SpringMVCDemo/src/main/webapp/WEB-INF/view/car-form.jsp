<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="carAction" modelAttribute="carBean" method="post">

brand: <form:input path="brand" />
		<br />
color: <form:input path="color" />

		<br />
出產國家

<%-- <form:select path="country"> --%>

		<%--   <form:option value="德國" label="德國" /> --%>
		<%--   <form:option value="日本" label="日本" /> --%>
		<%--   <form:option value="韓國" label="韓國" /> --%>
		<%--   <form:option value="美國" label="美國" /> --%>

		<%-- </form:select> --%>


		<form:select path="country">
			<form:options items="${carBean.countryOptions}"></form:options>
		</form:select>
		
		<input type="submit" value="送出">
	</form:form>

</body>
</html>