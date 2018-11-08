<%-- 
    Document   : newjsp1
    Created on : Nov 5, 2018, 12:01:05 PM
    Author     : root
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script scr="">

        </script>
        <title>Homework</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <style>
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
    </style>
    <body style="background-image:url('back.jpg');width:auto;height:auto">

        <%
            String isim=null;
            if (request.getParameter("gonder") != null) {
                
                 isim=request.getParameter("name");
                
                out.print(request.getParameter("name"));
                out.print(request.getParameter("Surname"));
            }else{
                out.print("bilgileri giriniz");
            }
        %>

        <div class="form" >
            <form action="newjsp1.jsp" method="get"> 
                <fieldset style="border: 2px solid yellow">
                    NAME:<br>
                    <input type="text" name="name"> <br>
                    SURNAME:<br>
                    <input type="text" name="Surname"><br>
                    <input type="submit" value="submit" name="gonder"><br>

                    <input type="radio" name="gender" value="male" checked>Male<br>
                    <input type="radio" name="gender" value="female">Female<br>
                    <input type="radio" name="gender" value="trans">Other<br>

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
                        <option value="istanbul">istanbul</option>
                        <option value="istanbul"> <%= isim %> </option>

                    </select>
                </fieldset>
            </form>
        </div>

    </body>
</html>
