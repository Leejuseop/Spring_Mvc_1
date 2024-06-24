package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletApplication { 

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);

		//강의 안들은거부터 보면됨
		//redirect는 그 이게 코드스페이스여서 주소값이 잘못되서 안넘어가짐 뭐 수동으로 설정하는 방법이던 어떻게든 해결할수있을듯. 오류는 아님.
		//람다식 문법이 좀 이해가 안감. 람다 문법 공부하기
		//VIEW쪽도 이해가 조금 부족함 느낌만 있음
		//V5에 저장이 안되는데 이거 모르겠음 ParseInt로 null이 넘어간다는ㄷ ㅔ... 모르겟져 일단 스프링부터 공부하고 V5써야되는 일 있으면 그때 피드백하자 
		//springmvc new-form 404에러 나는데 진짜 왜 나는지 모르겠음 매핑이 안되는거같은데 왜 와이? 질문해놨으니깐 확인하기.
		//위 두개 문제는 코드스페이스 자체 오류인걸로. 다른사람이 코드 내려받아서 돌릴땐 된데. 캐시비우기 해보라는데 지금 환경에선 어케 하는지 모르겠음. 
	}
}