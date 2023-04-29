<%--
  Created by IntelliJ IDEA.
  User: jaeseoh
  Date: 2023/04/29
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>제목</title>
    <c:if test="${loginDeny eq true}">
        <script>
          alert('로그인에 실패했습니다');
          location.replace('/');
        </script>
    </c:if>
</head>
<body>
어서오세요. <c:out value="${name}"/>님 환영합니다.
첫 페이지입니다.

<a href="/login?email=email&password=password">로그인 성공</a>
<a href="/login?email=abc&password=password">로그인 실패</a>

</body>
</html>