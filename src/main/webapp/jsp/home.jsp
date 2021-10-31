<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="form-style-2">
    You can choose color!
</div>
<span style="color: ${cookie.color.value}">Hello</span>
<form method="post" name="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="Red">red</option>
            <option value="Black">black</option>
            <option value="Blue">blue</option>
        </select>
    </label>
    <input type="submit" value="color send">

    <div class="form-style-2">
        Passport data
    </div>
    <label for="passport">passport
        <input class="input-field" type="text" id="passport" name="passport">
    </label>

</form>
</body>
</html>