<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<script src="<c:url value='/template/paging/jquery.twbsPagination.js'/>"></script>
</head>
<body>
		<div class="main-content">
		<form method="get" id="formSubmit" action="<c:url value='/admin/new/list'/>">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<c:if test="${not empty message}">
								<div class="alert alert-${alert}">${message}</div>
							</c:if>
							<div class="widget-box table-filter">
								<div class="table-btn-controls">
									<div class="pull-right tableTools-container">
										<div class="dt-buttons btn-overlap btn-group">
											<a flag="info" class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
												data-toggle="tooltip" title='Thêm loại sản phẩm'
												href='<c:url value="/admin/category/edit"/>'> <span>
													<i class="fa fa-plus-circle bigger-110 purple"></i>
											</span>
											</a>
										 <!-- 	data-toggle="tooltip" --> 
											<button id="btnDelete" type="button" onclick="warningBeforeDelete()"
												class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
												data-toggle="tooltip" title='Xóa bài viết'>
												<span> <i class="fa fa-trash-o bigger-110 pink"></i>
												</span>
											</button>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-xs-12"></div>
								<div class="row">
									<div class="col-xs-12">
										<div class="table-reponsive">
											<table class="table table-bordered">
												<thead>
													<tr>
														<th></th>
														<th>Tên loại</th>
														<th>Chi tiết Sản phẩm</th>
														<th>Action</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="item" items="${catalog}">
														<tr>
															<td><input type="checkbox" id="checkBox_" value=""/></td>
															<td style="font-size: 15px">${item.catalogName}</td>
															<td style="font-size: 15px"><a href="<c:url value="/admin/product/${item.catalogCode}" />">chi tiết sản phẩn</a></td>
															<td>
																<c:url var="editURL" value="/admin/new/edit">
																	<c:param name="id" value=""/>
																</c:url>
																<a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
																   title="Cập nhật Loại sản phẩm" href=''><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
																</a>
															</td>
														</tr>
												</c:forEach>
												</tbody>
											</table>
											<ul class="pagination" id="pagination"></ul>
											<input type="hidden" value="" id="page" name="page" /> 
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>	
			</div>
		</form>
	</div>
	<script>
		/* var totalPages = '';
		var currentPage = ''; */
		//var limit = 4; // tong so item hien thi tren 1 page
		$(function() {
			window.pagObj = $("#pagination").twbsPagination({
				totalPages : 10,
				visiblePages : 4,
				startPage: 1,
				onPageClick : function(event, page) {
					if(currentPage != page){
				//	$('#maxPageItem').val(limit);
					$('#page').val(page);
					// $('#sortName').val('title');
					// $('#sortBy').val('desc');
					//$('#type').val('list')
					$('#formSubmit').submit();
					}
				}
			})
		});
		</script>
		
	</body>
</html>