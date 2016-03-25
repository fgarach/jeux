<%-- 
    Document   : effacemoi
    Created on : 23 mars 2016, 07:59:04
    Author     : tom
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTEEE</h1>


        <c:forEach items="${liste}" var="element">
            <a href="<c:url value="/effacemoi/detail"></c:url>/${element.id}" >${element.id} ${element.nom} ${element.prenom}</a>
            
            <br>
        </c:forEach>
            
            <a href="<c:url value="/effacemoi/ajouter"></c:url>" > Ajouter record </a>
    </body>
</html>

