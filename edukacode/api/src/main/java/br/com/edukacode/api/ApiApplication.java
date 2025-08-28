package br.com.edukacode.api;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ApiApplication.class, args);

		Genero genero1 = new Genero(1L, "Ação");
		System.out.println(genero1);

		Genero genero2 = new Genero(2L, "Drama");
		System.out.println(genero2);
	}

}
