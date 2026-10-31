package in.strikes.springboot_core_demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("Payment done successfully");
    }
}
