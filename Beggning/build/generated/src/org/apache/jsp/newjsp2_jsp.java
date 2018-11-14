package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.NewClass;

public final class newjsp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      user.NewClass hesap = null;
      synchronized (_jspx_page_context) {
        hesap = (user.NewClass) _jspx_page_context.getAttribute("hesap", PageContext.PAGE_SCOPE);
        if (hesap == null){
          hesap = new user.NewClass();
          _jspx_page_context.setAttribute("hesap", hesap, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

    NewClass hesap1 = new NewClass();


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
            for (int i = 0; i < 3; i++) {
                    out.print("<tr>");
                    out.print("<td>");
                    out.print((i + 1) + "tl");
                    out.print("</td>");
                    out.print("<td>");
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("hesap"), "tl",
 i + 1);
      out.write("\n");
      out.write("            ");

                    out.print(hesap.dolarCevir());
                    out.print("</td>");
                    out.print("</tr>");
                }

            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                var i = 0;\n");
      out.write("                for (var i = 0; i < 10; i++) {\n");
      out.write("                    document.write(\"Sayi \" + i);\n");
      out.write("                    document.write(\"<br>\");\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("            sondan \n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("            document.write(\"<table width='400' border='1' cellspacing='0'>\");\n");
      out.write("            for(i=0;i<10;i++){\n");
      out.write("                if(i%2==0){\n");
      out.write("                    document.write(\"<tr bgcolor='red'><td>1095</td><td>TÜRK TELEKOM ARENA</td><td>MABED</td></tr>\");\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    document.write(\"<tr bgcolor='yellow'><td>GALATA</td><td>SARAY</td><td>ASKTIR</td>\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            document.write(\"</table>\");\n");
      out.write("        </script>\n");
      out.write("        sondan\n");
      out.write("        <script language=\"Javascript\">\n");
      out.write("            var var1;\n");
      out.write("            var var2;\n");
      out.write("            var var3;\n");
      out.write("            var1=1;\n");
      out.write("            var2=1;\n");
      out.write("            document.write(\"<h4>\");\n");
      out.write("            document.write(var1 + \"<br>\");\n");
      out.write("            document.write(var2 + \"<br>\");\n");
      out.write("            var3=var2+var1;\n");
      out.write("            document.write(var3 + \"<br>\");\n");
      out.write("            \n");
      out.write("             var1=var2;\n");
      out.write("             var2=var3;\n");
      out.write("             var3=var2+var1;\n");
      out.write("             document.write(var3+ \"<br>\");\n");
      out.write("             \n");
      out.write("             var1=var2;\n");
      out.write("             var2=var3;\n");
      out.write("             var3=var2+var1;\n");
      out.write("             document.write(var3 + \"<br>\");\n");
      out.write("             \n");
      out.write("             var1=var2;\n");
      out.write("             var2=var3;\n");
      out.write("             var3=var2+var1;\n");
      out.write("             document.write(var3 + \"<br>\");\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <h1>Operatöerlerin kullanımı</h1>\n");
      out.write("        ");
   int sayi1=1453, sayi2=1299,sonuc=0;
      out.write("\n");
      out.write("        Toplama +  operatörü: ");
 out.println(sonuc=sayi1+sayi2); 
      out.write("</br>\n");
      out.write("        Çıkarma - operatörü : ");
 out.println(sonuc=sayi1-sayi2);
      out.write(" </br>\n");
      out.write("        çarpma * operatörü : ");
 out.println(sonuc=sayi1*sayi2);
      out.write(" </br>\n");
      out.write("        bölme / operatörü : ");
 out.println(sonuc=sayi1/sayi2);
      out.write(" </br>\n");
      out.write("        mod % operatörü: ");
 out.println(sonuc=sayi1%sayi2);
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
