/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2021-05-09 02:28:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/E:/SPRING%20COURSE/TTClothes%20Shop%20(Spring-MVC)/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/spring-security-taglibs-3.2.8.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1437576592000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1616084389987L));
    _jspx_dependants.put("jar:file:/E:/SPRING%20COURSE/TTClothes%20Shop%20(Spring-MVC)/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/E:/SPRING%20COURSE/TTClothes%20Shop%20(Spring-MVC)/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-3.2.8.RELEASE.jar", Long.valueOf(1612546868701L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1611216242178L));
    _jspx_dependants.put("jar:file:/E:/SPRING%20COURSE/TTClothes%20Shop%20(Spring-MVC)/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-mvc/WEB-INF/lib/spring-webmvc-4.3.13.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1511752906000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.13.RELEASE.jar", Long.valueOf(1611216240564L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1597850220145L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" http-equiv=\"Content-Type\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no, text/html\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Home page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Start Slider -->\r\n");
      out.write("\t<div id=\"slides-shop\" class=\"cover-slides\">\r\n");
      out.write("\t\t<ul class=\"slides-container\">\r\n");
      out.write("\t\t\t<li class=\"text-left\"><img src=\"images/banner-01.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Ch??o m???ng t???i <br> TTClothes Shop\r\n");
      out.write("\t\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\">Shop New</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t<li class=\"text-center\"><img src=\"images/banner-02.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Ch??o m???ng t???i <br> TTClothes Shop\r\n");
      out.write("\t\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\">Shop New</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t<li class=\"text-right\"><img src=\"images/banner-03.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"m-b-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Ch??o m???ng t???i <br> TTClothes Shop\r\n");
      out.write("\t\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\">Shop New</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"slides-navigation\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"next\"><i class=\"fa fa-angle-right\"\r\n");
      out.write("\t\t\t\taria-hidden=\"true\"></i></a> <a href=\"#\" class=\"prev\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-angle-left\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Slider -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Categories  -->\r\n");
      out.write("\t<div class=\"categories-shop\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<!-- data m???u\t -->\r\n");
      out.write("\t\t\t\t<!-- <div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/t-shirts-img.jpg\" alt=\"\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn hvr-hover\" href=\"#\">T-shirts</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/shirt-img.jpg\" alt=\"\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn hvr-hover\" href=\"#\">Shirt</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/wallet-img.jpg\" alt=\"\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn hvr-hover\" href=\"#\">Wallet</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/women-bag-img.jpg\" alt=\"\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn hvr-hover\" href=\"#\">Bags</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/shoes-img.jpg\" alt=\"\" /> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn hvr-hover\" href=\"#\">Shoes</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/women-shoes-img.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn hvr-hover\" href=\"#\">Women Shoes</a>\r\n");
      out.write("\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t<!-- \t</div> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Categories -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Products  -->\r\n");
      out.write("\t<div class=\"products-box\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"title-all text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h1>Featured Products</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t\t\t\t\t\tSed sit amet lacus enim.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"special-menu text-center\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"button-group filter-button-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"active\" data-filter=\"*\">All</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button data-filter=\".top-featured\">Top featured</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button data-filter=\".best-seller\">Best seller</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row special-list\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 special-grid best-seller\">\r\n");
      out.write("\t\t\t\t\t<div class=\"products-single fix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-img-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"type-lb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"sale\">Sale</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/img-pro-01.jpg\" class=\"img-fluid\" alt=\"Image\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mask-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Compare\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-sync-alt\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Add to Wishlist\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart\" href=\"#\">Add to Cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"why-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Lorem ipsum dolor sit amet</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>$7.79</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 special-grid top-featured\">\r\n");
      out.write("\t\t\t\t\t<div class=\"products-single fix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-img-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"type-lb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"new\">New</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/img-pro-02.jpg\" class=\"img-fluid\" alt=\"Image\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mask-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Compare\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-sync-alt\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Add to Wishlist\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart\" href=\"#\">Add to Cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"why-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Lorem ipsum dolor sit amet</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>$9.79</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 special-grid top-featured\">\r\n");
      out.write("\t\t\t\t\t<div class=\"products-single fix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-img-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"type-lb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"sale\">Sale</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/img-pro-03.jpg\" class=\"img-fluid\" alt=\"Image\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mask-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Compare\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-sync-alt\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Add to Wishlist\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart\" href=\"#\">Add to Cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"why-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Lorem ipsum dolor sit amet</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>$10.79</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 special-grid best-seller\">\r\n");
      out.write("\t\t\t\t\t<div class=\"products-single fix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-img-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"type-lb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"sale\">Sale</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/img-pro-04.jpg\" class=\"img-fluid\" alt=\"Image\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mask-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"View\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Compare\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fas fa-sync-alt\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Add to Wishlist\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart\" href=\"#\">Add to Cart</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"why-text\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Lorem ipsum dolor sit amet</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h5>$15.79</h5>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Products  -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Start Blog  -->\r\n");
      out.write("\t<div class=\"latest-blog\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"title-all text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h1>latest blog</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n");
      out.write("\t\t\t\t\t\t\tSed sit amet lacus enim.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-lg-4 col-xl-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"blog-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/blog-img.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"title-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Fusce in augue non nisi fringilla</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Nulla ut urna egestas, porta libero id, suscipit orci.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tQuisque in lectus sit amet urna dignissim feugiat. Mauris\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmolestie egestas pharetra. Ut finibus cursus nunc sed mollis.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPraesent laoreet lacinia elit id lobortis.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"option-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Likes\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Views\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Comments\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-comments\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-lg-4 col-xl-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"blog-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/blog-img-01.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"title-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Fusce in augue non nisi fringilla</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Nulla ut urna egestas, porta libero id, suscipit orci.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tQuisque in lectus sit amet urna dignissim feugiat. Mauris\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmolestie egestas pharetra. Ut finibus cursus nunc sed mollis.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPraesent laoreet lacinia elit id lobortis.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"option-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Likes\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Views\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Comments\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-comments\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-lg-4 col-xl-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"blog-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/blog-img-02.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"blog-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"title-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Fusce in augue non nisi fringilla</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Nulla ut urna egestas, porta libero id, suscipit orci.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tQuisque in lectus sit amet urna dignissim feugiat. Mauris\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmolestie egestas pharetra. Ut finibus cursus nunc sed mollis.\r\n");
      out.write("\t\t\t\t\t\t\t\t\tPraesent laoreet lacinia elit id lobortis.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"option-blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Likes\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-heart\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Views\"><i class=\"fas fa-eye\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-placement=\"right\" title=\"Comments\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"far fa-comments\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Blog  -->\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/web/home.jsp(80,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/views/web/home.jsp(80,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/web/home.jsp(80,4) '${catalog}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${catalog}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
            out.write("\t\t\t\t\t\t<div class=\"shop-cat-box\">\r\n");
            out.write("\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getCatalogImage()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" />\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<a class=\"btn hvr-hover\" href='");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.getCatalogName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a>\r\n");
            out.write("\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/web/home.jsp(84,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("productURL");
      // /WEB-INF/views/web/home.jsp(84,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/collection/${item.getCatalogCode() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          _jspx_push_body_count_c_005fforEach_005f0[0]++;
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005furl_005f0);
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t ");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005furl_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_c_005fforEach_005f0[0]--;
        }
      }
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
