package com.test.memo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// IoC(Inversion of Control)컨테이너(Spring컨테이너)로 사용되는 
				// ApplicationContext 객체 생성하기 
				// 이것은 XML 설정을 로드함으로써 생성할 수 있다. 
				ApplicationContext context = new GenericXmlApplicationContext("classpath:memo.xml");

				// 빈(bean) 객체 생성하기
				Imemo memo = context.getBean("memo", Imemo.class); 
				// memo.xml 파일에서 id 가 "memo"로 되어진 객체를 얻어옴.
				
				//메모 쓰기 (프록시 객체를 통한 주업무 호출)
				memo.write("스프링 공부하기");	
				
				////////////////////////////////////////////////////
				// == 메모 수정(주업무 추가) ==
				memo.edit("AOP 공부하기");
				////////////////////////////////////////////////////
				// == 메모 삭제(주업무 추가) ==
				memo.del(2);
				////////////////////////////////////////////////////
				// == 메모 읽기(주업무 추가) ==
				try {
					memo.read(10);
					memo.read(-2);
				} catch (Exception e) {
					
				}
				
				
				
	}


}
