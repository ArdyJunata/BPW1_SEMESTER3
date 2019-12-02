package org.apache.jsp.Pertemuan8.Modul8.Latihan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Pertemuan8/Modul8/Latihan/header.html");
    _jspx_dependants.add("/Pertemuan8/Modul8/Latihan/home.html");
    _jspx_dependants.add("/Pertemuan8/Modul8/Latihan/footer.html");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<style type=\"text/css\">\n");
      out.write("    .text-style {\n");
      out.write("        font-size: 20px;\n");
      out.write("        background-color: cadetblue;\n");
      out.write("        padding: 20px;\n");
      out.write("    }\n");
      out.write("    .img-style {\n");
      out.write("        background-color: antiquewhite;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .footer {\n");
      out.write("        background-color: cadetblue;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("    .header {\n");
      out.write("        padding: 30px;\n");
      out.write("        width: 1000px;\n");
      out.write("        background-color: beige;\n");
      out.write("        margin: 0;\n");
      out.write("    }\n");
      out.write("    .content {\n");
      out.write("        padding: 30px;\n");
      out.write("        width: 1000px;\n");
      out.write("        background-color: beige;\n");
      out.write("        margin: 0;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .content p {\n");
      out.write("        font-size: 20px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <div class=\"img-style\">\n");
      out.write("        <img src=\"header.jpg\" height=\"350\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"text-style\">    \n");
      out.write("        <a href=\"index.jsp\">Home </a>|\n");
      out.write("        <a href=\"about.jsp\">About Us </a>|\n");
      out.write("        <a href=\"services.jsp\">Services </a>|\n");
      out.write("        <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("    </div>\n");
      out.write("</center>");
      out.write("\n");
      out.write("        ");
      out.write("<center>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2>\n");
      out.write("            Selamat Datang di Jaya Bengkel\n");
      out.write("        </h2>\n");
      out.write("        <p>\n");
      out.write("            Bengkel PAG adalah bengkel Service Mesin dan Body Repair mobil yang berdiri sejak tahun 2002 di Ayani Utara Denpasar. Ditunjang oleh lahan yang memadai, staff yang kompeten, bahan yang berkualitas serta peralatan canggih maka kualitas pekerjaan Bengkel PAG menjadi lebih optimal.\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            Dengan komitmen, kerja keras, pelayanan yang terus innovatif sehingga Bengkel PAG terus merambah dunia yang lebih luas untuk melebarkan jaringan bisnis serta aktifitas usaha guna meningkatkan pelayanan bagi para relasi & mitra kerja. One Stop Service yang memuaskan serta didukung oleh 3K (Ketat Kontrol Kwalitas) adalah spirit Bengkel PAG. Bengkel PAG menerima pelanggan baik individual maupun mobil pribadi, asuransi pribadi, mobil operasional perusahaan dan instansi perusahaan.\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</center>");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"footer\">   \n");
      out.write("    <center>\n");
      out.write("        <p>CopyrightÂ©2019 | Muhammad Ardy Junata</p>\n");
      out.write("    </center>\n");
      out.write("</div>");
      out.write("\n");
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
