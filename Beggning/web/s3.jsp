<%-- 
    Document   : s3
    Created on : Nov 7, 2018, 3:54:17 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="user" class="user.Data" scope="session"/> 
<HTML>
    <BODY>
        You entered<BR>
        Name: <%= user.getUsername()%><BR>
        Email: <%= user.getEmail()%><BR>
        Age: <%= user.getAge()%><BR>
    </BODY>
</HTML>