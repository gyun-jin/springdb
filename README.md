# springdb

## 프로젝트 소개

Spring MVC와 JDBC를 사용해 학생 정보를 관리하는 웹 애플리케이션입니다.

JSP 기반 화면과 REST API를 함께 구성하고, `JdbcTemplate`을 사용해 MySQL의 `STUDENT` 테이블에 접근하는 구조를 학습하기 위한 프로젝트입니다.

## 주요 기능

- 학생 정보 등록
- 학생 정보 목록 조회
- 학생 상세 조회
- 학생 정보 수정
- 학생 정보 삭제
- JSP 기반 웹 화면
- REST API 테스트 화면
- `JdbcTemplate` 기반 데이터 접근

## 기술 스택

- Java
- Spring MVC
- Spring JDBC
- JSP / JSTL
- MySQL
- Maven
- Lombok
- Jackson
- JUnit

## 프로젝트 구조

```text
src/main/java/org/tukorea/jdbc
├── config
│   ├── RootConfig.java
│   ├── ServletConfig.java
│   └── WebConfig.java
├── controller
│   ├── HomeController.java
│   ├── MemberController.java
│   └── MemberRestController.java
├── domain
│   └── StudentVO.java
├── persistence
│   ├── MemberDAO.java
│   └── MemberDAOImpl.java
└── service
    ├── MemberService.java
    └── MemberServiceImpl.java
```

## 실행 방법

### Prerequisites

- Java
- Maven
- MySQL
- Servlet Container 또는 IDE 내장 서버

### Installation

```bash
git clone https://github.com/gyun-jin/springdb.git
cd springdb
mvn package
```

## 설정

`RootConfig.java`의 MySQL 연결 정보를 실행 환경에 맞게 수정해야 합니다.

```java
dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/springdb");
dataSource.setUsername("your_username");
dataSource.setPassword("your_password");
```

## 학습 포인트

- Spring MVC 프로젝트 구조
- Java Config 기반 Web Application 설정
- Controller, Service, DAO 계층 분리
- `JdbcTemplate`을 활용한 CRUD 구현
- JSP/JSTL 기반 View 구성
- REST Controller와 일반 Controller 구성 비교
