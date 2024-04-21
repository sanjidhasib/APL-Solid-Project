package DIP;
 
//*************************************************************************

// Title : A java programme to demonstrate Dependency Inversion Principle (DIP).
// Author : Sanjidul Hasan Hasib, Undergrduate student, Khulna University.
//*

public class Main {
   
        public static void main(String[] args) {
            // Create instances of email and SMS services
            msg emailService = new EmailService();
            msg smsService = new SmsService();

            // Send messages using email and SMS services
            emailService.sendMessage("Hello, this is an email message.");
            smsService.sendMessage("Hello, this is an SMS message.");
        }
    
}


/**
 * the usage of messaging services by creating instances of EmailService and
 * SMSService
 * and sending messages using them.
 * 
 * & if I want to change something, i  need to change the intermediate
 * block, not all the blocks above it.
 * 
 * This adheres to the Dependency Inversion
 * Principle
 * 
 * 
 */

