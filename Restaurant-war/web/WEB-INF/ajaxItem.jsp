<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


            <c:forEach var="i" items="${item}">
                <c:if test="${!i.Active}">
                <input type="button" value="Dispo" name="doIt" onclick="javascript:goItem('${i.nomItem}')" />${i.nomItem}    
                </c:if>
                <c:if test="${i.Active}">    
                <input type="button" value="nonDispo" name="doIt" onclick="javascript:goItem('${i.nomItem}')" />${i.nomItem}             
                </c:if>
                <br>
                
            </c:forEach>
