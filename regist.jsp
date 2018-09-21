<!DOCTYPE html>
<html>
  <head>
    <title>Regist</title>
    <link href="media/css/Regist.css" rel="stylesheet" />
    <link href="media/css/offset.css" rel="stylesheet" />
    <link href="media/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" />
    <link href="media/css/bs-button-style.css" rel="stylesheet" />
    <script src="media/js/jquery-3.3.1.min.js"></script>
    <script>
      $(function() {
        $("#header").load("header.html");
      });
    </script>
  </head>
  <body>
    <div id="header"></div>
    <div align="center" class="voffset100">
      <h2>Regist</h2>
      <form action="Regist" method="POST">
        <p><input type="text" placeholder="Username" name="username"></p>
        <p><input type="text" placeholder="Email" name="email"></p>
        <p><input type="text" placeholder="Age" name="age"></p>
        <p><input type="text" placeholder="Location" name="location"></p>
        <p><input type="password" placeholder="Password" name="password"></p>
        <p><input type="password" placeholder="Password(Confirmation)" name="confirm"></p>
        <p><button type="submit">Submit</button></p>
      </form>
    </div>
  </body>
</html>
