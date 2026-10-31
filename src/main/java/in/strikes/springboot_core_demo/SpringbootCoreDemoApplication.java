package in.strikes.springboot_core_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootCoreDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootCoreDemoApplication.class, args);
		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		paymentGateway.setType("Paypal");
//		paymentGateway.setRetryCount(10);
		System.out.println( "PaymentGateway type: " + paymentGateway.getType());
	}

}
