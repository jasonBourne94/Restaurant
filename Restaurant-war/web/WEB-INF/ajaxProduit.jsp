<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


            <c:forEach var="i" items="${produit}">
                <c:if test="${i.Finished}">
                <input type="button" value="Plat pret" name="doIt" onclick="javascript:goProduit(${i.id})" />${i.id}
                <input type="button" value="RAZ" name="doZero" onclick="javascript:goZero(${i.id})"/>
                </c:if>
                <c:if test="${!i.Finished&&i.Started}">
                <input type="button" value="En cour" name="doIt" onclick="javascript:goProduit(${i.id})" />${i.id}
                </c:if>
                <c:if test="${!i.Started}">
                <input type="button" value="Commande" name="doIt" onclick="javascript:goProduit(${i.id})" />${i.id}
                </c:if>
                <br>
            </c:forEach> 

