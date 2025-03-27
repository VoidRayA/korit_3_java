package ch13_abstraction.notification;
/*
    추상 클래스 : NotificationSystem
    서브 클래스 : EmailNotification / SMSNotification
    1. 추상 클래스는 공통된 필드를 가집니다.
        1) String sender : 알림 발신자
        2) String recipient : 알림 수신자
        3) String message : 알림 메세지
        4) int priority : 알림 우선순위(1-5 범위)
        5) AllArgsConstructor로 생성자 생성

    2. 다음과 같은 메서드를 가집니다.
        void printNotificationInfo() : 알림 정보 출력
            실행 예
            [ 알림 정보 ]
            From : admin@test.com
            To : user@example.com
            Message : 가입을 축하합니다!
            Priority : 2

        void updateMessage(String newMessage) : 메세지 수정
            실행 예
            updateMessage("가입 승인");으로 출력
            '가입 대기'가 '가입 승인' 으로 변경되었습니다!

        priority 관련 setter / getter
            setPriority에서 주의할 점 :
                1 ~ 5의 범위를 가집니다. 내부에 로직을 작성할 필요가 있음

        추상 메서드
        void send() : 알림 전송
        void validateRecipient() : 수신자 유효성 검증
        void formatMessage() : 메시지 포맷 처리
 */
public abstract class NotificationSystem {
    private String sender;
    private String recipient;
    private String message;
    private int priority;

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if(priority > 0 && priority < 6){
            this.priority = priority;
        }else{
            System.out.println("지정 불가능한 우선순위 입니다.");
            return;
        }
    }

    public NotificationSystem(String sender, String recipient, String message, int priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.priority = priority;
    }

    public void printNotificationInfo(){
        System.out.println("[ 알림 정보 ]");
        System.out.println("From : " + sender);
        System.out.println("To : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Priority : " + priority);
    }

    public void updateMessage(String newMessage){
        System.out.println("'"+ this.message +"'가 '" + newMessage + "' 으로 변경되었습니다!");
        this.message = newMessage;
    }

    public abstract void send();
    public abstract void validateRecipient();
    public abstract void formatMessage();
}
