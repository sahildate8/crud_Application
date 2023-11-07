<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
th {
	text-align: center
}

td {
	text-align: center
}
</style>
</head>


<body>


<div class="right_col" role="main">

	<div class="">

		<div class="page-title">
			<div class="title_left" style="width: 100%">
				<h3 style="color: black;">
					View All Batch

					<div class="buttonexport">
						<a class="btn btn-add" onclick="history.back()"> Back </a>
					</div>

				</h3>

			</div>


		</div>
		<div class="clearfix"></div>
		<div class="row">

			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="x_panel">
					<div class="x_title" style="background: #e8f1f3; width: 100%">

						<form id="demo-form3" action="" data-parsley-validate
							class="form-horizontal form-label-left" style="margin-top: 1%;">
							<table>
								<tr>
									<td>
										 <select name="company_id" id="company_id"
										class="form-control select2">
											<optgroup label="">
												<option value="">-- Select Company --</option>
												
											

												
											</optgroup>
									</select>

									</td>
									<td>
										<div class="form-group" style="float: right;">
											<!--                      <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name" style="width:150px;height:30px;margin-right:40px;color:black;">Attendance Date:
                      </label>-->

											<div class="col-xs-12" style="height: 30px;">
												<!--                          <body onload="addDate();">-->
												<div class="col-xs-6">
													<div class="input-group date" data-date-format="dd/mm/yyyy">
														<input type="date-text" class="form-control"
															placeholder="dd/mm/yyyy" name="Fdate" id="Fdate" required>
														<div class="input-group-addon">
															<span class="glyphicon glyphicon-th"></span>
														</div>
													</div>
												</div>
												<div class="col-xs-6">
													<div class="input-group date" data-date-format="dd/mm/yyyy">
														<input type="date-text" class="form-control"
															placeholder="dd/mm/yyyy" name="Tdate" id="Tdate" required>
														<div class="input-group-addon">
															<span class="glyphicon glyphicon-th"></span>
														</div>
													</div>
												</div>
											</div>
										</div>
									</td>
									<td>
										<div class="col-md-6 col-sm-6 col-xs-12 ">
											<button type="submit" class="btn fix_back_color"
												style="width: 150px; height: 40;">Find</button>
										</div>
									</td>
								</tr>
							</table>

						</form>

						<div class="clearfix"></div>
					</div>

					<div class="x_content">
						<div class="text-right">
							

							<input type="button" class="DTTT_button"
								onclick="tableToExcel('example', 'W3C Example Table')"
								value="Export to Excel">
						</div>


						<div class="table-responsive" style="height: 460px;">
							<table id="example"
								class="table table-striped table-bordered responsive-utilities jambo_table  data-sort-order ">

								<thead>

									<tr class="headings fix_back_color">
										<th>Batch No</th>
										<th>Product Code</th>
										<th>Product Name</th>
										<th>Company Name</th>
										<th>Version</th>
										<th>Manufacturing Date</th>
										<th>Expiry Date</th>
										<th class=" no-link last"><span class="nobr">Action</span></th>
									</tr>
								</thead>
								
								<tr id="">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									
									<td></td>
									<td>
									<td class=" last">
										<!-- Print Button -->
										<form action="batch_generation_view.jsp" method="post">
											<input type="hidden" name="batch_no"
												value="">
											<button type="submit" class="btn btn-success btn-xs">View</button>
										</form>

										<form action="Batch_edit_delete" method="post">
											<input type="hidden" name="batch_no"
												value="">
											<button type="submit"
												class="btn btn-danger btn-xs btn_delete">Delete</button>
										</form>
									</td>
								</tr>
								
							</table>
						</div>
					</div>
				</div>
			</div>

	
		</div>
	</div>
</div>
</body>


<jsp:include page="templates/footer.html" />