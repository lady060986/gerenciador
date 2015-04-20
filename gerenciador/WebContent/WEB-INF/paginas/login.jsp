<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>
<c:choose>
<c:when test="${usuarioLogado != null}">
Usuario Logado:${usuarioLogado.email}
</c:when>
<c:otherwise>
Usuario ou senha invalida!
</c:otherwise>
</c:choose>