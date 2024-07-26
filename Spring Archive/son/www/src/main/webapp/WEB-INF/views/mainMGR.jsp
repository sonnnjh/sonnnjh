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
/* 		responsive: true;
		property: object-fit;
	  	values: (contain: contain, cover: cover, fill: fill, scale: scale-down, none: none,); */
	}
	
</style>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인홈페이지</title>
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
		<div>
			<h2>전국 맛집 랭킹 5</h2>
		</div>
		<div id="carouselExampleCaptions" class="carousel slide">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		  	<div class="carousel-item">
		      <img src="https://offloadmedia.feverup.com/secretseoul.com/wp-content/uploads/2022/05/31184338/shutterstock_1635970195-1-1024x683.jpg" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5> 지미원</h5>
		        <p><strong>주소</strong> 전라북도 전주시 완산구 풍남문2길 63</p>
		      </div>
		    </div>
		    <div class="carousel-item active">
		      <img src="https://myplanus.com/wp-content/uploads/2023/01/Urban-Hawker-3-1024x683.jpg" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5>도원</h5>
		        <p><strong>주소</strong>서울특별시 중구 소공로 119 (태평로2가) 더플라자 3층</p>
		      </div>
		    </div>
		    <div class="carousel-item">
		      <img src="https://static.hubzum.zumst.com/hubzum/2017/11/13/14/0f1816ea66a74b999b3ae10b0b11e1b8.jpg" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5>규우정</h5>
		        <p><strong>주소</strong> 서울특별시 강서구 방화대로 94</p>
		      </div>
		    </div>
		    <div class="carousel-item">
		    	<img src="https://www.jeonmae.co.kr/news/photo/202012/823785_517801_2122.jpg" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5>남원집</h5>
		        <p><strong>주소</strong> 전라북도 정읍시 태인면 태인로 29-3</p>
		      </div>
		    </div>
		    <div class="carousel-item">
		      <img src="https://a.cdn-hotels.com/gdcs/production22/d1618/ba0687e9-03a2-4418-b7fb-2de07e6fb83c.jpg?impolicy=fcrop&w=800&h=533&q=medium" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5> 경도회관</h5>
		        <p><strong>주소</strong> 전라남도 여수시 대경도길 2-2</p>
		      </div>
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
		
	</body>
</html>