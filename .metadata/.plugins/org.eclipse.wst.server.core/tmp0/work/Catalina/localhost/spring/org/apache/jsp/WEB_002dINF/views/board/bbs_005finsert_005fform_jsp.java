/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-10 02:45:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bbs_005finsert_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	//alert('게시판글쓰기 페이지입니다. 반갑습니다.!')\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body { /* 컨트롤 + / - 자동주석, 태그선택! */\n");
      out.write("	background: #037BFC;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("	background: #18DE02;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".t1 { /* .은 클래스 선택!, 여러개선택!  */\n");
      out.write("	background: yellow;\n");
      out.write("	width: 150px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#b1 { /* #은 아이디 선택!, 특정한 것 한 개만 선택! */\n");
      out.write("	color: red;\n");
      out.write("}\n");
      out.write("#b2{\n");
      out.write("	color: blue;\n");
      out.write("	\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menubar.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"content\">\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"innerOuter\">\n");
      out.write("	<hr>\n");
      out.write("<!-- no, title, content, writer 게시판글쓰기  -->\n");
      out.write("	<h3>게시판 글쓰기 페이지</h3>\n");
      out.write("	<hr>\n");
      out.write("	<a href=\"bbs\">\n");
      out.write("		<button id=\"b1\">첫페이지로</button>\n");
      out.write("	</a>\n");
      out.write("	<form action=\"insert\" method = \"post\">\n");
      out.write("		<table border=\"1\">\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"t1\">번호 :</td>\n");
      out.write("				<td><input name=\"no\" disabled></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"t1\">제목 :</td>\n");
      out.write("				<td><input name=\"title\"></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"t1\">내용 :</td>\n");
      out.write("				<td><input name=\"content\"></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td class=\"t1\">작성자 :</td>\n");
      out.write("				<td><input name=\"writer\"></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<td colspan=\"2\" class=\"t1\">\n");
      out.write("					<button id=\"b2\">게시판 글쓰기 데이터 전송</button>\n");
      out.write("				</td>\n");
      out.write("			</tr>\n");
      out.write("		</table>\n");
      out.write("	</form>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	        </div>\n");
      out.write("        <br><br>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- 이쪽에 푸터바 포함할꺼임 -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
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
