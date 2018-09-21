<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<% 
  HttpSession s = request.getSession();
  if (s.getAttribute("login") == null) response.sendRedirect("UnknownUser.html");
%>
<jsp:useBean id="userbean" class="Bee.UserBean" scope="session" />
<%
  Bee.ContributionAccessor ca = new Bee.ContributionAccessor();
  ca.execute();
  List<Bee.Contribution> contributionList = ca.getContributionList();
%>
<html>
<head>
  <title>MainMenu</title>
  <link href="media/css/Login.css" rel="stylesheet">
	<link href="media/css/offset.css" rel="stylesheet">
	<link href="media/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="media/css/bs-button-style.css" rel="stylesheet">
  <link rel="stylesheet" href="media/DataTables/datatables.min.css"/>
  <script src="media/js/jquery-3.3.1.min.js"></script>
  <script src="media/DataTables/datatables.min.js"></script>
  <script>
    $(function() {
      $("#header").load("header.html");
    });
  </script>
  <script>
    $(function() {
      $("#contribution-table").DataTable();
    });
  </script>
</head>
<body>
    <div id="header"></div>
    
    <div class="container-fluid">
        <div class="row voffset70">
            <div class="col-xs-2" id="userinfo-col">
                <div class="panel panel-info" id="userinfo-panel">
                    <div class="row" id="username-row">
                        <div class="col-xs-8 col-xs-offset-2 text-center">
                            <h3><jsp:getProperty name="userbean" property="name" /></h3>
                        </div>
                    </div>  <!-- username-row -->
                    <div class="row voffset10" id="userimg-row">
                        <div class="col-xs-8 col-xs-offset-2 text-center panel panel-default">
                            <div class="row">
                                <a href="/myapp/Profile.html"><img class="col-xs-10 col-xs-offset-1 text-center voffset10" src="media/img/user.png" width="100" height="100"></a>
                            </div>
                        </div>
                    </div>  <!-- userimg-row -->
                    <div class="row" id="infotbl-row">
                        <div class="col-xs-8 col-xs-offset-2 text-center" id="infotbl-col">
                            <table style="border: none;" width="110">
                                <tbody>
                                    <tr>
                                        <td width="100"><h5>ID</h5></td>
                                        <td width="100"><h5>:</h5></td>
                                        <td><h5><span name="userID"><jsp:getProperty name="userbean" property="id" /></span></h5></td>
                                    </tr>
                                    <tr>
                                        <td width="100"><h5>Age</h5></td>
                                        <td width="100"><h5>:</h5></td>
                                        <td><h5><span name="userAge"><jsp:getProperty name="userbean" property="age" /></span></h5></td>
                                    </tr>
                                    <tr>
                                        <td width="100"><h5>Location</h5></td>
                                        <td width="100"><h5>:</h5></td>
                                        <td><h5><span name="userLocation"><jsp:getProperty name="userbean" property="location" /></span></h5></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>  <!-- infotbl-col -->
                    </div>  <!-- infotbl-row -->
                    <div class="row" id="infomore-row">
                        <div class="col-xs-8 col-xs-offset-2 text-center" id="infomore-col">
                            <h5><a href="/myapp/MoreProfileServlet">more</a></h5>
                        </div>  <!-- infomore-col -->
                    </div>  <!-- infomore-row -->
                </div>  <!-- userinfo-panel -->
            </div>  <!-- userinfo-col -->
            
            <div class="col-xs-7" id="maincontents-col">
                <div class="panel panel-info">
                    <div class="panel-body">
                      <table id="contribution-table">
                        <thead>
                          <tr><td>title</td></tr>
                        </thead>
                        <tbody>
                          <%
                            for (Bee.Contribution c : contributionList) {
                          %>
                            <tr><td><%= c.getTitle() %></td></tr>
                          <%
                            }
                          %>
                        </tbody>
                      </table>
                    </div>
                </div>
            </div>  <!-- maincontents-col -->

            <div class="col-xs-3" id="message-col">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <a href="/myapp/Message.html">Message<span class="badge" style="margin-left:5px">99</span></a>
                    </div>
                    <div class="panel-body">
                        <div class="col-xs-10 text-left">
                            <ul class="media-list">
                                <li class="media">
                                    <a class="media-left" href="#">
                                        <img src="media/img/user.png" width="30" height="30">
                                    </a>
                                    <div class="media-body">
                                        <h3 class="media-heading">Title</h3>
                                        Body
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div class="col-xs-8 col-xs-offset-2 text-center">
                            <a href="/myapp/Message.html">more</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
