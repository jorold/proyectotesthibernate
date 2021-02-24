<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controllerdept" class="controllers.ControllerDepartamentos" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hibernate departamentos</h1>
        <%=controllerdept.getTablaDepartamentos()%>
    </body>
</html>
