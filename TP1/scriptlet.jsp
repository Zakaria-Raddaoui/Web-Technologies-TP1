<!DOCTYPE html>
<html>
<head>
    <title>JSP Scriptlet</title>
</head>
<body>

    <h1>JSP Scriptlet</h1>

    <%
        java.util.Date date = new java.util.Date();
        String host = request.getRemoteHost();
    %>

    <p>time: <%= date %></p>

    <p>ip: <%= host %></p>

</body>
</html>
