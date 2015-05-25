<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表單版本框架</title>
<link href="http://cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
<style>
	#example th { text-align: center }
	#example td { text-align: center }
</style>
<script>
	$(document).ready(function() {
		$('#example').dataTable({bFilter: false, bInfo: false});
	});
</script>
</head>
<body>
	<div style="margin: auto 50px;">
		<table id="example" class="display" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>編號</th>
					<th>內容</th>
					<th>版號</th>
					<th>檢視</th>
				</tr>
			</thead>
	
			<tfoot>
				<tr>
					<th>編號</th>
					<th>內容</th>
					<th>版號</th>
					<th>檢視</th>
				</tr>
			</tfoot>
	
			<tbody>
				<c:forEach var="form" items="${formList}">
				<tr>
					<td>${form.formId}</td>
					<td>${form.content}</td>
					<td>${form.ver}</td>
					<td><a href="formTest.do?ver=${form.ver}&formId=${form.formId}">檢視</a></td>				
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	
	
</body>
</html>