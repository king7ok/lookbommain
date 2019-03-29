<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="product.model.vo.ProductFull, user.model.vo.LookBomUser, java.util.ArrayList" %>
<%	

ArrayList<ProductFull> list = (ArrayList<ProductFull>) request.getAttribute("list");
int listCount = ((Integer) request.getAttribute("listCount")).intValue();
int startPage = ((Integer) request.getAttribute("startPage")).intValue();
int endPage = ((Integer) request.getAttribute("endPage")).intValue();
int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();
ArrayList<String> brand = (ArrayList<String>)request.getAttribute("brand");

String filterBrand = null, filterKey = null;
if(request.getAttribute("filterBrand") != null)
	filterBrand = request.getParameter("filterBrand");

if(request.getAttribute("filterKey") != null)
	filterKey = request.getParameter("filterKey");

%>		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lookbom</title>
<link rel="stylesheet" type="text/css"
	href="/lb/resources/css/productPagination.css">
</head>
<script type="text/javascript" src="/lb/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function filterList1(){
	 window.location.href="/lb/pfilter?filterBrand="+$("#filter").val()+"&filterKey="+$("#filter1").val();
}
function filterList2(){
	 window.location.href="/lb/pfilter?filterBrand="+$("#filter").val()+"&filterKey="+$("#filter2").val();
}

$(function(){

	  $("#filter option").each(function(){
	    if($(this).val()=="<%=filterBrand%>"){
	    	  $(this).prop("selected","selected");
	    }
	  });
	});
</script>
<body>
	<h2>상품리스트 페이지 입니다</h2>
	<hr align="center" width="1000">
	<table align="center" width="1000" border="1px solid #bcbcbc">
		<tr height="50">		
			<th width="180"><select name="filter" id="filter">	
			     <option value=""	>상품분류</option>	
				<% for(int k=0;k<brand.size(); k++){ %>
						<option value="<%= brand.get(k)%>"><%= brand.get(k)%></option>
						<% } %>
			</select></th>
			<th width="180">
			 <input type="button" id=filter1 value="최신순" onclick="filterList1();">
			 <input type="button" id=filter2 value="인기순" onclick="filterList2();">			
			</th>
					<th colspan="3"></th>
					
		</tr>
		<tr>
		<% int count =0; 
		   for(int i=0; i<list.size(); i++){
		%>
			<th width="200" height="230">
				<table align="center" width="180" border="1px solid #bcbcbc">					
					<tr>
						<td width="180" height="160"><div style="cursor: pointer"
								onclick="window.location.href='/lb/pdetail?pno=<%=list.get(i).getProductNo() %>&page=<%=currentPage%>';">
								<img width="100%" height="100%"
									src="/lb/file/product/<%=list.get(i).getProductImage1()%>">
							</div></td>
					</tr>
					<tr>
						<td width="180" height="20">[<%=list.get(i).getBrand() %>]</td>
					</tr>
					<tr>
						<td width="180" height="20">[<%=list.get(i).getProductName() %>][<%=list.get(i).getProductColor() %>]</td>
					</tr>
					<tr>
						<td width="180" height="15">[<%=list.get(i).getDiscountRate() %>%][<%=list.get(i).getProductPrice()%>원]</td>
					</tr>
					<tr>
						<td width="180" height="15">[<%=list.get(i).getViewCount() %>][<%=list.get(i).getTotalSaleRate() %>]</td>
					</tr>
				</table>
			</th>
		<% if(++count%5 ==0){ %>
		   </tr><tr>
			<% } } %>
				
		</tr>
	</table>


	
<div style="text-align:center;">
<% if(currentPage <= 1){ %>
	◀◀
<% }else{ %>
	<a href="/lb/plist?page=1">◀◀</a>
<% } %>
<% if((currentPage - 10) < startPage && (currentPage - 10) > 1){ %>
	<a href="/lb/plist?page=<%= startPage - 10 %>">◀</a>
<% }else{ %>
	◀
<% } %>
<% for(int p = startPage; p <= endPage; p++){ 
		if(p == currentPage){		
%>
<font color="red"><b><%= p %></b></font>
	<% }else{  
	if(filterBrand == null && filterKey ==null){%>
	<a href="/lb/plist?page=<%= p %>"><%= p %></a>
	<%}else{%>
	<a href="/lb/pfilter?filterBrand=<%=filterBrand%>&filterKey=<%=filterKey %>&page=<%=p %>"><%= p %></a>
<% }} } %>
<% if((currentPage + 10) > endPage && (currentPage + 10) < maxPage){ %>
<a href="/lb/plist?page=<%= endPage + 10 %>">▶</a>
<% }else{ %>
	▶
<% } %>
<% if(currentPage >= maxPage){ %>
	▶▶
<% }else{ %>
	<a href="/lb/plist?page=<%= maxPage %>">▶▶</a>
<% } %>

</div>

</body>
</html>