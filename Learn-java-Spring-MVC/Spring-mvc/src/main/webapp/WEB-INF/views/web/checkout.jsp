<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>		
<!-- <script src='https://cdn.jsdelivr.net/gh/vietblogdao/js/districts.min.js'/>  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="cart-box-main">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-lg-6 mb-3">
					<div class="checkout-address">
						<div class="title-left">
							<h3>Thông tin giao hàng</h3>
						</div>
						<form class="needs-validation" novalidate>
							
							<div class="mb-3">
								<label for="username">Họ và Tên *</label>
								<div class="input-group">
									<input type="text" class="form-control" id="username"
										placeholder="" required>
									<div class="invalid-feedback" style="width: 100%;">Your
										username is required.</div>
								</div>
							</div>
							<div class="mb-3">
								<label for="email">Địa chỉ Email  *</label> <input type="email"
									class="form-control" id="email" placeholder="">
								<div class="invalid-feedback">Please enter a valid email
									address for shipping updates.</div>
							</div>
							<div class="mb-3">
								<label for="address">Địa chỉ nhận hàng *</label> <input type="text"
									class="form-control" id="address" placeholder="" required>
								<div class="invalid-feedback">Please enter your shipping
									address.</div>
							</div>
							
							<div class="row">
								<div class="col-md-4 mb-3">
									<label for="country">Thành phố *</label> <select
										class="wide w-100" id="city">
										<option value="Choose..." data-display="Select">Choose...</option>
										<option value="United States">United States</option>
									</select>
									<div class="invalid-feedback">Please select a valid
										country.</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="state">Quận/Huyện *</label> <select class="wide w-100"
										id="district">
										<option data-display="Select">Choose...</option>
										
									</select>
									<div class="invalid-feedback">Please provide a valid
										state.</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="zip">Phường/Xã *</label>
									 <select class="wide w-100" id="ward">
										<option data-display="Select" value="">Choose...</option>
										<option>California</option>
									</select>
									<div class="invalid-feedback">Zip code required.</div>
								</div>
							</div>
							<hr class="mb-4">
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input"
									id="same-address">
							</div>
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input"
									id="save-info"> 
							</div>
							<hr class="mb-4">
							<div class="title">
								<span>Payment</span>
							</div>
							<div class="d-block my-3">
								<div class="custom-control custom-radio">
									<input id="credit" name="paymentMethod" type="radio"
										class="custom-control-input" checked required> <label
										class="custom-control-label" for="credit">Credit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="debit" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="debit">Debit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="paypal" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="paypal">Paypal</label>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="cc-name">Name on card</label> <input type="text"
										class="form-control" id="cc-name" placeholder="" required>
									<small class="text-muted">Full name as displayed on
										card</small>
									<div class="invalid-feedback">Name on card is required</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="cc-number">Credit card number</label> <input
										type="text" class="form-control" id="cc-number" placeholder=""
										required>
									<div class="invalid-feedback">Credit card number is
										required</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">Expiration</label> <input
										type="text" class="form-control" id="cc-expiration"
										placeholder="" required>
									<div class="invalid-feedback">Expiration date required</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">CVV</label> <input type="text"
										class="form-control" id="cc-cvv" placeholder="" required>
									<div class="invalid-feedback">Security code required</div>
								</div>
								<div class="col-md-6 mb-3">
									<div class="payment-icon">
										<ul>
											<li><img class="img-fluid"
												src="images/payment-icon/1.png" alt=""></li>
											<li><img class="img-fluid"
												src="images/payment-icon/2.png" alt=""></li>
											<li><img class="img-fluid"
												src="images/payment-icon/3.png" alt=""></li>
											<li><img class="img-fluid"
												src="images/payment-icon/5.png" alt=""></li>
											<li><img class="img-fluid"
												src="images/payment-icon/7.png" alt=""></li>
										</ul>
									</div>
								</div>
							</div>
							<hr class="mb-1">
						</form>
					</div>
				</div>
				<div class="col-sm-6 col-lg-6 mb-3">
					<div class="row">
						<div class="col-md-12 col-lg-12">
							<div class="shipping-method-box">
								<div class="title-left">
									<h3>Giao hàng</h3>
								</div>
								<div class="mb-4">
									<div class="custom-control custom-radio">
										<input id="shippingOption1" name="shipping-option"
											class="custom-control-input" checked="checked" type="radio">
										<label class="custom-control-label" for="shippingOption1">Giao hàng cơ bản</label> <span class="float-right font-weight-bold" value="0">Miễn phí</span>
									</div>
									<div class="ml-4 mb-2 small">(3-7 ngày)</div>
									<div class="custom-control custom-radio">
										<input id="shippingOption2" name="shipping-option"
											class="custom-control-input" type="radio"> <label
											class="custom-control-label" for="shippingOption2">Giao hàng tiết kiệm</label> <span class="float-right font-weight-bold" value="25000">25.000 đ</span>
									</div>
									<div class="ml-4 mb-2 small">(2-4 ngày)</div>
									<div class="custom-control custom-radio">
										<input id="shippingOption3" name="shipping-option"
											class="custom-control-input" type="radio"> <label
											class="custom-control-label" for="shippingOption3">Giao hàng nhanh</label> <span class="float-right font-weight-bold" value = "50000">50.000 đ</span>
									</div>
									<div class="ml-4 mb-2 small">Giao trong ngày</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 col-lg-12">
							<div class="odr-box">
								<div class="title-left">
									<h3>Thông tin sản phẩm</h3>
								</div>
								<c:if test="${not empty giohang}">
								<div class="rounded p-2 bg-light">
									<div class="media mb-2 border-bottom">
										<div class="media-body">
											<a href="detail.html"> Lorem ipsum dolor sit amet</a>
											<div class="small text-muted">
												Price: $80.00 <span class="mx-2">|</span> Qty: 1 <span
													class="mx-2">|</span> Subtotal: $80.00
											</div>
										</div>
									</div>
								</div>
								</c:if>
								<c:if test="${empty giohang}">
									<h4><strong>Chưa có sản phẩm nào</strong></h4>
								</c:if>
							</div>
						</div>
						<div class="col-md-12 col-lg-12">
							<div class="order-box">
								<div class="title-left">
									<h3>Hóa đơn của bạn</h3>
								</div>
								<div class="d-flex">
									<div class="font-weight-bold">Sản phẩm</div>
									<div class="ml-auto font-weight-bold">Tổng tiền</div>
								</div>
								<hr class="my-1">
								<div class="d-flex">
									<h4>Tạm tính</h4>
									<div class="ml-auto font-weight-bold">0 đ</div>
								</div>
								<div class="d-flex">
									<h4>Giảm giá</h4>
									<div class="ml-auto font-weight-bold">0 đ</div>
								</div>
								<hr class="my-1">
								<div class="d-flex">
									<h4>Mã giảm giá</h4>
									<div class="ml-auto font-weight-bold">0 đ</div>
								</div>
								<div class="d-flex">
									<h4>Thuế/phí</h4>
									<div class="ml-auto font-weight-bold">0 đ</div>
								</div>
								<div class="d-flex">
									<h4>Phí giao hàng</h4>
									<div class="ml-auto font-weight-bold">Free</div>
								</div>
								<hr>
								<div class="d-flex gr-total">
									<h5>Tổng cộng</h5>
									<div class="ml-auto h5">0 đ</div>
								</div>
								<hr>
							</div>
						</div>
						<div class="col-12 d-flex shopping-box">
							<a  class="ml-auto btn hvr-hover" id="datHang">Đặt hàng</a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- End Cart -->
	<script >
	$("#datHang").click(function(){
		var data = {
			"customerName": "Huỳnh Bá Thắng",
			"customerPhone": "0905 548 920",
			"orderStatus": "1",
			"quantityProduct": 2,
			"totalPrice": 1200000,
			"customerEmail": "thang.huynh304@gmail.com",
			"customerAddress": "32 Hoàng Thế Thiện, Hòa Xuân, Cẩm Lệ, Đà Nẵng",
			"payment": "momo",
			"delivery": "Giao hàng cơ bản"			
		}
		
		$.ajax({
			url: "/api/checkout",
			type: "POST",
			contentType: 'application/json',
			data: JSON.stringify(data),
			dataType: 'json',
			success: function (result) {
	          	alert("đặt hàng thành công !")
	           },
	        error: function (error) {
	           	alert("đã có lỗi xảy ra")
	        }
		})
	})
	</script>
</body>
</html>