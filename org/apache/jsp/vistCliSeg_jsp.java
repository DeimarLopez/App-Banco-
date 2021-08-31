/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-08-31 20:50:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vistCliSeg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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


    HttpSession obju=request.getSession();
    String usuario= ((String) obju.getAttribute("usuario")).toLowerCase();
    String name= (String) obju.getAttribute("name");
    String gen= (String) obju.getAttribute("genero");
    String rol= (String) obju.getAttribute("rol");
    String documento= (String) obju.getAttribute("documento");
    String saludo;
    if(gen.equals("M")){
     saludo="Bienvenido señor " + name;
    }else{
     saludo="Bienvenida señorita " + name;
    }
    if(usuario==null){
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"normalize.css\">\n");
      out.write("    <link rel=\"icon\" href=\"img/LOGO-02.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"stiley-dist.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=KoHo:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <title>Sanco</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header headertwo\">\n");
      out.write("        <div class=\"header__logo\">\n");
      out.write("            <a href=\"vistCliMain.jsp\">\n");
      out.write("                <div class=\"logo__header\">\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"header__nav nav2\">\n");
      out.write("            <a href=\"vistCliSeg.jsp\">Seguridad</a>\n");
      out.write("            <a href=\"vistCliTrans.jsp\">Trasnsferir</a>\n");
      out.write("            <a href=\"vistCliCon.jsp\">Consignar</a>\n");
      out.write("            <a href=\"vistCliRet.jsp\">Reitirar</a>\n");
      out.write("            <a href=\"vistCliAct.jsp\">Mis Datos</a>\n");
      out.write("            <a href=\"vistCliCre.jsp\">Mis Credit</a>\n");
      out.write("            <a href=\"vistCliLi.jsp\">Creditos</a>\n");
      out.write("            <a href=\"#ingreso\">\n");
      out.write("                <form action=\"ServletCerrar\">\n");
      out.write("                    <input type=\"submit\" name=\"cerrar\" value=\"Salir\" class=\"salir\">\n");
      out.write("                </form>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <section class=\"container\" id=\"inicio\">\n");
      out.write("        <section class=\"contenedor4 new\" id=\"ingreso\">\n");
      out.write("            <div class=\"form__contenedor4\">\n");
      out.write("                <form autocomplete=\"off\" action=\"/Bancoapp/ServletInsertarUsuario\" method=\"post\" class=\"formlogin\">\n");
      out.write("                    <h3>Security</h3>\n");
      out.write("                    <label for=\"usuario\">New user</label>\n");
      out.write("                    <input type=\"text\" id=\"usu\" placeholder=\"");
      out.print(usuario);
      out.write("\" name=\"newusu\" required>\n");
      out.write("                    <label for=\"password\">New password</label>\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"newpassword\" required>\n");
      out.write("                    <input type=\"hidden\" name=\"documento\" value=\"");
      out.print(documento);
      out.write("\" required>\n");
      out.write("                    <input type=\"submit\" name=\"btnCliNew\" class=\"btn\" value=\"Modificar\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"derechos\">\n");
      out.write("            <p class=\"name__footer\">© 2021 Sanco. Todos los derechos reservados. Sanco es una marca registrada.</p>\n");
      out.write("            <p>Usuario : ");
      out.print(rol);
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
