/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-02 02:34:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/header.html", Long.valueOf(1534921763156L));
    _jspx_dependants.put("/loggedOutMenuBar.html", Long.valueOf(1535855027560L));
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
      out.write("    <head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<div style=\"background-color: #008B8B; color:FFFFFF; height:150px; margin-left : 35px; margin-right : 35px\">\r\n");
      out.write("\r\n");
      out.write("<h1 style=\"margin-left: 40px ; \">Online Market Place</h1>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        <div style= \"height:400px; margin-left : 35px; margin-right : 35px; margin-top:10px;\">\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write("<button id=\"b1\" type=\"submit\" form=\"form1\" value=\"Submit\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Home</b></button>\r\n");
      out.write("<button id=\"b2\" type=\"submit\" form=\"form2\" value=\"Submit\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Login</b></button>\r\n");
      out.write("<button id=\"b3\" type=\"submit\" form=\"form3\" value=\"Submit\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>Register</b></button>\r\n");
      out.write("<button id=\"b4\" type=\"submit\" form=\"form4\" value=\"Submit\" class=\"w3-button w3-round w3-border w3-border-teal\" style=\"color:#008B8B\"><b>About</b></button>\r\n");
      out.write("\r\n");
      out.write("<button type=\"submit\" form=\"searchForm\" value=\"Search\"  class=\" material-icons w3-button w3-round w3-border w3-border-teal\" style=\"float:right; color:#008B8B\"><b>search</b></button>\r\n");
      out.write("<input value=\"Search\" type=\"text\" name=\"search\"  style=\"float:right; width:300px; height:40px; margin-right:5;\" class=\"w3-round w3-border w3-border-teal\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"home\" method=\"get\" id=\"form1\"> </form>\r\n");
      out.write("<form action=\"login\" method=\"get\" id=\"form2\"> </form>\r\n");
      out.write("<form action=\"register\" method=\"get\" id=\"form3\"> </form>\r\n");
      out.write("<form action=\"about\" method=\"get\" id=\"form4\"> </form>\r\n");
      out.write("<form action=\"SearchAd\" method=\"post\" id=\"searchForm\"></form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--Remaining section-->\r\n");
      out.write("            <p id = \"message\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("            <form action=\"register\" method=\"post\" onsubmit=\"return myFunction()\">\r\n");
      out.write("                <table style=\"color:black;\" >\r\n");
      out.write("                    <tr><td><h3>Register</h3></td></tr>\r\n");
      out.write("                    <tr><td>First Name</td>\r\n");
      out.write("                        <td><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" name=\"firstName\" style=\"width:300px; height:30px\" class=\"w3-round w3-border \" required=\"required\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td>Last Name</td>\r\n");
      out.write("                        <td><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" name=\"lastName\" style=\"width:300px; height:30px\" class=\"w3-round w3-border \" required=\"required\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td>Email</td>\r\n");
      out.write("                        <td><input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"email\" name=\"email_ID\" style=\"width:300px; height:30px\" class=\"w3-round w3-border \" required=\"required\" pattern=\"^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td>Password</td>\r\n");
      out.write("                        <td><input type=\"password\" name=\"password\" id=\"password\" style=\"width:300px; height:30px\" class=\"w3-round w3-border \" required=\"required\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td>Confirm Password</td>\r\n");
      out.write("                        <td><input type=\"password\" name=\"confirmpassword\" id=\"confirmpassword\" data-match=\"#password\" style=\"width:300px; height:30px\" class=\"w3-round w3-border \" required=\"required\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr><td></td>\r\n");
      out.write("                        <td><input id=\"registerButton\" style=\"width:300px;\" class=\"w3-btn w3-blue-grey\" type=\"submit\" value=\"Register\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("<div  style=\"background-color: #008B8B; color:FFFFFF; height:35px; margin-left : 35px; margin-right : 35px\">\r\n");
      out.write("\r\n");
      out.write("    <p></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <!--<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>-->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("            function myFunction() {\r\n");
      out.write("                var password1 = document.getElementById(\"password\").value;\r\n");
      out.write("                var password2 = document.getElementById(\"confirmpassword\").value;\r\n");
      out.write("                var ok = true;\r\n");
      out.write("                if (password1 != password2) {\r\n");
      out.write("                    //alert(\"Passwords Do not match\");\r\n");
      out.write("                    //document.getElementById(\"password\").style.backgroundColor = \"red\";\r\n");
      out.write("                    //document.getElementById(\"confirmpassword\").style.borderColor = \"red\";\r\n");
      out.write("                    document.getElementById('message').style.color = 'red';\r\n");
      out.write("                    document.getElementById('message').innerHTML = 'Password do not match';\r\n");
      out.write("                    ok = false;\r\n");
      out.write("                }\r\n");
      out.write("                return ok;\r\n");
      out.write("            }\r\n");
      out.write("        </script>;\r\n");
      out.write("    </body>\r\n");
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
