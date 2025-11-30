<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Web Service Programming Homework</title>
    <link rel="stylesheet" href="/pyj-springdb/resources/student.css" type="text/css"></link>
</head>

<body>
    <header> TUKOREA 2025 <br> Web Service Programming Community </header>


    <nav>
        반갑습니다. <br>
        웹 서비스 프로그래밍 학생들을 위한 커뮤니티입니다. <br>
        <a href="http://localhost:8080/pyj-springdb/member/register" target="_self">
            커뮤니티에 가입하세요
        </a><br>
        <br>
        전체 회원 목록입니다. <br>
        <a href="http://localhost:8080/pyj-springdb/member/list" target="_self">
            전체 회원
        </a>
    </nav>

    <section>
    
     	<div style="text-align:center; margin: 50px auto 24px auto;">
            <iframe width="50%" height="360"
                src="https://www.youtube.com/embed/AF4IzD6aVU4?si=Cj5FQ2CvJdAgSWPy"
                title="YouTube video player"
                frameborder="0"
                allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                referrerpolicy="strict-origin-when-cross-origin"
                allowfullscreen>
            </iframe>
            
            
        </div>
        <div style="text-align:center;">
        <button onclick="playMusic()">노래 재생</button>

			<iframe id="yt-music" width="0" height="0"
    			src="https://www.youtube.com/embed/K4ZtVU5EqaE?enablejsapi=1&loop=1&playlist=K4ZtVU5EqaE"
    			frameborder="0"
    			allow="autoplay"
    			style="visibility:hidden; position:absolute;">
			</iframe>

			<script>
			function playMusic() {
    			document.getElementById("yt-music").contentWindow
        			.postMessage('{"event":"command","func":"playVideo","args":""}', '*');
			}
			</script>
		</div>
        
        <iframe src="/pyj-springdb/resources/html/rest.html"
                width="100%" height="420px"
                frameborder="0" seamless></iframe>
    </section>

    <footer>
        Copyright © 2025 PYJ All rights reserved. Tech University of Korea.
    </footer>
</body>
</html>
