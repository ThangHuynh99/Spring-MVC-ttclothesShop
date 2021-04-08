<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<!-- Start All Title Box -->
		<div class="all-title-box">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h2>Shop</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a
								href="<c:url value='/home' />">Home</a></li>
							<li class="breadcrumb-item active">Shop Detail</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End All Title Box -->
		<div>
			<div class="shop-detail-box-main">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-5 col-md-6">
							<div id="carousel-example-1"
								class="single-product-slider carousel slide"
								data-ride="carousel">
								<div class="carousel-inner" role="listbox">
									<c:forEach var="item"
										items="${productDetail.getProductImage() }">
										<div class="carousel-item active">
											<img id="image" value="${item.getFile()}"
												class="d-block w-100"
												src="<c:url value='/images/products/${item.getFile() }'/>"
												alt="First slide">
										</div>
										<div class="carousel-item ">
											<img class="d-block w-100"
												src="<c:url value='/images/products/${item.getFile() }'/>"
												alt="second slide">
										</div>
										<div class="carousel-item ">
											<img class="d-block w-100"
												src="<c:url value='/images/products/${item.getFile() }'/>"
												alt="third slide">
										</div>
									</c:forEach>
								</div>
								<a class="carousel-control-prev" href="#carousel-example-1"
									role="button" data-slide="prev"> <i
									class="fa fa-angle-left" aria-hidden="true"></i> <span
									class="sr-only">Previous</span>
								</a> <a class="carousel-control-next" href="#carousel-example-1"
									role="button" data-slide="next"> <i
									class="fa fa-angle-right" aria-hidden="true"></i> <span
									class="sr-only">Next</span>
								</a>
								<ol class="carousel-indicators">
									<c:forEach var="item"
										items="${productDetail.getProductImage()}">
										<li data-target="#carousel-example-1" data-slide-to="0"
											class="active"><img class="d-block w-100 img-fluid"
											src="<c:url value='/images/products/${item.getFile() }'/>"
											alt="" /></li>
										<li data-target="#carousel-example-1" data-slide-to="1"
											class="active"><img class="d-block w-100 img-fluid"
											src="<c:url value='/images/products/${item.getFile() }'/>"
											alt="" /></li>
										<li data-target="#carousel-example-1" data-slide-to="2"
											class="active"><img class="d-block w-100 img-fluid"
											src="<c:url value='/images/products/${item.getFile() }'/>"
											alt="" /></li>
									</c:forEach>

								</ol>
							</div>
						</div>
						<div class="col-xl-7 col-lg-7 col-md-6">
							<div class="single-product-details">
								<input type="hidden" name="id" id="id"
									value="${productDetail.getId()}" />
								<h2 id="description">${productDetail.getShortDescription() }</h2>
								<h5 id="price" data-value="${productDetail.getPrice()}">
									<!-- <del>$ 60.00</del> -->
									${productDetail.getVnd() }
								</h5>

								<span>Màu Sản Phẩm:
									<h4 id="color">${productDetail.getProductColor()}</h4>
								</span>
								<p>
								<h4>Mô tả:</h4>
								<p>${productDetail.getContent()}.</p>
								<ul>
									<li>
										<div class="form-group size-st test">
											<label class="size-label">Size</label> <select id="size"
												name="size" class="selectpicker show-tick form-control"
												onchange="handleChange()">
												<option value="0">Size</option>
												<c:forEach var="item" items="${productDetail.getSize()}">
													<option name="${item.getProductQuantity()}"
														value="${item.getSize()}">${item.getSize()}</option>
												</c:forEach>
											</select>
										</div>
									</li>
									<li>
										<div class="form-group quantity-box">
											<label class="control-label">Quantity</label> <input
												id="quantity" name="quantity" class="form-control" min=""
												max="10" type="number">
										</div>
									</li>
								</ul>

								<div class="price-box-bar">
									<div class="cart-and-bay-btn">
										<a class="btn hvr-hover" data-fancybox-close=""
											id="btnAddCart">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<script>        
       
       $('#btnAddCart').click(function(e){
    	   
         	var	id = $('#id').val();
         	var	productImage = $('#image').attr("src");
         	var	price = $('#price').attr("data-value");
         	var	shortDescription = $('#description').text();
         	var	productColor = $('#color').text();
         	var	productSize = $('#size').val();
         	var	productQuantity = $('#quantity').val();
         	
         	const data = {
         		id: id,
         		productImage: productImage,
         		price: price,
         		shortDescription: shortDescription,
         		productColor: productColor,
         		productSize: productSize,
         		productQuantity: productQuantity
         	}
         	
         	addCart(data);	         	
       });
       
       function addCart(data){
    	   $.ajax({
        		url: '/api/addCart',
        		type: 'POST',
        		contentType: 'application/json',
        		data: JSON.stringify(data),
        		success: function (result) {
                	console.log(result);
               },
               error: function (error) {
               	console.log(error);
               }
        	});
       }
          function	handleChange(){
        	  
        	  $("#quantity").val("");
        	//$("input[type='number']").prop('max', $("#size").option.attr("name"));
        	//  $("input[type='number']").prop('max', document.querySelectorAll('.test [name]').dataset);
        	 
          }
         
          
        </script>
</body>
</html>