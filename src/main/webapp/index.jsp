<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<jsp:include page="header.jsp"></jsp:include>
    <body>
    <div class="banniere">
    </div>
    <h1><%= "Hello World!" %>
    </h1>
    <jsp:include page="footer.jsp"></jsp:include>
    <br/>
    <a href="hello-servlet">Hello Servlet</a>
</body>
</html>