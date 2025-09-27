<%--
  Created by IntelliJ IDEA.
  User: daota
  Date: 27/09/2025
  Time: 11:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" width="60%">
    <%--    Tiêu đề table--%>
    <tr>
        <th>ID</th>
        <th>Tên danh mục</th>
        <th>Người quản lý</th>
        <th>Ghi chú</th>
        <th>Hành động</th>
    </tr>

    <c:forEach items="${DanhMucList}" var="dm">
        <tr>
            <td>${dm.maDanhMuc}</td>
            <td>${dm.tenDanhMuc}</td>
            <td>${dm.nguoiQuanLy}</td>
            <td>${dm.ghiChu}</td>
        </tr>
    </c:forEach>
</table>
<p>Tổng số danh mục: ${fn:length(DanhMucList)}</p>

</body>
</html>
