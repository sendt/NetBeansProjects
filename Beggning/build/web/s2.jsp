<%-- 
    Document   : s2
    Created on : Nov 7, 2018, 3:37:26 PM
    Author     : root
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="user" class="user.Data" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<HTML>
   
<BODY>
     <%
    
        Enumeration e=request.getParameterNames();
        while (e.hasMoreElements()) {
                out.print(e.nextElement()+"<br>");
                
            }
        
    
    %>
  
    
<A HREF="s3.jsp">Continue</A>
</BODY>
</HTML>

