package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BOLETA_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("    <!--\n");
      out.write(".Estilo2 {\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-size: 24px;\n");
      out.write("}\n");
      out.write(".Estilo9 {\n");
      out.write("\tfont-size: x-large;\n");
      out.write("\tcolor: #990066;\n");
      out.write("}\n");
      out.write(".Estilo12 {color: #990066}\n");
      out.write(".Estilo13 {color: #990066; font-weight: bold; font-size: 18px; }\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("   \n");
      out.write("  <table width=\"100%\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("      <td colspan=\"4\" bgcolor=\"#FFCC00\"><div align=\"center\" class=\"Estilo2\">\n");
      out.write("        <p class=\"Estilo9 Estilo12\">COMPA&Ntilde;IA CHEPEN COMPUTER VENTAS ONLINE  </p>\n");
      out.write("        </div></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td width=\"16%\" bgcolor=\"#FFCC33\"><span class=\"Estilo13\"><a href=\"ORDENADORES.jsp\">ORDENADORES</a></span></td>\n");
      out.write("      <td width=\"16%\" bgcolor=\"#FFCC33\"><span class=\"Estilo13\"><a href=\"caracteristicas.jsp\">CARACTERISTICAS</a></span></td>\n");
      out.write("      <td width=\"20%\" bgcolor=\"#FFCC33\">&nbsp;</td>\n");
      out.write("      <td width=\"48%\" bgcolor=\"#FFCC33\"><span class=\"Estilo13\"><a href=\"boleta.jsp\">BOLETA</a></span></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><div align=\"center\"><strong>NOMBRE </strong></div></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield\" />\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><strong>ORDENADOR COMPRADO</strong>  </td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield4\" />\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><div align=\"center\"><strong>APELLIDOS</strong></div></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield2\" />\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><strong>SUBTOTAL</strong></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield5\" />\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><div align=\"center\"><strong>DEPARTAMENTO</strong></div></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("      <select name=\"select\">\n");
      out.write("        <option>LIMA</option>\n");
      out.write("        <option>LA LIBERTAD</option>\n");
      out.write("        <option>CHICLAYO</option>\n");
      out.write("      </select>\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><strong>DESCUENTO</strong></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield6\" />\n");
      out.write("      </label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label><strong>PROVINCIA</strong></label></td>\n");
      out.write("      <input type=\"submit\" bame =\"btnpagar\" value =\"pagar\">\n");
      out.write("          \n");
      out.write("      </input>\n");
      out.write("        <label>\n");
      out.write("        <select name=\"select2\">\n");
      out.write("          <option>CHEPEN</option>\n");
      out.write("        </select>\n");
      out.write("        </label>\n");
      out.write("      <td><strong>NETO A PAGAR       </strong>\n");
      out.write("      </td>\n");
      out.write("        <label>\n");
      out.write("        <input type=\"text\" name=\"textfield7\" />\n");
      out.write("        </label>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><strong>DISTRITO</strong></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"text\" name=\"textfield3\" />\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"submit\" name=\"Submit\" value=\"GRABAR\" />\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\"><label>\n");
      out.write("        <input type=\"submit\" name=\"Submit2\" value=\"ELIMINAR\" />\n");
      out.write("      </label></td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("      <td bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  \n");
      out.write("</form>\n");
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
