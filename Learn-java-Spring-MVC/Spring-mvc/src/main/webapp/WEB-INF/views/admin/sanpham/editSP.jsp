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
							  <label for="categoryCode" class="col-sm-3 control-label no-padding-right">Thể loại:</label>
							  <div class="col-sm-9">
							  	 <select  name="categoryCode" id="categoryCode">
							  	   <c:if test="${empty product.getCatalog().getCatalogCode()}">
                                            <option value="">Chọn loại bài viết</option>
                                            <c:forEach var="item" items="${catalog}">
                                                <option value="${item.catalogCode}">${item.catalogName}</option>
                                            </c:forEach>
                                    </c:if>
							  	 	 <c:if test="${not empty product.getCatalog().getCatalogCode()}">
                                            <option value="">Chọn loại bài viết</option>
                                            <c:forEach var="item" items="${catalog}">
                                                <option value="${item.catalogCode}"<c:if test="${item.catalogCode == product.getCatalog().getCatalogCode()}">selected="selected"</c:if>>
                                                        ${item.catalogName}
                                                </option>
                                            </c:forEach>
                                    </c:if>
							  	 </select>
							  </div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Tên Sản phẩm</label>
								<div class="col-sm-9">
									<input name="title" id="title" value="${product.productName}" class="col-xs-10 col-sm-5"/>
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
									<input type="input" class="col-xs-10 col-sm-5" id="image" name="imagename"/>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Ảnh sản phẩm</label>
								<div class="col-sm-9">
									<c:if test="${not empty product.getImage()}">
										<img style="width: 60px; height: 60px" src="<c:url value='/images/products/${product.getImage().get(0).getFile() }'/>"/> 
									</c:if>			
										<input type="file" class="col-xs-10 col-sm-5" value="edit" id="file" name="file"/>	
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">Màu Sản phẩm</label>
								<div class="col-sm-9">
									<input type="input" class="col-xs-10 col-sm-5" id="color" value="${product.productColor }" name="productColor"/>
								</div>
						</div>
						<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right" for="form-field-1">size Sản phẩm</label>
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
									<input type="input" class="col-xs-10 col-sm-5" id="soluong" name="productColor"/>
								</div>
						</div>
						
						<div class="form-group">
						  	<label for="shortDescription" class="col-sm-3 control-label no-padding-right">Mô tả ngắn:</label>
						  	<div class="col-sm-9">
						  		<input type="text" name="shortDescription" rows="5" cols="10" value="${product.shortDescription }" class="form-control" "/>
						  	</div>
						</div>
					
						<hidden name="id" id="newId" value="${product.id}"/>
						<div class="clearfix form-actions">
							<div class="col-md-offset-3 col-md-9">
											<c:if test="${not empty product.id}">
												<button class="btn btn-info" type="button" id="btnAddOrUpdateNew">
													<i class="ace-icon fa fa-check bigger-110"></i>
													Cập nhật sản phẩm
												</button>
											</c:if>
											<c:if test="${empty product.id}">
												<button class="btn btn-info" type="button" id="btnAddOrUpdateNew">
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
			
/* 			function changeSL(){
				$("#soluong").val(${product.getProduct_size().get(0).getQuantity()});
			}
			changeSL();
			
			$("#size").change(function(){
				$.each([0, 1, 2, 3, 4], function(index, value){
					 if(${product.getProduct_size().get(index).getSizess().getSize()} === $("#size").val()) {
						$("#soluong").val(${product.getProduct_size().get(i).getQuantity()});
					}  
					console.log((${product.getProduct_size().get(index).getSizess().getSize()}).toString())
				})
			}); */
		</script>	
</body>
</html>