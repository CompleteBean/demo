package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    /*bean = Controller(Request를 제일 먼저 만나는 애(Get,Post, PUT, DELETE) 서블릿 개념)
             Service(Business 영역)
             Repository(DAO와 같음, 쿼리를 날리고 결과를 가져옴) (데이터베이스 전문)
             Component(Provider영역이며 서비스에 어떤 게 필요하면 제공하는 역할 로그인, 토큰 일종의 논리영역) API호출
             Configuration : 데이터베이스 연결설정, ssl설정 보안, CORS(다른 도메인에서 호출할 수 없게 하는 디펜스) 등

             서버가 뜰 때 @SpringBootApplication의 역할 -> Bean을 등록한다(Repo, Service, Compo, Config를 가져오는 행위)
             요청 -> Controller -> Service || Component -> Repository
             응담 -> Repository -> Service(결과전달) -> Controller -> 브라우저에 뿌려준다.

    */


}
