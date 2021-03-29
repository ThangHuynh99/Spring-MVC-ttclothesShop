<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" http-equiv="Content-Type"
	content="width=device-width, initial-scale=1, shrink-to-fit=no, text/html">
<title>Register</title>

</head>
<body>
	<h1 style="color: #808080">
		WELCOME TO TTCLOTHES SHOP
	</h1>
	<div class="container justify-content-center">
		<div class="Login-box justify-content-center">
			<div class="row">
				<div class="col-md-6 login-right">
					<h2 style="color: black">Register</h2>
					<c:if test="${param.userNameExist != null}">
						<div class="alert alert-danger ">
							<p class="justify-content-center">Please choose another username !</p>
						</div>
					</c:if>

<!-- <script>
	function myFunction() {
		alert("alo");
	}
</script> -->

					<form type="submit" method="post" action="<c:url value='/check_register'/>">
						<div class="form-group">
							<label style="color: black">Your fullname</label> <input type="text"
								name="j_username" value="" placeholder="Fullname"
								class="form-control">
						</div>

						<div class="form-group">
							<label style="color: black">Username</label> <input
								type="text" name="j_password" value="" placeholder="Username"
								class="form-control">
						</div>

						<div class="form-group">
							<label style="color: black">Password</label> <input
								type="password" name="j_password" value="" placeholder="Password"
								class="form-control">
						</div>

						<!-- <input type="hidden" value="" id="page" name="page" /> -->
						<div>
							<input type="submit" name="submit" value="register" />
							<button>
								<a style="width: 25px; height: 25px" href='<c:url value="/login"/>'>Login</a>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="social-media">
		<a href="#" class="s"><i class="fab fa-facebook"></i></a>
		<a href="#" class="s"><i class="fab fa-twitter"></i></a>
		<a href="#" class="s"><i class="fab fa-whatsapp"> </i></a>
		<a href="#" class="s"><i class="fab fa-instagram"></i></a>
		<a href="#" class="s"><i class="fab fa-youtube"></i></a>
	</div>
</body>
</html>