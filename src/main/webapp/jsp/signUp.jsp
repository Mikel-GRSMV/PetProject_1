<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.folder.models.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%
    List<User> users = (ArrayList) request.getAttribute("usersFromOurFakeStorage");
%>
<table>
    <tr>
        <th>User name</th>
        <th>User birthDay</th>
    </tr>
    <% for (User user : users) {
    %>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getLocalDate()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
