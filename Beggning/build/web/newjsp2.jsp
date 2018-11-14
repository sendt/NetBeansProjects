<%-- 
    Document   : newjsp2
    Created on : Nov 13, 2018, 3:12:46 PM
    Author     : root
--%>
<%@page import="user.NewClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="hesap"  class="user.NewClass" />

<%
    NewClass hesap1 = new NewClass();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>



            <%            for (int i = 0; i < 3; i++) {
                    out.print("<tr>");
                    out.print("<td>");
                    out.print((i + 1) + "tl");
                    out.print("</td>");
                    out.print("<td>");
            %>
            <jsp:setProperty name="hesap" property="tl" value="<%= i + 1%>"/>
            <%
                    out.print(hesap.dolarCevir());
                    out.print("</td>");
                    out.print("</tr>");
                }

            %>
            <script type="text/javascript">

                var i = 0;
                for (var i = 0; i < 10; i++) {
                    document.write("Sayi " + i);
                    document.write("<br>");
                }
            </script>



        </table>
        sondan 
        <script language="JavaScript">
            document.write("<table width='400' border='1' cellspacing='0'>");
            for (i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    document.write("<tr bgcolor='red'><td>1095</td><td>TÜRK TELEKOM ARENA</td><td>MABED</td></tr>");
                } else {
                    document.write("<tr bgcolor='yellow'><td>GALATA</td><td>SARAY</td><td>ASKTIR</td>");
                }
            }
            document.write("</table>");
        </script>
        sondan
        <script language="Javascript">
            var var1;
            var var2;
            var var3;
            var1 = 1;
            var2 = 1;
            document.write("<h4>");
            document.write(var1 + "<br>");
            document.write(var2 + "<br>");
            var3 = var2 + var1;
            document.write(var3 + "<br>");

            var1 = var2;
            var2 = var3;
            var3 = var2 + var1;
            document.write(var3 + "<br>");

            var1 = var2;
            var2 = var3;
            var3 = var2 + var1;
            document.write(var3 + "<br>");

            var1 = var2;
            var2 = var3;
            var3 = var2 + var1;
            document.write(var3 + "<br>");
        </script>

        <h1>Operatöerlerin kullanımı</h1>
        <%   int sayi1 = 1453, sayi2 = 1299, sonuc = 0;%>
        Toplama +  operatörü: <% out.println(sonuc = sayi1 + sayi2); %></br>
        Çıkarma - operatörü : <% out.println(sonuc = sayi1 - sayi2);%> </br>
        çarpma * operatörü : <% out.println(sonuc = sayi1 * sayi2);%> </br>
        bölme / operatörü : <% out.println(sonuc = sayi1 / sayi2);%> </br>
        mod % operatörü: <% out.println(sonuc = sayi1 % sayi2);%>
        <h1>Kontrol ifadeerinin kullanımı</h1>
        <% int sayi = 1453;
            String mesaj = "";%>
        we are trying to if 
        <%
            if (sayi == 1453) {
                out.println("istanbulun fetih tarihi: " + sayi + " dır");
            }else {
            out.println("istanbulun fetih tarihi değildir, osmanlının kuruluş tarihidir");
            }
           

        %>

    </body>
</html>
