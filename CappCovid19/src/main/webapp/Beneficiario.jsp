<%@page import="javax.management.NotCompliantMBeanException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<LINK REL=StyleSheet HREF="CCS/Estilo.css" TYPE="text/css" />
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
HttpSession sesion = (HttpSession) request.getSession();
String usuSession = String.valueOf(sesion.getAttribute("nombre"));
String index = String.valueOf(sesion.getAttribute("Index"));
System.out.println("Beneficiario: " + usuSession);

if (usuSession.equals(null) || usuSession.equals("null") || index.equals("NoBeneficiario")){
	response.sendRedirect("Index.jsp");
}
%>
<div class="col-lg-12 bg-dark">
                <h1 align="center">
                    <font COLOR="white">Gobierno De El Salvador</font>

                </h1>
            </div>

<h1 align="center"> Eres beneficiario del apoyo que ofrece el <br>
 Gobierno de El Salvador <br> que corresponde a $300</h1>
 <i class="far fa-smile-beam fa-10x"></i>
</body>
</html>