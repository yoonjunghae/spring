/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-22 04:50:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<style>\n");
      out.write("button {\n");
      out.write("	width: 200px;\n");
      out.write("	height: 150px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- use scott;       \n");
      out.write("         \n");
      out.write(" CREATE TABLE REPLY (\n");
      out.write("    ID int auto_increment primary key,\n");
      out.write("    ORIID int,\n");
      out.write("    CONTENT VARCHAR(500),\n");
      out.write("    WRITER VARCHAR (10) NOT NULL,\n");
      out.write("     FOREIGN KEY (ORIID) REFERENCES BOARD(NO),\n");
      out.write("     FOREIGN KEY (WRITER) REFERENCES MEMBER(ID)\n");
      out.write(");        \n");
      out.write("      -->    \n");
      out.write("         \n");
      out.write("	<a href=\"bbs_mvc2.jsp\">\n");
      out.write("		bbs_mvc2\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("		<a href=\"ajax2.jsp\">\n");
      out.write("		 컴퓨터구매1\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"ajax3.jsp\">\n");
      out.write("		컴퓨터구매2\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"ajax4.jsp\">\n");
      out.write("		영화예메\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"callJson_mvc1.jsp\">\n");
      out.write("		callJson_mvc1\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"callJson_mvc2.jsp\">\n");
      out.write("		callJson_mvc2\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"callJson_mvc2_db.jsp\">\n");
      out.write("		callJson_mvc2_db.jsp\n");
      out.write("	</a>\n");
      out.write("		<br>\n");
      out.write("	<a href=\"kakao_map_one.jsp\">\n");
      out.write("		kakao_map_one\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	\n");
      out.write("	<!--  CREATE TABLE mymap (\n");
      out.write("    location VARCHAR(100),\n");
      out.write("    lat VARCHAR (100),\n");
      out.write("    lon VARCHAR (100)\n");
      out.write(");         -->\n");
      out.write("	<a href=\"kakao_map_one2_db.jsp\">\n");
      out.write("		kakao_map_one2_db\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	<a href=\"kakao_map_multi.jsp\">\n");
      out.write("		kakao_map_multi\n");
      out.write("	</a>\n");
      out.write("	<br>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("\n");
      out.write("	\n");
      out.write("\n");
      out.write("	<br>\n");
      out.write("	<a href=\" weather.jsp\">\n");
      out.write("		날씨테스트\n");
      out.write("	</a>\n");
      out.write("	\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<a href=\" weather2.jsp\">\n");
      out.write("		날씨테스트2\n");
      out.write("	</a>\n");
      out.write("</body>\n");
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
