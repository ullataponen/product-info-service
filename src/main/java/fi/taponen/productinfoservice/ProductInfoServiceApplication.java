package fi.taponen.productinfoservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import fi.taponen.productinfoservice.domain.Product;
import fi.taponen.productinfoservice.domain.ProductRepository;

@SpringBootApplication
@EnableEurekaClient
public class ProductInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInfoServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return (args) -> {
			Product p1 = new Product("Hammer", "Fiskars");
			Product p2 = new Product("Electric drill", "Makita");
			Product p3 = new Product("Knife", "Marttiini");
			Product p4 = new Product("Chainsaw", "Bosch");
			Product p5 = new Product("Lawnmower", "John Deere");
			
			repository.save(p1);
			repository.save(p2);
			repository.save(p3);
			repository.save(p4);
			repository.save(p5);
		};
	}

}
