package com.razorpay.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentCheckout {
    @GetMapping("/payment")
    public String showPaymentPage() {
        // You may need to retrieve the order details and order ID from your database or service
        // String orderId = "order_NPdfrNcDnYwaXv"; // Replace with the actual order ID

        // Add the order ID to the model
        // model.addAttribute("orderId", orderId);

        // Return the Thymeleaf template name (without the ".html" extension)
        return "payment-request";
    }
}

