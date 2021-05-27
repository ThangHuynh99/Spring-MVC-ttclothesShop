<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>chỉnh sửa sản phẩm</title>
</head>
<body>
<div class="main-content">
	<div class="main-content-inner">
		<div class="breadcrumbs" id="breadcrumbs">
			<script type="text/javascript">
				try {
					ace.settings.check('breadcrumbs', 'fixed')
				} catch (e) {
				}
			</script>

			<ul class="breadcrumb">
				<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
				</li>

				<li><a href="#">Forms</a></li>
				<li class="active">Form Elements</li>
			</ul>
			<!-- /.breadcrumb -->
		</div>
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<c:if test="${not empty message}">
						<div class="alert alert-${alert}">
  							${message}
						</div>
					</c:if>
					<form class="form-horizontal" role="form" id="formSubmit" >
						<div class="form-group">
							  <label for="categoryCode" class="col-sm-3 control-label no-padding-right">Loại sản phẩm</label>
							  <div class="col-sm-9">
							  	 <select  name="categoryCode" id="categoryCode">
							  	   <c:if test="${empty product.getCatalog().getCatalogCode()}">
                                            <option value="">Chọn loại sản phẩm</option>
                                            <c:forEach var="item" items="${catalog}">
                                                <option name="catalogCode" value="${item.catalogCode}">${item.catalogName}</option>
                                            </c:forEach>
                                    </c:if>
							  	 	 <c:if test="${not empty product.getCatalog().getCatalogCode()}">
                                            <option value="">Chọn loại bài viết</option>
                                            <c:forEach var="item" items="${catalog}">
                                                <option name="catalogCode" value="${item.catalogCode}"<c:if test="${item.catalogCode == product.getCatalog().getCatalogCode()}">selected="selected"</c:if>>
                                                        ${item.catalogName}
                                                </option>
                                            </c:forEach>
                                    </c:if>
							  	 </select>
							  </div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Mã sản phẩm</label>
								<div class="col-sm-9">
									<input name="productCode" id="productCode" value="${product.productCode}" class="col-xs-10 col-sm-5"/>
								</div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Tên Sản phẩm</label>
								<div class="col-sm-9">
									<input name="productName" id="productName" value="${product.productName}" class="col-xs-10 col-sm-5"/>
								</div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Giá Bán</label>
								<div class="col-sm-9">
									<input type="input" name="price" id="price" value="${product.vnd}" class="col-xs-10 col-sm-5"/>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Tên ảnh</label>
								<div class="col-sm-9">
									<input type="input" class="col-xs-10 col-sm-5" id="image" name="imageName"/>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Ảnh sản phẩm</label>
								<div class="col-sm-9">
									<c:if test="${not empty product.getProductImage()}">
										<img style="width: 60px; height: 60px" src="<c:url value='/images/products/${product.getProductImage().get(0).getFile() }'/>"/> 
										<input type="file" class="col-xs-10 col-sm-5" id="file" name="imageFile" value="/images/products/${product.getProductImage().get(0).getFile()}" />	
									</c:if>		
									<c:if test="${empty product.getProductImage()}">
										<input type="file" class="col-xs-10 col-sm-5" id="file" name="imageFile"  />	
									</c:if>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Màu Sản phẩm</label>
								<div class="col-sm-9">
									<input type="input" class="col-xs-10 col-sm-5" id="color" value="${product.productColor }" name="productColor"/>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Size Sản phẩm</label>
								<div class="col-sm-9">
									<select type="input" class="col-xs-10 col-sm-5" id="size" name="size" >
										<option value="S">S</option>
										<option value="M">M</option>
										<option value="L">L</option>
										<option value="XL">XL</option>
										<option value="XXL">XXL</option>
									</select>
								</div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Số lượng</label>
								<div class="col-sm-9">
									<input type="input" class="col-xs-10 col-sm-5" id="soluong" name="quantity"/>
								</div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Nội dung</label>
								<div class="col-sm-9">
									<input name="content" id="content" value="${product.content}" class="col-xs-10 col-sm-5"/>
								</div>
						</div>
						
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Mô tả ngắn</label>
								<div class="col-sm-9">
									<input name="shortDescription" id="shortDescription" value="${product.shortDescription}" class="col-xs-10 col-sm-5"/>
								</div>
						</div>
					
						<input type="hidden" name="id" id="productId" value="${product.id}"/>
						<div class="clearfix form-actions">
							<div class="col-md-offset-3 col-md-9">
											<c:if test="${not empty product.id}">
												<button class="btn btn-info" type="button" id="btnAddOrUpdateProduct">
													<i class="ace-icon fa fa-check bigger-110"></i>
													Cập nhật sản phẩm
												</button>
											</c:if>
											<c:if test="${empty product.id}">
												<button class="btn btn-info" type="button" id="btnAddOrUpdateProduct">
													<i class="ace-icon fa fa-check bigger-110"></i>
													Thêm sản phầm
												</button>
											</c:if>

											&nbsp; &nbsp; &nbsp;
											<button class="btn" type="reset">
												<i class="ace-icon fa fa-undo bigger-110"></i>
												Reset
											</button>
										</div>		
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>	
			
		<script>
		
		$('#btnAddOrUpdateProduct').click(function (e) {
		    e.preventDefault();
		    var data = {};
		    var formData = $('#formSubmit').serializeArray();
		    $.each(formData, function (i, v) {
	            data[""+v.name+""] = v.value;
	        });
			var id = $('#productId').val(); 
		    if (id === "") {
		    	addProduct(data);
		    } else {
		    	updateProduct(data);
		    }
		});
		
			function addProduct(data){
				$.ajax({
					url: "/api/product",
					type: 'POST',
	        		contentType: 'application/json',
					data: JSON.stringify(data),
					success: function (result) {
	                	alert("Them san pham thanh cong !")
	               },
	               error: function (error) {
	               		console.log(error)
	               }
				})
			}
			
		</script>	
</body>
</html>