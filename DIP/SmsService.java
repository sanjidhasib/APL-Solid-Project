package DIP;

public class SmsService implements msg {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
    
}
