<%-- 
    Document   : form
    Created on : Nov 5, 2018, 11:45:00 AM
    Author     : root
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="iso-8859-9"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>

        <title>Homework</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <style>
        body{
           color:yellow;
        }
        table{
            border: 2px solid red;
            border-collapse: collapse
            
            
        }

        h1{
            text-align: center;
            color: yellow;
            font-size: 8vm;
            padding: 15px;
        }
        .form{
            color: yellow;

        }
        .checkboxs{
            float:center;
            text-align:center;
        }
        .formum{


        }
    </style>
    <body -- style="background-image:url('back.jpg');width:auto;height:auto" >
      
    <center>
        <div class="formum">
            <form action="newjsp.jsp" method="post">
                <table style="width:75%;">
                    <th>
                        Baþvuru formu:
                    </th>
                    <tr>
                        <td>
                            Adý:
                            <input type="ad" name="adal" value=""></td>
                    </tr>
                    <tr><td>
                            Soyadý:
                            <input type="soyadý" name="soyadal" value="">  </td>
                    </tr>
                    <tr><td>
                            Doðum tarihi:
                            <input type="date" name="dogumtarihi" max="2018-11-06"></td>
                    </tr>
                    <tr><td>
                            Cinsiyet:
                            <input type="radio" name="cinsiyet" value="male" checked> Erkek
                            <input type="radio" name="cinsiyet" value="female"> Kadýn
                            <input type="radio" name="cinsiyet" value="other"> Diðer</td>
                    </tr>
                    <tr><td>
                            Doðum Yeri:
                            <select name="broncity">

                                <%
                                    File file = new File("C:\\Users\\root\\Documents\\GitHub\\NetBeansProjects\\Beggning\\web\\yazi\\sehirler.txt");
                                    FileReader fileReader = new FileReader(file);
                                    BufferedReader bf = new BufferedReader(fileReader);
                                    while (bf.ready()) {
                                        String sehir = bf.readLine();
                                        out.print("<option value=\"" + sehir + "\">" + sehir + "</option>");
                                    }
                                %>
                            </select></td>
                    </tr>
                    <tr><td>
                            Yabancý Diller:
                            <input type="checkbox" name="dil" value="Ýngilizce">Ýngilizce
                            <input type="checkbox" name="dil" value="Türkçe">Türkçe
                            <input type="checkbox" name="dil" value="ispanyolca">ispanyolca</td>
                    </tr>
                    <tr><td>
                            Tel no:
                            <input type="text" name="telefonno" placeholder="555 555 55 55" max="10"></td>
                    </tr>
                    <tr><td>
                            Eklemek istedikleriniz:</tr></td>
                            <tr><td>
                            <textarea name="ekelennbilgiler" value="" rows="10" cols="30" placeholder="max 300 karakter">
                            </textarea></td>
                    </tr>
                    <tr><td>
                        <input type="submit" value="submit" name="gonder"></tr></td>
                </table>
            </form>
        </div>                
        <script>
            var tarih = new Date();
            var yýl = tarih.getFullYear();
            var ay = tarih.getMonth();
            var gün = tarih.getDay();
            var saat = tarih.getHours();
            var dakika = tarih.getMinutes();
            var saniye = tarih.getSeconds();
            document.write(gün + "/" + ay + "/" + yýl + "<br>" + saat + ":" + dakika + ":" + saniye + "<br>");

            var userAgent = navigator.userAgent;
            var opera = (userAgent.indexOf('Opera') != -1);
            var ie = (userAgent.indexOf('MSIE') != -1);
            var gecko = (userAgent.indexOf('Gecko') != -1);
            var netscape = (userAgent.indexOf('Mozilla') != -1);
            var ch = (userAgent.indexOf('Chrome') != -1);
            var version = navigator.appVersion;

            if (opera) {
                document.write("Opera based browser");
                // Keep your opera specific URL here.
            } else if (gecko) {
                document.write("Mozilla based browser");
                // Keep your gecko specific URL here.
            } else if (ie) {
                document.write("IE based browser");
                // Keep your IE specific URL here.
            } else if (netscape) {
                document.write("Netscape based browser");
                // Keep your Netscape specific URL here.
            } else if (ch) {
                document.write("Chrome based browser");
                // Keep your Netscape specific URL here.
            } else {
                document.write("Unknown browser");
            }
        </script>
    </center>
</body>
</html>
