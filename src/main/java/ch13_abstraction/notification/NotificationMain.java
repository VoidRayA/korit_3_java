package ch13_abstraction.notification;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("admin@test.com",
                "user@example.com", "가입 대기", 1);

        emailNotification.setPriority(0);
        System.out.println(emailNotification.getPriority());
        emailNotification.printNotificationInfo();
        emailNotification.validateRecipient();
        // 실패 사례를 확인하고 싶다면 추가적인 객체를 생성하거나 혹은 setter를 통해
        // recipient 필드를 수정하는 방법도 고려할 수 있겠습니다. -> setter를 만든다면
        // NotificationSystem에 setRecipient를 추가해야함.
        emailNotification.send();
        emailNotification.updateMessage("가입 승인");
        // updateMessage()를 호출했지만 부모 클래스의 것이기 때문에 곧장 사용도 가능.
    }
}
