<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<c:url var="APIurl" value="/api/new"/>
<c:url var="NewURL" value="/admin/new/list"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Danh sách sản phẩm</title>
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
												data-toggle="tooltip" title='Thêm bài viết'
												href='<c:url value="/admin/new/edit"/>'> <span>
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
														<th><input type="checkbox" id="checkAll"/></th>
														<th>Title</th>
														<th>Short Description</th>
														<th>Action</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="item" items="${model.listResult}">
														<tr>
															<td><input type="checkbox" id="checkBox_${item.id}" value="${item.id}"/></td>
															<td>${item.title}</td>
															<td>${item.shortDescription}</td>
															<td>
																<c:url var="editURL" value="/admin/new/edit">
																	<c:param name="id" value="${item.id}"/>
																</c:url>
																<a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
																   title="Cập nhật bài viết" href='${editURL}'><i class="fa fa-pencil-square-o" aria-hidden="true"></i>
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
		</form>
	</div>
	<script>
		var totalPages = ${model.totalPage};
		var currentPage = ${model.page};
		//var limit = 4; // tong so item hien thi tren 1 page
		$(function() {
			window.pagObj = $("#pagination").twbsPagination({
				totalPages : totalPages,
				visiblePages : 4,
				startPage: currentPage,
				onPageClick : function(event, page) {
					if(currentPage != page){
				//	$('#maxPageItem').val(limit);
					$('#page').val(page);
					// $('#sortName').val('title');
					// $('#sortBy').val('desc');
					//$('#type').val('list')
					$('#formSubmit').submit();
					var data = {};
					data["page"] = 	$('#page').val(page);
					getNew(data);
					}
				}
			})
		});
		
		function warningBeforeDelete(){
			swal({
				  title: "Xác nhận xóa",
				  text: "Bạn có chắc chắn muốn xóa hay không",
				  type: "warning",
				  showCancelButton: true,
				  confirmButtonClass: "btn-success",
				  cancelButtonClass: "btn-danger",
				  confirmButtonText: "Xác nhận",
				  cancelButtonText: "Hủy bỏ",
				}).then(function(isConfirm) {
				  if (isConfirm) {
						var ids = $('tbody input[type=checkbox]:checked').map(function () {
				            return $(this).val();
				        }).get();
						deleteNew(ids);
				  }
				});	
		}
		
		/* $('#btnDelete').click(function(){
			var data = {};
				var ids = $('tbody input[type=checkbox]:checked').map(function () {
		            return $(this).val();
		        }).get();
				data['ids'] = ids;
				deleteNew(data);
		}); */

		function deleteNew(data) {
			$.ajax({
				url: '${APIurl}',
				type: 'DELETE',
				contentType: 'application/json',
				data: JSON.stringify(data),
				//dataType: 'json',
				success: function (result) {
					window.location.href = "${NewURL}?page=1&message=deleteSuccess";
				},
				error: function (error) {
					window.location.href = "${NewURL}?page=1&message=errorSystem";
				}
			});
		}
		
	
		
		function getNew() {
			$.ajax({
				url: '${APIurl}',
				type: 'GET',
				contentType: 'application/json',
				data: JSON.stringify(data),
				//dataType: 'json',
				success: function (result) {
					window.location.href = "${NewURL}?page="+data.page;
					 var result = JSON.parse(data);
					 for (var i in result){
						 document.getElementById("checkBox_"+result.id).innerHTML = i.title;
						 document.getElementById("title").innerHTML = i.title;
						 document.getElementById("shortDescription").innerHTML = i.shortDescription;
					 }
				},
				error: function (error) {
					window.location.href = "${NewURL}?page=1&message=errorSystem";
				}
			});
		}
	</script>
</body>
</html>