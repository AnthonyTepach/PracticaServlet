package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"HandheldFriendly\" content=\"True\">\n");
      out.write("        <meta name=\"MobileOptimized\" content=\"320\">\n");
      out.write("        <title>Registro</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/registar.js\"></script>\n");
      out.write("        <link href=\"css/concise.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h3>Registro de usuarios</h3>\n");
      out.write("        <form method=\"post\" action=\"SrvAlumno\" name=\"FormAlum\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Datos personales</legend>\n");
      out.write("                <p>Fotografia: <input type=\"file\" name=\"avatar\"/></p>\n");
      out.write("                <p>Matricula: <input type=\"text\" name=\"txtmatricula\" onkeypress =\"return justNumbers(event);\"/></p>\n");
      out.write("                <p>Nombre: <input type=\"text\" name=\"txtnombre\"/></p>\n");
      out.write("                <p>Apellido paterno: <input type=\"text\" name=\"txtapat\"/></p>\n");
      out.write("                <p>Apellido materno: <input type=\"text\" name=\"txtamat\"/></p>\n");
      out.write("                <p>Contraseña: <input type=\"text\" name=\"txtpass\"/></p>\n");
      out.write("                <p>Confirma contraseña: <input type=\"text\" name=\"txtpass2\"/></p>\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Datos de contacto</legend>\n");
      out.write("                <p>Telefono fijo: <input type=\"text\" name=\"txtfijo\" onkeypress =\"return justNumbers(event);\"/></p>\n");
      out.write("                <p>Telefono celular: <input type=\"text\" name=\"txtcel\" onkeypress =\"return justNumbers(event);\"/></p>\n");
      out.write("                <p>E-mail: <input type=\"text\" name=\"txtemail\" onkeypress=\"validarEmail();\"/></p>\n");
      out.write("            </fieldset>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Datos academicos</legend>\n");
      out.write("                <p>Carrera: <select name=\"carrera\">\n");
      out.write("                        <option>DTIC</option>\n");
      out.write("                        <option>DBID</option>\n");
      out.write("                        <option>DADM</option>\n");
      out.write("                        <option>DPRO</option>\n");
      out.write("                        <option>DELA</option>\n");
      out.write("                    </select><br><br></p>\n");
      out.write("                <p>Catrimestre: <select name=\"cuatri\">\n");
      out.write("                        <option>Primer</option>\n");
      out.write("                        <option>Segundo</option>\n");
      out.write("                        <option>Tercer</option>\n");
      out.write("                        <option>Cuarto</option>\n");
      out.write("                        <option>Quinto</option>\n");
      out.write("                        <option>Sexto</option>\n");
      out.write("                        <option>Septimo</option>\n");
      out.write("                        <option>Octavo</option>\n");
      out.write("                        <option>Noveno</option>\n");
      out.write("                        <option>Decimo</option>\n");
      out.write("                    </select> </p>\n");
      out.write("                <p>Turno: <select name=\"turno\">\n");
      out.write("                        <option>Matutino</option>\n");
      out.write("                        <option>Vespertino</option>\n");
      out.write("                    </select></p>\n");
      out.write("            </fieldset>\n");
      out.write("            <input type=\"submit\" value=\"Ingresa\"/>\n");
      out.write("        </form>\n");
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
