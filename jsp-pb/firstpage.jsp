<%-- Document : firstpage.jsp Created on : 18-Jun-2024, 12:01:53 am Author :
Dell --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Student Details Stored</h1>
    <jsp:useBean id="std" scope="session" class="com.Student">
      <jsp:setProperty name="std" property="*" />
    </jsp:useBean>
    <a href="secondpage.jsp">View Details</a>
  </body>
</html>
