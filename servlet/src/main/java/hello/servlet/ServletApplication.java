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
		//mvc부터 들으면 됨 ,,
	}
}
