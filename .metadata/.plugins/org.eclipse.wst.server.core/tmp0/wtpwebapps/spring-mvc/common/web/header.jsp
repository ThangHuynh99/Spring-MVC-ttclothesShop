<%@ page import="com.laptrinhjavaweb.util.SecurityUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Start Main Top -->
<style>
.logo {
	display: block;
	max-width: 250px;
	max-height: 95px;
	width: auto;
	height: auto;
}
</style>
<div class="main-top">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="text-slid-box">
					<div id="offer-box" class="carouselTicker">
						<ul class="offer-box">
							<li><i class="fab fa-opencart"></i> Off 10%! Shop Now Man</li>
							<li><i class="fab fa-opencart"></i> 50% - 80% off on Fashion
							</li>
							<li><i class="fab fa-opencart"></i> 20% off Entire Purchase
								Promo code: offT20</li>
							<li><i class="fab fa-opencart"></i> Off 50%! Shop Now</li>
							<li><i class="fab fa-opencart"></i> Off 10%! Shop Now Man</li>
							<li><i class="fab fa-opencart"></i> 50% - 80% off on Fashion
							</li>
							<li><i class="fab fa-opencart"></i> 20% off Entire Purchase
								Promo code: offT20</li>
							<li><i class="fab fa-opencart"></i> Off 50%! Shop Now</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">

				<div class="right-phone-box">
					<p>
						Call US :- <a href="#"> +84 090 54 89 20</a>
					</p>
				</div>
				<div class="our-link">
					<ul>
						<security:authorize access="isAnonymous()">
							<li><a href='<c:url value="/login"/> '>Login</a></li>
							<li><a href='<c:url value="/register"/> '>Register</a></li>
							<li><a href="#">Contact Us</a></li>
						</security:authorize>
						<security:authorize access="isAuthenticated()">
							<li><a href="#">Xin chào, <%=SecurityUtils.getPrincipal().getFullName()%></a></li>
							<li><a href='<c:url value="/logout"/> '>Logout</a></li>
							<li><a href="#">Contact Us</a></li>
						</security:authorize>
					</ul>



					

				</div>
			</div>
		</div>
	</div>
</div>
<!-- End Main Top -->

<!-- Start Main Top -->
<header class="main-header"> <!-- Start Navigation --> <nav
	class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
<div class="container">
	<!-- Start Header Navigation -->
	<div class="navbar-header">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbar-menu" aria-controls="navbars-rs-food"
			aria-expanded="false" aria-label="Toggle navigation">
			<i class="fa fa-bars"></i>
		</button>
		<a class="navbar-brand" 10px href="index.html"><img
			src="<c:url value = "" />" class="logo" alt=""></a>
	</div>
	<!-- End Header Navigation -->

	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="navbar-menu">
		<ul class="nav navbar-nav ml-auto" data-in="fadeInDown"
			data-out="fadeOutUp">
			<li class="nav-item active"><a class="nav-link"
				href='<c:url value="/home" />'>Home</a></li>
			<li class="nav-item"><a class="nav-link" href="about.html">About
					Us</a></li>
			<li class="dropdown"><a href="#"
				class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
				<ul class="dropdown-menu">
					<li><a href='<c:url value="/cart" /> '>Cart</a></li>
					<li><a href=<c:url value="#" />>Checkout</a></li>
					<li><a href="my-account.html">My Account</a></li>
				</ul></li>
			<li class="nav-item"><a class="nav-link" href="service.html">Our
					Service</a></li>
			<li class="nav-item"><a class="nav-link" href="contact-us.html">Contact
					Us</a></li>
		</ul>
	</div>
	<!-- /.navbar-collapse -->

	<!-- Start Atribute Navigation -->
	<div class="attr-nav">
		<ul>
			<li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
			<li class="side-menu"><a href="#"> <i
					class="fa fa-shopping-bag"></i> <span class="badge">1</span>
			</a></li>
		</ul>
	</div>
	<!-- End Atribute Navigation -->
</div>

<!-- Start Side Menu -->
<div class="side">
	<a href="#" class="close-side"><i class="fa fa-times"></i></a>
	<li class="cart-box">
		<ul class="cart-list">
			<li><a href="#" class="photo"><img
					src="<c:url value="images/img-pro-01.jpg" />" class="cart-thumb"
					alt="" /></a>
				<h6>
					<a href="#">Delica omtantur </a>
				</h6>
				<p>
					1x - <span class="price">$80.00</span>
				</p></li>
			<li class="total"><a href="#"
				class="btn btn-default hvr-hover btn-cart">VIEW CART</a> <span
				class="float-right"><strong>Total</strong>: $80.00</span></li>
		</ul>
	</li>
</div>
<!-- End Side Menu --> </nav> <!-- End Navigation --> </header>
<!-- End Main Top -->

<!-- Start Top Search -->
<div class="top-search">
	<div class="container">
		<div class="input-group">
			<span class="input-group-addon"><i class="fa fa-search"></i></span> <input
				type="text" class="form-control" placeholder="Search"> <span
				class="input-group-addon close-search"><i class="fa fa-times"></i></span>
		</div>
	</div>
</div>
<!-- End Top Search -->

















<%-- <security:authorize access = "isAnonymous()">
				<li class="nav-item"><a class="nav-link" href='<c:url value="/login"/> '>Login</a></li>
				<li class="nav-item"><a class="nav-link" href='<c:url value="/register"/>'>Register</a></li>
			</security:authorize>
			
			<security:authorize access = "isAuthenticated()">
				<li class="nav-item"><a class="nav-link" href="#">Xin chào, <%= SecurityUtils.getPrincipal().getFullName() %></a></li>
				<li class="nav-item"><a class="nav-link" href='<c:url value="/logout"/> '>Logout</a></li> --%>

