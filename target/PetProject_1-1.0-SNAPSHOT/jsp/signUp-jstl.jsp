<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.folder.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign up!
    </div>
    <form method="post" action="/signUp">

        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label>

        <label for="localDate">User birthday
            <input class="input-field" type="text" id="localDate" name="localDate">
        </label>

        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>

        <input type="submit" value="sign up">

    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already registered!
    </div>
    <table>

        <tr>
            <th>User name</th>
            <th>Local Date</th>
        </tr>

        <c:forEach items="${usersFromOurFakeStorage}" var="user">
            <tr>
                <td>${user.getName()}</td>
                <td>${user.getLocalDate()}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>

