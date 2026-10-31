package in.strikes.springboot_core_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {


    PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return this.paymentProperties.getType();
    }

    public int getRetryCount() {
        return this.paymentProperties.getRetryCount();
    }

    public boolean isEnabled() {
        return this.paymentProperties.isEnabled();
    }

    public int getTimeout() {
        return this.paymentProperties.getTimeout();
    }


}
