<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<div id="navigation">
   <ul>
      <c:choose>
         <c:when test="${param.menu == '' }">
            <li class="selected"><a
               href="${pageContext.request.contextPath }/">HOME</a></li>
            <li><a href="${pageContext.request.contextPath }/board/photoindex">사진 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/board/videoindex">영상 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/user/mypost">내 게시글</a></li>
         </c:when>
         <c:when test="${param.menu == 'photoindex' }">
            <li><a href="${pageContext.request.contextPath }/">HOME</a></li>
            <li class="selected"><a
               href="${pageContext.request.contextPath }/board/photoindex">사진 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/board/videoindex">영상 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/user/mypost">내 게시글</a></li>
         </c:when>
         <c:when test="${param.menu == 'videoindex' }">
         	<li><a href="${pageContext.request.contextPath }/">HOME</a></li>
            <li><a href="${pageContext.request.contextPath }/board/photoindex">사진 게시판</a></li>
            <li class="selected"><a
               href="${pageContext.request.contextPath }/board/videoindex">영상 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/user/mypost">내 게시글</a></li>
         </c:when>
         <c:when test="${param.menu == 'myPost' }">
            <li><a href="${pageContext.request.contextPath }/">HOME</a></li>
            <li><a href="${pageContext.request.contextPath }/board/photoindex">사진 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/board/videoindex">영상 게시판</a></li>
            <li class="selected"><a
               href="${pageContext.request.contextPath }/user/mypost">내 게시글</a></li>
         </c:when>
         <c:otherwise>
            <li><a href="${pageContext.request.contextPath }/">HOME</a></li>
            <li><a href="${pageContext.request.contextPath }/board/photoindex">사진 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/board/videoindex">영상 게시판</a></li>
            <li><a href="${pageContext.request.contextPath }/user/mypost">내 게시글</a></li>
         </c:otherwise>
         
      </c:choose>