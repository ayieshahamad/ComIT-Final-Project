/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-02 06:29:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/loggedInMenuBar.html", Long.valueOf(1535869471236L));
    _jspx_dependants.put("/header.html", Long.valueOf(1534921763156L));
    _jspx_dependants.put("/footer.html", Long.valueOf(1535179893260L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("    <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     ");
      out.write("<div style=\"background-color: #008B8B; color:FFFFFF; height:150px; margin-left : 35px; margin-right : 35px\">\r\n");
      out.write("\r\n");
      out.write("<h1 style=\"margin-left: 40px ; \">Online Market Place</h1>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("     <div style= \"height:500px; margin-left : 35px; margin-right : 35px; margin-top:10px;\">\r\n");
      out.write("\r\n");
      out.write("         <!--Remaining section-->\r\n");
      out.write("          ");
      out.write("<button id=\"b1\" type=\"submit\" form=\"form1\" value=\"Submit\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Home</b></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button type=\"submit\" form=\"searchForm\" value=\"Search\"  class=\" material-icons w3-button w3-round w3-border w3-border-teal\" style=\"float:right; color:#008B8B\"><b>search</b></button>\r\n");
      out.write("<input value=\"Search\" form=\"searchForm\" type=\"text\" name=\"search\"  style=\"float:right; width:300px; height:40px; margin-right:5;\" class=\"w3-round w3-border w3-border-teal\"/>\r\n");
      out.write("\r\n");
      out.write("<a href=\"post_Ad.jsp\" value=\"Post Ad\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Post Ad</b></a>\r\n");
      out.write("<!--<button type=\"submit\" form=\"postAd\" value=\"Post Ad\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Post Ad</b></button>-->\r\n");
      out.write("<div class=\"w3-dropdown-hover\">\r\n");
      out.write("\r\n");
      out.write("    <button type=\"submit\" value=\"user\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\r\n");
      out.write("        <input type=\"submit\" class=\"w3-bar-item w3-button\" form=\"form_myprofile\" value=\"My Profile\" id=\"profile_button\"/>\r\n");
      out.write("        <input type=\"submit\" class=\"w3-bar-item w3-button\" form=\"form_myad\" value=\"My Ads\" id=\"ads_button\"/>\r\n");
      out.write("        <input type=\"submit\" class=\"w3-bar-item w3-button\" form=\"form_logout\" value=\"Logout\" id=\"logout_button\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<form action=\"SearchAd\" method=\"post\" id=\"searchForm\"></form>\r\n");
      out.write("<form action=\"PostAd\" method=\"get\" id=\"postAd\"></form>\r\n");
      out.write("<form action=\"MyProfile\" method=\"get\" id=\"form_myprofile\"></form>\r\n");
      out.write("<form action=\"MyAds\" method=\"get\" id=\"form_myad\"></form>\r\n");
      out.write("<form action=\"UserFunctionality\" method=\"get\" id=\"form_logout\"></form>\r\n");
      out.write("<form action=\"myhome\" method=\"post\" id=\"form1\"> </form>\r\n");
      out.write("\r\n");
      out.write("          <h3> Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h3>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"w3-dropdown-hover\">\r\n");
      out.write("          <button type=\"submit\" value=\"sort\" class=\"w3-button w3-border \" style=\"color:#008B8B\"><b>Sort by:</b></button>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\r\n");
      out.write("                  <a href=\"http://localhost:8080/myhome?sort=date\" type=\"submit\" class=\"w3-bar-item w3-button\"  value=\"Date\" id=\"date\">Date</a>\r\n");
      out.write("                  <a href=\"http://localhost:8080/myhome?sort=price\" type=\"submit\" class=\"w3-bar-item w3-button\"  value=\"Price\" id=\"price\">Price</a>\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("          <div style=\"margin-left:30;\">\r\n");
      out.write("             ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AllAds}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write("    <!-- ");
      out.write("<div  style=\"background-color: #008B8B; color:FFFFFF; height:35px; margin-left : 35px; margin-right : 35px\">\r\n");
      out.write("\r\n");
      out.write("    <p></p>\r\n");
      out.write("</div>\r\n");
      out.write("-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
