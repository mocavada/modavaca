package moc.com.spring.modavaca;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ModavacaApplication {

	public static void main(String[] args) {
	    SpringApplication.run(ModavacaApplication.class, args);
	}

}


@RestController
class Hello {

	@RequestMapping("/hello")
	String Greetings() {
		return "Hello Marc";
	}
}

