<%-- Document : secondpage.jsp Created on : 18-Jun-2024, 12:02:08 am Author :
Dell --%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Student Details :</h1>
    Register Number : <c:out value="${std.regNo}" /> Name :
    <c:out value="${std.sName}" /> Course : <c:out value="${std.sCourse}" /> Sem
    : <c:out value="${std.sSem}" />
  </body>
</html>
