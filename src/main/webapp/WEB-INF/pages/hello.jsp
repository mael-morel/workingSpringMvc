<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <h1>SongList</h1>
 
        <ul>
                <c:forEach var="song" items="${listSongs}">
                    <h3>Song :</h3>
                        <li>${song.name}</li>
                        <li>${song.length}</li>
                </c:forEach>
        </ul>
 
    <!--<img src="${pageContext.servletContext.contextPath}/resources/img/mouse-pointer-hi.png" alt="no image" />-->
    
    <!--<img src="<c:url value="/resources/img/mouse-pointer-hi.png" />" />-->
</body>
</html>