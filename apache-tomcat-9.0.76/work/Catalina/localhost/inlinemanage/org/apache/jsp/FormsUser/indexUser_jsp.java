/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-30 15:51:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.FormsUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.UsuarioVo;
import model.UsuarioDao;

public final class indexUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/FormsUser/../plantillas/header.jsp", Long.valueOf(1690731958000L));
    _jspx_dependants.put("/FormsUser/../plantillas/footer2.jsp", Long.valueOf(1690732054000L));
    _jspx_dependants.put("/FormsUser/../plantillas/footer.jsp", Long.valueOf(1690732120000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.UsuarioVo");
    _jspx_imports_classes.add("model.UsuarioDao");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>InLineManage</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/index1.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/mains.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/indexModule.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/8232721784.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Caveat&family=Concert+One&family=Oxygen&family=Playfair:ital,wght@0,300;1,500&family=Wix+Madefor+Display:wght@800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <header>\r\n");
      out.write("        <img src=\"assets/img/LogoInterline.PNG\" alt=\"LogoInterline\" class=\"logo\">\r\n");
      out.write("        <h1 class=\"nameInterline\">INTERLINE COMUNICACIONES</h1>\r\n");
      out.write("        <div class=\"menuUser\">\r\n");
      out.write("            <div id=\"iconUser\">\r\n");
      out.write("                <i class=\"fa-solid fa-user\" style=\"color: #000000;\" ></i>\r\n");
      out.write("            </div>  \r\n");
      out.write("            <div class=\"userOptions\">\r\n");
      out.write("                <h3>Bienvenido</h3>\r\n");
      out.write("                <a href=\"ControllerInline?enviar=index\" class=\"linkMenu\">Cerrar sesión</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<main class=\"main\">  \r\n");
      out.write("    <div class=\"content1\">\r\n");
      out.write("        <div class=\"options\">\r\n");
      out.write("            <div class=\"backlog\">\r\n");
      out.write("                <a href=\"ControllerInline?enviar=main\"><img src=\"assets/img/back.PNG\" alt=\"backlog\" class=\"backlog\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"btn\" id=\"btnInsertUser\">Agregar</button>\r\n");
      out.write("            <input type=\"text\" placeholder=\"buscar\" class=\"inputSearch\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content2\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
 List<UsuarioVo> users = null;
            try {
                users = new UsuarioDao().listar();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
 if (users != null && !users.isEmpty()) { 
      out.write("\r\n");
      out.write("            <table class=\"");
      out.print((users.size() > 8) ? "" : "few-rows");
      out.write("\">\r\n");
      out.write("                <tr class=\"title-table\">\r\n");
      out.write("                    <th colspan=\"7\">USUARIOS</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th rowspan=\"2\">Tipo Documento</th>\r\n");
      out.write("                    <th rowspan=\"2\">Nombre</th>\r\n");
      out.write("                    <th rowspan=\"2\">Apellido</th>\r\n");
      out.write("                    <th rowspan=\"2\">Correo</th>\r\n");
      out.write("                    <th rowspan=\"2\">Rol</th>\r\n");
      out.write("                    <th colspan=\"2\">Acciones</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        Actualizar\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        Eliminar\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
 for (UsuarioVo user : users) { 
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( user.getTipoDoc() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( user.getNombre() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( user.getApellido() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( user.getCorreo() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( user.getIdRol() );
      out.write("</td>\r\n");
      out.write("                    <td class=\"iconCenter\"><a href=\"ControllerInline?enviar=updateUser&idUsuario=");
      out.print( user.getIdUsuario() );
      out.write("\"><img src=\"https://img.icons8.com/ios/100/000000/refresh--v1.png\" alt=\"refresh--v1\" class=\"iconUpdate\"/></a></td>\r\n");
      out.write("                    <td class=\"iconCenter\"><a href=\"ControllerInline?enviar=deleteUser&idUsuario=");
      out.print( user.getIdUsuario() );
      out.write("\"><img height=\"30\" src=\"https://img.icons8.com/ios/100/000000/delete--v1.png\" alt=\"delete--v1\" class=\"iconDelete\"/></a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("                <p>No se encontraron usuarios.</p>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form\">\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("</main>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<footer>\r\n");
      out.write("    <p>Todos los derechos reservados a InterlineComunicaciones &copy; 2023<p>\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"assets/js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"assets/js/insertUser.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
