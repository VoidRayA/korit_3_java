package ch13_abstraction.notification;
/*
    전화번호 위주로 작성
 */
public class SMSNotification extends NotificationSystem {
    public SMSNotification(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }

    @Override
    public void send() {

    }

    @Override
    public void validateRecipient() {

    }

    @Override
    public void formatMessage() {

    }
}
