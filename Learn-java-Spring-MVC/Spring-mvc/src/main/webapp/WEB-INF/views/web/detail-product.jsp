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
<!-- Start All Title Box -->
	<div class="all-title-box">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<h2>Shop</h2>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Shop</li>
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
                    <div id="carousel-example-1" class="single-product-slider carousel slide" data-ride="carousel">
                        <div class="carousel-inner" role="listbox">
                        <c:forEach var="item" items="${productDetail.getProductImage() }"> 
                            <div class="carousel-item active"> <img class="d-block w-100" src="<c:url value='/images/products/${item.getFile() }'/>" alt="First slide"> </div>
                         </c:forEach> 
                        </div>
                        <a class="carousel-control-prev" href="#carousel-example-1" role="button" data-slide="prev"> 
						<i class="fa fa-angle-left" aria-hidden="true"></i>
						<span class="sr-only">Previous</span> 
					</a>
                        <a class="carousel-control-next" href="#carousel-example-1" role="button" data-slide="next"> 
						<i class="fa fa-angle-right" aria-hidden="true"></i> 
						<span class="sr-only">Next</span> 
					</a>
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-1" data-slide-to="0" class="active">
                            <c:forEach var="item" items="${productDetail.getProductImage()}"> 
                                <img class="d-block w-100 img-fluid" src="<c:url value='/images/products/${item.getFile() }'/>" alt="" />
                           	</c:forEach> 
                            </li>
                        </ol>
                    </div>
                </div>
                <div class="col-xl-7 col-lg-7 col-md-6">
                    <div class="single-product-details">
                        <h2>${productDetail.getShortDescription() }</h2>
                        <h5 name="price" value="${item.getPrice()}"> <!-- <del>$ 60.00</del> --> ${productDetail.getVnd() }</h5>
                        
                        <p class="available-stock"><span> More than 20 available / <a href="#">8 sold </a></span>
                            <p>
                                <h4>Mô tả:</h4>
                                <p>${productDetail.getContent()}. </p>
                                <ul>
                                    <li>
                                        <div class="form-group size-st">
                                            <label class="size-label">Size</label>
                                            <select id="selectSize" class="selectpicker show-tick form-control" >
                                            <option name = "size" value="0">Size</option>
                                            <c:forEach var="item" items="${productDetail.getSize()}"> 
												<option  name = "size" value="${item.getProductQuantity() }">${item.getSize() }</option>
											</c:forEach>
												</select>
				                         </div>
                                    </li>
                                    <li>
                                        <div class="form-group quantity-box">
                                            <label class="control-label">Quantity</label>
                                            <input id="quantity" name = "quantity" class="form-control" min="0" max="10" type="number">
                                        </div>
                                    </li>
                                </ul>

                                <div class="price-box-bar">
                                    <div class="cart-and-bay-btn">
                                        <a class="btn hvr-hover" data-fancybox-close="" href="#">Add to cart</a>
                                    </div>
                                </div>
                    </div>
                </div>
            </div>
            </div>
          <script >          
          	
          	$(document).ready(function(){
          		 $("input[type='number']").prop('max', $("#selectSize").val());
          	})
          </script>
</body>
</html>