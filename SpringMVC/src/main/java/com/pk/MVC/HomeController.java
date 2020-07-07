package com.pk.MVC;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pk.MVC.domain.User;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		return "home";
	}
	
	// form 요청을 GET으로 전송했을 때 처리할 메소드 (value의 값은 home.jsp의 링크의 URL과 일치해야함)
	@RequestMapping(value="form", method = RequestMethod.GET)
	public String form() {
		// 단순 페이지 이동은 jsp 파일의 이름만 리턴하면 됨(views 디렉토리 내 'form'.jsp 파일의 jsp를 제외한 이름과 동일해야함)
		return "form";
	}
	
	/*
	@RequestMapping(value="form", method = RequestMethod.POST)
	// 기존의  HttpServletRquest를 이용한 파라미터 처리를 위한 메소드
	public String form(HttpServletRequest request) {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		
		// 파라미터 콘솔에 출력
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("나이: " + age);
		
	
		return "result";
	}
	*/
	
	/*
	@RequestMapping(value="form", method = RequestMethod.POST)
	// @RequestParam을 이용한 파라미터 처리를 위한 메소드
	// String에서 파라미터 처리를 할 때 많이 사용 -> 동일한 이름의 파라미터가 여러 개 존재 시 List나 배열로 받는 것도 가능
	public String form(@RequestParam("name") String name, 
					   @RequestParam("phone") String phone,
					   @RequestParam("age") int age) {
		
		// 파라미터 콘솔에 출력
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("나이: " + age);
		
	
		return "result";
	}
	*/
	
	@RequestMapping(value="form", method = RequestMethod.POST)
	// command 객체를 이용하는 방법
	public String form(User user) {
		
		// 파라미터 콘솔에 출력
		System.out.println(user);
	
		return "result";
	}
	
	// Web page 트렌드이므로 웹페이지 구현 시 적용해 볼 것
	@RequestMapping(value="detail/{num}", method = RequestMethod.GET)
	// 경로를 변수로 이용하고자 할 때 읽어내는 방법 : 최근 블로그형 게시판에 이용
	public String detail(@PathVariable("num") int num) {
		
		// 파라미터 콘솔에 출력
		System.out.println(num);
	
		return "result";
	}
	
	
	
}
