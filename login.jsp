<html>
<head>
	<title> Test </title>
	<link href="media/css/Login.css" rel="stylesheet">
	<link href="media/css/offset.css" rel="stylesheet">
	<link href="media/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="media/css/bs-button-style.css" rel="stylesheet">
    <script src="media/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function() {
            $("#header").load("header.html");
        });
    </script>
</head> 
<body>
    <div id="header"></div>

	<div class="main" align="center">
		<div class="container">
            <div class="row voffset20" name="InputForm" id="InputForm">
				<div class="col-xs-4 col-xs-offset-4 text-center">
					<div class="panel panel-primary voffset150">
						<div class="row" name="AppName">
							<div class="col-xs-10 col-xs-offset-1 text-center">
								<h1 id="AppName">App Name</h1>
							</div>
						</div>
                        <div class="alert alert-danger col-xs-10 col-xs-offset-1" role="alert">${error}</div>
					    <form class="row panel-body voffset15" action="Login" method="POST">
							<input type="text" class="col-xs-8 col-xs-offset-2" placeholder="Username" name="username">
							<input type="password" class="col-xs-8 col-xs-offset-2" placeholder="Password" name="password">
							<button type="submit" class="btn btn-primary btn-round col-xs-4 col-xs-offset-4 text-center voffset20">Login</button>
							<div class="checkbox col-xs-8 col-xs-offset-2 text-center"><label><input type="checkbox">Remember me</label></div>
							<div class="row" name="optional">
								<div class="text-center">
									<span class="row text-center">
										<a class="col-xs-6" href="Regist.html">Create Account</a>
										<a class="col-xs-6" href="forgot.html">Forgot the password?</a>
									</span>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="What"></div>
	<div class="What">
		<div class="container">
			<div class="row">
				<div class="col-lg-10 col-xs-offset-1 text-center">
					<h1><b>What is App Name?<b></h1>
				</div>
			</div>
		</div>
	</div>

	<div class="About">
	</div>

	<div class="footer">
		<div class="container-fluid">
			<div class="row">
				<small class="col-xs-6 col-xs-offset-3 text-center small">Copyright © 2018 AppName Inc. All rights reserved.</small>
			</div>
		</div>
	</div>

	<script src="media/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script>
		$(function() {
			$('#moveAbout').on('click' function() {
				var targetTop = $('#About').offset.top;
				$('#targetTop div').html(targetTop);
				$('html, body').animate({
					scrollTop: targetTop
				}, 500);
			});
		});
	</script>
</body>
</html>
