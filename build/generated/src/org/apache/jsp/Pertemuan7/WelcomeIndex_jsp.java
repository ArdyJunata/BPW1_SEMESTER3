package org.apache.jsp.Pertemuan7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class WelcomeIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
    Date dtToday = cal.getTime();

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
      out.write('\n');
      out.write('\n');
 cal.add(Calendar.WEEK_OF_YEAR, 1);
Date dtNextWeek = cal.getTime();

cal.setTime(new Date());
cal.add(Calendar.WEEK_OF_YEAR, -1);
Date dtPrevWeek = cal.getTime();

cal.setTime(new Date());
cal.add(Calendar.MONTH, 1);
Date dtNextMonth = cal.getTime();

cal.setTime(new Date());
cal.add(Calendar.MONTH, -1);
Date dtPrevMonth = cal.getTime();

DateFormat fd = DateFormat.getDateInstance(DateFormat.FULL);
DateFormat ft = DateFormat.getDateInstance(DateFormat.FULL);


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Time & Date</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Informasi Waktu</h1>\n");
      out.write("        <h2>[");
      out.print(ft.format(dtToday));
      out.write("]</h2>\n");
      out.write("        \n");
      out.write("        <font size=\"3\">\n");
      out.write("            <p>\n");
      out.write("                <i>Minggu Depan :</i>\n");
      out.write("                <b>[");
      out.print(fd.format(dtNextWeek));
      out.write("]</b>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <i>Minggu Lalu :</i>\n");
      out.write("                <b>[");
      out.print(fd.format(dtPrevWeek));
      out.write("]</b>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <i>Bulan Depan :</i>\n");
      out.write("                <b>[");
      out.print(fd.format(dtNextMonth));
      out.write("]</b>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <i>Bulan Lalu :</i>\n");
      out.write("                <b>[");
      out.print(fd.format(dtPrevMonth));
      out.write("]</b>\n");
      out.write("            </p>\n");
      out.write("        </font>\n");
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
