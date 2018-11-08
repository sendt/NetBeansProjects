<%-- 
    Document   : newjsp
    Created on : Nov 5, 2018, 9:59:53 AM
    Author     : root
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html " pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="text-align: center; size:8vm">Alınan Bilgiler</h1>

        <%
        
         if (request.getParameter("gonder") != null) {
        String ad=request.getParameter("adal");
        out.println(ad);  out.print("<br>"); 
        
        String soyad=request.getParameter("soyadal");
        out.print(soyad);  out.print("<br>"); 
        String d_tatihi=request.getParameter("dogumtarihi");
        SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd");
        Date result=formater.parse(d_tatihi);
        SimpleDateFormat AppDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        out.print(AppDateFormat.format(result));
        out.print("<br>"); 
        String cinsiyet=request.getParameter("cinsiyet");
        out.print(cinsiyet);
        out.print("<br>"); 
        out.println("ŞEhir:"+request.getParameter("broncity"));
        out.print("<br>"); 
        String secimler[] = request.getParameterValues("dil");
            if (secimler != null) {
                for (int i = 0; i < secimler.length; i++) {
                    out.println(secimler[i]);
                }
            }
        //out.println("bilinen diller:");
        //yabancı dılleri yazdır
        //out.println(yabancı_diller+" ");
        
        out.print("<br>");
        String numara=(request.getParameter("telefonno"));
        out.print(numara);  
        out.print("<br>"); 
        
         
        String eklemek_istenen_bilgiler=request.getParameter("ekelennbilgiler");
        out.println(eklemek_istenen_bilgiler);
        out.print("<br>"); 
        }
        else{
            %>
            degerler girilmedi..
            <%
            
            }
        
       
        %>
        
        
        <%
//            if (request.getParameter("gonder") != null) {
//                String ad = request.getParameter("name");
//                String sr = request.getParameter("Surname");
////            request.getParameter("name");
////            request.getParameter("name");
////            request.getParameter("name");
////
//                out.print(ad);
//                out.print(sr);
//            }else{
//            response.sendRedirect("form.jsp");
//            
//            }
        %>
        <br>
        
        <!jsp:include page="sehirler.txt"/-->

    </body>
</html>
