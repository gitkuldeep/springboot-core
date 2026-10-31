package in.strikes.springboot_core_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootCoreDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(SpringbootCoreDemoApplication.class, args);
		// This is just for demo using springboot we no need to get bean from ApplicationContext
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.placeOrder();

	}

}
