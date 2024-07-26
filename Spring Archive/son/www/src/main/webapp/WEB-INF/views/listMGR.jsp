<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<style>
	*{
		font-family: pretendard;
	}
	h1{
		padding-top:2rem;
		padding-bottom:2rem;
		display:flex;
		justify-content:center;
	}
	h2{
		magin-top:30%;
		display:flex;
		justify-content:center;
	}
	#carouselExampleCaptions{
		display:flex;
		margin-left: auto;
    	margin-right: auto;
		width: 70%;
	}
	#table{
		display:flex;
		margin-top : 3rem;
		justify-content:center;
	}

	
</style>
<html>
	<head>
		<meta charset="UTF-8">
		<title>맛집 목록</title>
		<div><h1>맛집공유집</h1></div>
			<nav class="navbar navbar-expand-lg bg-body-tertiary">
			  <div class="container-fluid">
			    <a class="navbar-brand" href="http://192.168.0.10:8099/hom/main"> 맛집공유집 </a>
			    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
			    <div class="collapse navbar-collapse" id="navbarSupportedContent">
			      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
			        <li class="nav-item">
			          <a class="nav-link active" aria-current="page" href="http://192.168.0.10:8099/hom/add">맛집 추천하기</a>
			        </li>
			        <li class="nav-item">
			          <a class="nav-link active" aria-current="page" href="http://192.168.0.10:8099/hom/list">맛집 목록보기</a>
			        </li>
			        <!-- <li class="nav-item">
			          <a class="nav-link" href="#">Link</a>
			        </li> -->
			        <li class="nav-item dropdown">
			          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
			            	 종류로 찾기
			          </a>
			          <ul class="dropdown-menu">
			            <li><a class="dropdown-item" href="#">한식</a></li>
			            <li><a class="dropdown-item" href="#">중식</a></li>
			            <!-- <li><hr class="dropdown-divider"></li> -->
			            <li><a class="dropdown-item" href="#">일식</a></li>
			            <li><a class="dropdown-item" href="#">양식</a></li>
			            <li><a class="dropdown-item" href="#">기타음식</a></li>
			          </ul>
			        </li>
			        <li class="nav-item dropdown">
			          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
			            	 동네로 찾기
			          </a>
			          <ul class="dropdown-menu">
			            <li><a class="dropdown-item" href="#">서울</a></li>
			            <li><a class="dropdown-item" href="#">경기도</a></li>
			            <!-- <li><hr class="dropdown-divider"></li> -->
			            <li><a class="dropdown-item" href="#">강원도</a></li>
			            <li><a class="dropdown-item" href="#">충청도</a></li>
			            <li><a class="dropdown-item" href="#">전라도</a></li>
			            <li><a class="dropdown-item" href="#">경상도</a></li>
			          </ul>
			        </li>
			        <!-- <li class="nav-item">
			          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
			        </li> -->
			      </ul>
			      <form class="d-flex" role="search">
			        <input class="form-control me-2" type="search" placeholder="검색하기" aria-label="Search">
			        <button class="btn btn-outline-success" type="submit">Search</button>
			      </form>
			    </div>
			  </div>
			</nav>
		</head>
		<body>
		<div id="table">
		<table border = 1>
			<thead>
				<tr>
					<td>번호</td>
					<td>식당명</td>
					<td>음식종류</td>
					<td>위치</td>
					<td>대표메뉴</td>
					<td>가격</td>
					<td>수정</td>
					<td>삭제</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${allListMgr}" var="mvo">
				<tr>
					<td>${mvo.num}</td>
					<td>${mvo.name}</td>
					<td>${mvo.category}</td>
					<td>${mvo.place}</td>
					<td>${mvo.bestMenu}</td>
					<td>${mvo.price}</td>
					<td><a href="modNum?num=${mvo.num}">수정</a></td>
					<td><a href="delNum?num=${mvo.num}">삭제</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</div>
	</body>
</html>

