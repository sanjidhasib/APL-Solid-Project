package DIP;

public class EmailService implements msg {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
