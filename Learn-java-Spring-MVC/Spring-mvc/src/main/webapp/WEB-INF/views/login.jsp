<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" http-equiv="Content-Type"
	content="width=device-width, initial-scale=1, shrink-to-fit=no, text/html">
<title>Login</title>

</head>
<body>
	<h1 style="color: #808080">
		WELCOME TO TTCLOTHES SHOP
	</h1>
	<div class="container justify-content-center">
		<div class="Login-box justify-content-center">
			<div class="row">
				<div class="col-md-6 login-right">
					<h2 style="color: black">Login</h2>
					<c:if test="${param.incorrectAccount != null}">
						<div class="alert alert-danger ">
							<p class="justify-content-center">Username or password is incorrect!</p>
						</div>
					</c:if>
					
					<c:if test="${param.accessDenied != null}">
						<div class="alert alert-danger ">
							<p class="justify-content-center">You have not permission!</p>
						</div>
					</c:if>

					<form type="submit" method="post" action="<c:url value='/j_spring_security_check'/>">
						<div class="form-group">
							<label style="color: black">Username</label> <input type="text"
								name="j_username" value="" placeholder="Username"
								class="form-control">
						</div>

						<div class="form-group">
							<label style="color: black">Password</label> <input
								type="password" name="j_password" value="" placeholder="Password"
								class="form-control">
						</div>

						<div class="form-group">
							<input type="checkbox" name="remember"> <label
								style="color: black">Remember me</label>
						</div>

						<!-- <input type="hidden" value="" id="page" name="page" /> -->
						<div>
							<input type="submit" name="submit" value="login" />
							<button>
								<a style="width: 25px; height: 25px" href='<c:url value="/register"/>'>Register</a>
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="social-media">
		<a href="#"><i class="fab fa-facebook"></i></a> <a href="#"><i
			class="fab fa-twitter"></i></a> <a href="#"><i
			class="fab fa-whatsapp"></i></a> <a href="#"><i
			class="fab fa-instagram"></i></a> <a href="#"><i
			class="fab fa-youtube"></i></a>
	</div>
</body>
</html>