package ma.hansal.demoThym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = "ma.hansal.entities")
@ComponentScan(basePackages = {"ma.hansal.controllers"})
@EnableJpaRepositories(basePackages = "ma.hansal.repositories")
public class DemoThymApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoThymApplication.class, args);
	}

}
