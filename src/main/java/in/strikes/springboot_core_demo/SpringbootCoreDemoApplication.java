package in.strikes.springboot_core_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootCoreDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootCoreDemoApplication.class, args);
		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
		System.out.println( "PaymentGateway type: " + paymentGateway.getType());
		System.out.println( "PaymentGateway retryCount: " + paymentGateway.getRetryCount());
		System.out.println( "PaymentGateway enabled: " + paymentGateway.isEnabled());
		System.out.println( "PaymentGateway timeout: " + paymentGateway.getTimeout());
	}

}
