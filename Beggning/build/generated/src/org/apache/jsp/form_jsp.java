package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title>Homework</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("           color:yellow;\n");
      out.write("        }\n");
      out.write("        table{\n");
      out.write("            border: 2px solid red;\n");
      out.write("            border-collapse: collapse\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1{\n");
      out.write("            text-align: center;\n");
      out.write("            color: yellow;\n");
      out.write("            font-size: 8vm;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        .form{\n");
      out.write("            color: yellow;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .checkboxs{\n");
      out.write("            float:center;\n");
      out.write("            text-align:center;\n");
      out.write("        }\n");
      out.write("        .formum{\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body -- style=\"background-image:url('back.jpg');width:auto;height:auto\" >\n");
      out.write("      \n");
      out.write("    <center>\n");
      out.write("        <div class=\"formum\">\n");
      out.write("            <form action=\"newjsp.jsp\" method=\"post\">\n");
      out.write("                <table style=\"width:75%;\">\n");
      out.write("                    <th>\n");
      out.write("                        Başvuru formu:\n");
      out.write("                    </th>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Adı:\n");
      out.write("                            <input type=\"ad\" name=\"adal\" value=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Soyadı:\n");
      out.write("                            <input type=\"soyadı\" name=\"soyadal\" value=\"\">  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Doğum tarihi:\n");
      out.write("                            <input type=\"date\" name=\"dogumtarihi\" max=\"2018-11-06\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Cinsiyet:\n");
      out.write("                            <input type=\"radio\" name=\"cinsiyet\" value=\"male\" checked> Erkek\n");
      out.write("                            <input type=\"radio\" name=\"cinsiyet\" value=\"female\"> Kadın\n");
      out.write("                            <input type=\"radio\" name=\"cinsiyet\" value=\"other\"> Diğer</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Doğum Yeri:\n");
      out.write("                            <select name=\"broncity\">\n");
      out.write("\n");
      out.write("                                ");

                                    File file = new File("C:\\Users\\root\\Documents\\GitHub\\NetBeansProjects\\Beggning\\web\\yazi\\sehirler.txt");
                                    FileReader fileReader = new FileReader(file);
                                    BufferedReader bf = new BufferedReader(fileReader);
                                    while (bf.ready()) {
                                        String sehir = bf.readLine();
                                        out.print("<option value=\"" + sehir + "\">" + sehir + "</option>");
                                    }
                                
      out.write("\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Yabancı Diller:\n");
      out.write("                            <input type=\"checkbox\" name=\"dil\" value=\"İngilizce\">İngilizce\n");
      out.write("                            <input type=\"checkbox\" name=\"dil\" value=\"Türkçe\">Türkçe\n");
      out.write("                            <input type=\"checkbox\" name=\"dil\" value=\"ispanyolca\">ispanyolca</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Tel no:\n");
      out.write("                            <input type=\"text\" name=\"telefonno\" placeholder=\"555 555 55 55\" max=\"10\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                            Eklemek istedikleriniz:</tr></td>\n");
      out.write("                            <tr><td>\n");
      out.write("                            <textarea name=\"ekelennbilgiler\" value=\"\" rows=\"10\" cols=\"30\" placeholder=\"max 300 karakter\">\n");
      out.write("                            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>\n");
      out.write("                        <input type=\"submit\" value=\"submit\" name=\"gonder\"></tr></td>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>                \n");
      out.write("        <script>\n");
      out.write("            var tarih = new Date();\n");
      out.write("            var yıl = tarih.getFullYear();\n");
      out.write("            var ay = tarih.getMonth();\n");
      out.write("            var gün = tarih.getDay();\n");
      out.write("            var saat = tarih.getHours();\n");
      out.write("            var dakika = tarih.getMinutes();\n");
      out.write("            var saniye = tarih.getSeconds();\n");
      out.write("            document.write(gün + \"/\" + ay + \"/\" + yıl + \"<br>\" + saat + \":\" + dakika + \":\" + saniye + \"<br>\");\n");
      out.write("\n");
      out.write("            var userAgent = navigator.userAgent;\n");
      out.write("            var opera = (userAgent.indexOf('Opera') != -1);\n");
      out.write("            var ie = (userAgent.indexOf('MSIE') != -1);\n");
      out.write("            var gecko = (userAgent.indexOf('Gecko') != -1);\n");
      out.write("            var netscape = (userAgent.indexOf('Mozilla') != -1);\n");
      out.write("            var ch = (userAgent.indexOf('Chrome') != -1);\n");
      out.write("            var version = navigator.appVersion;\n");
      out.write("\n");
      out.write("            if (opera) {\n");
      out.write("                document.write(\"Opera based browser\");\n");
      out.write("                // Keep your opera specific URL here.\n");
      out.write("            } else if (gecko) {\n");
      out.write("                document.write(\"Mozilla based browser\");\n");
      out.write("                // Keep your gecko specific URL here.\n");
      out.write("            } else if (ie) {\n");
      out.write("                document.write(\"IE based browser\");\n");
      out.write("                // Keep your IE specific URL here.\n");
      out.write("            } else if (netscape) {\n");
      out.write("                document.write(\"Netscape based browser\");\n");
      out.write("                // Keep your Netscape specific URL here.\n");
      out.write("            } else if (ch) {\n");
      out.write("                document.write(\"Chrome based browser\");\n");
      out.write("                // Keep your Netscape specific URL here.\n");
      out.write("            } else {\n");
      out.write("                document.write(\"Unknown browser\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
