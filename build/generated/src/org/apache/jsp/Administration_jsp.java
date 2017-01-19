package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Administration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/EnteteAdmin.html");
    _jspx_dependants.add("/Footer.html");
  }

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
      out.write("    ");
      out.write("\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Gestion de notes </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"gentelella/vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"gentelella/vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link href=\"gentelella/vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <link href=\"gentelella/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- jVectorMap -->\n");
      out.write("    <link href=\"gentelella/production/css/maps/jquery-jvectormap-2.0.3.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"gentelella/build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Gestion de notes</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <!-- menu profile quick info -->\n");
      out.write("            <div class=\"profile\">\n");
      out.write("              <div class=\"profile_pic\">\n");
      out.write("                <img src=\"gentelella/production/images/img.jpg\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"profile_info\">\n");
      out.write("                <span>Welcome,</span>\n");
      out.write("                <h2>John Doe</h2>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <!-- sidebar menu -->\n");
      out.write("            <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("              <div class=\"menu_section\">\n");
      out.write("                <h3>General</h3>\n");
      out.write("                <ul class=\"nav side-menu\">\n");
      out.write("                    <li><a href=\"\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("                  <li><a><i class=\"fa fa-edit\"></i>Niveaux<span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"form.html\">Liste</a></li>\n");
      out.write("                      <li><a href=\"form_advanced.html\">Nouveau</a></li>                  \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a><i class=\"fa fa-desktop\"></i>Groupes<span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"form.html\">Liste</a></li>\n");
      out.write("                      <li><a href=\"form_advanced.html\">Nouveau</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a><i class=\"fa fa-table\"></i> Enseignants <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"form.html\">Liste</a></li>\n");
      out.write("                      <li><a href=\"form_advanced.html\">Nouveau</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"\"><i class=\"fa fa-bar-chart-o\"></i> Inscription</a>\n");
      out.write("                    \n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"menu_section\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("            <div class=\"sidebar-footer hidden-small\">\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\n");
      out.write("                <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\n");
      out.write("                <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\">\n");
      out.write("                <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("        <div class=\"top_nav\">\n");
      out.write("          <div class=\"nav_menu\">\n");
      out.write("            <nav>\n");
      out.write("              <div class=\"nav toggle\">\n");
      out.write("                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"gentelella/production/images/img.jpg\" alt=\"\">Administrator\n");
      out.write("                    <span class=\" fa fa-angle-down\"></span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"login.html\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                    <span class=\"badge bg-green\">6</span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul id=\"menu1\" class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\">\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"gentelella/production/images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"gentelella/production/images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <a>\n");
      out.write("                        <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                        <span>\n");
      out.write("                          <span>John Smith</span>\n");
      out.write("                          <span class=\"time\">3 mins ago</span>\n");
      out.write("                        </span>\n");
      out.write("                        <span class=\"message\">\n");
      out.write("                          Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                        </span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                      <div class=\"text-center\">\n");
      out.write("                        <a>\n");
      out.write("                          <strong>See All Alerts</strong>\n");
      out.write("                          <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <h1>Hello Admin</h1>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("</div>\n");
      out.write("        <!-- /page content -->\n");
      out.write("\n");
      out.write("        <!-- footer content -->\n");
      out.write("        <footer>\n");
      out.write("          <div class=\"pull-right\">\n");
      out.write("            Gentelella - Bootstrap Admin Template by <a href=\"https://colorlib.com\">Colorlib</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"gentelella/vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"gentelella/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"gentelella/vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"gentelella/vendors/nprogress/nprogress.js\"></script>\n");
      out.write("    <!-- Chart.js -->\n");
      out.write("    <script src=\"gentelella/vendors/Chart.js/dist/Chart.min.js\"></script>\n");
      out.write("    <!-- gauge.js -->\n");
      out.write("    <script src=\"gentelella/vendors/gauge.js/dist/gauge.min.js\"></script>\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <script src=\"gentelella/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"gentelella/vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("    <!-- Skycons -->\n");
      out.write("    <script src=\"gentelella/vendors/skycons/skycons.js\"></script>\n");
      out.write("    <!-- Flot -->\n");
      out.write("    <script src=\"gentelella/vendors/Flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"gentelella/vendors/Flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"gentelella/vendors/Flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script src=\"gentelella/vendors/Flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"gentelella/vendors/Flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <!-- Flot plugins -->\n");
      out.write("    <script src=\"gentelella/production/js/flot/jquery.flot.orderBars.js\"></script>\n");
      out.write("    <script src=\"gentelella/production/js/flot/date.js\"></script>\n");
      out.write("    <script src=\"gentelella/production/js/flot/jquery.flot.spline.js\"></script>\n");
      out.write("    <script src=\"gentelella/production/js/flot/curvedLines.js\"></script>\n");
      out.write("    <!-- jVectorMap -->\n");
      out.write("    <script src=\"gentelella/production/js/maps/jquery-jvectormap-2.0.3.min.js\"></script>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <script src=\"gentelella/production/js/moment/moment.min.js\"></script>\n");
      out.write("    <script src=\"gentelella/production/js/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"gentelella/build/js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Flot -->\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        var data1 = [\n");
      out.write("          [gd(2012, 1, 1), 17],\n");
      out.write("          [gd(2012, 1, 2), 74],\n");
      out.write("          [gd(2012, 1, 3), 6],\n");
      out.write("          [gd(2012, 1, 4), 39],\n");
      out.write("          [gd(2012, 1, 5), 20],\n");
      out.write("          [gd(2012, 1, 6), 85],\n");
      out.write("          [gd(2012, 1, 7), 7]\n");
      out.write("        ];\n");
      out.write("\n");
      out.write("        var data2 = [\n");
      out.write("          [gd(2012, 1, 1), 82],\n");
      out.write("          [gd(2012, 1, 2), 23],\n");
      out.write("          [gd(2012, 1, 3), 66],\n");
      out.write("          [gd(2012, 1, 4), 9],\n");
      out.write("          [gd(2012, 1, 5), 119],\n");
      out.write("          [gd(2012, 1, 6), 6],\n");
      out.write("          [gd(2012, 1, 7), 9]\n");
      out.write("        ];\n");
      out.write("        $(\"#canvas_dahs\").length && $.plot($(\"#canvas_dahs\"), [\n");
      out.write("          data1, data2\n");
      out.write("        ], {\n");
      out.write("          series: {\n");
      out.write("            lines: {\n");
      out.write("              show: false,\n");
      out.write("              fill: true\n");
      out.write("            },\n");
      out.write("            splines: {\n");
      out.write("              show: true,\n");
      out.write("              tension: 0.4,\n");
      out.write("              lineWidth: 1,\n");
      out.write("              fill: 0.4\n");
      out.write("            },\n");
      out.write("            points: {\n");
      out.write("              radius: 0,\n");
      out.write("              show: true\n");
      out.write("            },\n");
      out.write("            shadowSize: 2\n");
      out.write("          },\n");
      out.write("          grid: {\n");
      out.write("            verticalLines: true,\n");
      out.write("            hoverable: true,\n");
      out.write("            clickable: true,\n");
      out.write("            tickColor: \"#d5d5d5\",\n");
      out.write("            borderWidth: 1,\n");
      out.write("            color: '#fff'\n");
      out.write("          },\n");
      out.write("          colors: [\"rgba(38, 185, 154, 0.38)\", \"rgba(3, 88, 106, 0.38)\"],\n");
      out.write("          xaxis: {\n");
      out.write("            tickColor: \"rgba(51, 51, 51, 0.06)\",\n");
      out.write("            mode: \"time\",\n");
      out.write("            tickSize: [1, \"day\"],\n");
      out.write("            //tickLength: 10,\n");
      out.write("            axisLabel: \"Date\",\n");
      out.write("            axisLabelUseCanvas: true,\n");
      out.write("            axisLabelFontSizePixels: 12,\n");
      out.write("            axisLabelFontFamily: 'Verdana, Arial',\n");
      out.write("            axisLabelPadding: 10\n");
      out.write("          },\n");
      out.write("          yaxis: {\n");
      out.write("            ticks: 8,\n");
      out.write("            tickColor: \"rgba(51, 51, 51, 0.06)\",\n");
      out.write("          },\n");
      out.write("          tooltip: false\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function gd(year, month, day) {\n");
      out.write("          return new Date(year, month - 1, day).getTime();\n");
      out.write("        }\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <!-- /Flot -->\n");
      out.write("\n");
      out.write("    <!-- jVectorMap -->\n");
      out.write("    <script src=\"js/maps/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("    <script src=\"js/maps/jquery-jvectormap-us-aea-en.js\"></script>\n");
      out.write("    <script src=\"js/maps/gdp-data.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function(){\n");
      out.write("        $('#world-map-gdp').vectorMap({\n");
      out.write("          map: 'world_mill_en',\n");
      out.write("          backgroundColor: 'transparent',\n");
      out.write("          zoomOnScroll: false,\n");
      out.write("          series: {\n");
      out.write("            regions: [{\n");
      out.write("              values: gdpData,\n");
      out.write("              scale: ['#E6F2F0', '#149B7E'],\n");
      out.write("              normalizeFunction: 'polynomial'\n");
      out.write("            }]\n");
      out.write("          },\n");
      out.write("          onRegionTipShow: function(e, el, code) {\n");
      out.write("            el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <!-- /jVectorMap -->\n");
      out.write("\n");
      out.write("    <!-- Skycons -->\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("        var icons = new Skycons({\n");
      out.write("            \"color\": \"#73879C\"\n");
      out.write("          }),\n");
      out.write("          list = [\n");
      out.write("            \"clear-day\", \"clear-night\", \"partly-cloudy-day\",\n");
      out.write("            \"partly-cloudy-night\", \"cloudy\", \"rain\", \"sleet\", \"snow\", \"wind\",\n");
      out.write("            \"fog\"\n");
      out.write("          ],\n");
      out.write("          i;\n");
      out.write("\n");
      out.write("        for (i = list.length; i--;)\n");
      out.write("          icons.set(list[i], list[i]);\n");
      out.write("\n");
      out.write("        icons.play();\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <!-- /Skycons -->\n");
      out.write("\n");
      out.write("    <!-- Doughnut Chart -->\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function(){\n");
      out.write("        var options = {\n");
      out.write("          legend: false,\n");
      out.write("          responsive: false\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        new Chart(document.getElementById(\"canvas1\"), {\n");
      out.write("          type: 'doughnut',\n");
      out.write("          tooltipFillColor: \"rgba(51, 51, 51, 0.55)\",\n");
      out.write("          data: {\n");
      out.write("            labels: [\n");
      out.write("              \"Symbian\",\n");
      out.write("              \"Blackberry\",\n");
      out.write("              \"Other\",\n");
      out.write("              \"Android\",\n");
      out.write("              \"IOS\"\n");
      out.write("            ],\n");
      out.write("            datasets: [{\n");
      out.write("              data: [15, 20, 30, 10, 30],\n");
      out.write("              backgroundColor: [\n");
      out.write("                \"#BDC3C7\",\n");
      out.write("                \"#9B59B6\",\n");
      out.write("                \"#E74C3C\",\n");
      out.write("                \"#26B99A\",\n");
      out.write("                \"#3498DB\"\n");
      out.write("              ],\n");
      out.write("              hoverBackgroundColor: [\n");
      out.write("                \"#CFD4D8\",\n");
      out.write("                \"#B370CF\",\n");
      out.write("                \"#E95E4F\",\n");
      out.write("                \"#36CAAB\",\n");
      out.write("                \"#49A9EA\"\n");
      out.write("              ]\n");
      out.write("            }]\n");
      out.write("          },\n");
      out.write("          options: options\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <!-- /Doughnut Chart -->\n");
      out.write("    \n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("\n");
      out.write("        var cb = function(start, end, label) {\n");
      out.write("          console.log(start.toISOString(), end.toISOString(), label);\n");
      out.write("          $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var optionSet1 = {\n");
      out.write("          startDate: moment().subtract(29, 'days'),\n");
      out.write("          endDate: moment(),\n");
      out.write("          minDate: '01/01/2012',\n");
      out.write("          maxDate: '12/31/2015',\n");
      out.write("          dateLimit: {\n");
      out.write("            days: 60\n");
      out.write("          },\n");
      out.write("          showDropdowns: true,\n");
      out.write("          showWeekNumbers: true,\n");
      out.write("          timePicker: false,\n");
      out.write("          timePickerIncrement: 1,\n");
      out.write("          timePicker12Hour: true,\n");
      out.write("          ranges: {\n");
      out.write("            'Today': [moment(), moment()],\n");
      out.write("            'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],\n");
      out.write("            'Last 7 Days': [moment().subtract(6, 'days'), moment()],\n");
      out.write("            'Last 30 Days': [moment().subtract(29, 'days'), moment()],\n");
      out.write("            'This Month': [moment().startOf('month'), moment().endOf('month')],\n");
      out.write("            'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]\n");
      out.write("          },\n");
      out.write("          opens: 'left',\n");
      out.write("          buttonClasses: ['btn btn-default'],\n");
      out.write("          applyClass: 'btn-small btn-primary',\n");
      out.write("          cancelClass: 'btn-small',\n");
      out.write("          format: 'MM/DD/YYYY',\n");
      out.write("          separator: ' to ',\n");
      out.write("          locale: {\n");
      out.write("            applyLabel: 'Submit',\n");
      out.write("            cancelLabel: 'Clear',\n");
      out.write("            fromLabel: 'From',\n");
      out.write("            toLabel: 'To',\n");
      out.write("            customRangeLabel: 'Custom',\n");
      out.write("            daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],\n");
      out.write("            monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],\n");
      out.write("            firstDay: 1\n");
      out.write("          }\n");
      out.write("        };\n");
      out.write("        $('#reportrange span').html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));\n");
      out.write("        $('#reportrange').daterangepicker(optionSet1, cb);\n");
      out.write("        $('#reportrange').on('show.daterangepicker', function() {\n");
      out.write("          console.log(\"show event fired\");\n");
      out.write("        });\n");
      out.write("        $('#reportrange').on('hide.daterangepicker', function() {\n");
      out.write("          console.log(\"hide event fired\");\n");
      out.write("        });\n");
      out.write("        $('#reportrange').on('apply.daterangepicker', function(ev, picker) {\n");
      out.write("          console.log(\"apply event fired, start/end dates are \" + picker.startDate.format('MMMM D, YYYY') + \" to \" + picker.endDate.format('MMMM D, YYYY'));\n");
      out.write("        });\n");
      out.write("        $('#reportrange').on('cancel.daterangepicker', function(ev, picker) {\n");
      out.write("          console.log(\"cancel event fired\");\n");
      out.write("        });\n");
      out.write("        $('#options1').click(function() {\n");
      out.write("          $('#reportrange').data('daterangepicker').setOptions(optionSet1, cb);\n");
      out.write("        });\n");
      out.write("        $('#options2').click(function() {\n");
      out.write("          $('#reportrange').data('daterangepicker').setOptions(optionSet2, cb);\n");
      out.write("        });\n");
      out.write("        $('#destroy').click(function() {\n");
      out.write("          $('#reportrange').data('daterangepicker').remove();\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("    <!-- /bootstrap-daterangepicker -->\n");
      out.write("\n");
      out.write("    <!-- gauge.js -->\n");
      out.write("    <script>\n");
      out.write("      var opts = {\n");
      out.write("          lines: 12,\n");
      out.write("          angle: 0,\n");
      out.write("          lineWidth: 0.4,\n");
      out.write("          pointer: {\n");
      out.write("              length: 0.75,\n");
      out.write("              strokeWidth: 0.042,\n");
      out.write("              color: '#1D212A'\n");
      out.write("          },\n");
      out.write("          limitMax: 'false',\n");
      out.write("          colorStart: '#1ABC9C',\n");
      out.write("          colorStop: '#1ABC9C',\n");
      out.write("          strokeColor: '#F0F3F3',\n");
      out.write("          generateGradient: true\n");
      out.write("      };\n");
      out.write("      var target = document.getElementById('foo'),\n");
      out.write("          gauge = new Gauge(target).setOptions(opts);\n");
      out.write("\n");
      out.write("      gauge.maxValue = 6000;\n");
      out.write("      gauge.animationSpeed = 32;\n");
      out.write("      gauge.set(3200);\n");
      out.write("      gauge.setTextField(document.getElementById(\"gauge-text\"));\n");
      out.write("    </script>\n");
      out.write("    <!-- /gauge.js -->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
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
