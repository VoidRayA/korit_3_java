package ch13_abstraction.notification;
/*
    1. NotificationSystem을 상속 받으시오.
        빨간 줄 뜨는거 처리
    2. 추상 메서드들을 구현하시오.
        send()
        실행 예
        이메일 전송 중...
        "여기에 메시지가 출력되어야합니다"
        이메일 전송 완료 !

        formatMessage()
        실행 예
        <p>"여기에 메시지가 출력되어야 합니다"</p>
        메시지가 HTML 형식으로 포맷되었습니다

        이거 하고 나서 추후 getMessage()를 하게 됐을 때
        <p>여기에 메시지가 출력되어야 합니다</p>
        로 바뀌어야 합니다.
        그 말은 updateMessage()를 응용해야할 필요성이 있습니다.

        필요 하에 추상 클래스에  Getter / Setter가
        추가되어야할 수도 있을 것 같습니다.
        서브 클래스를 작성해보시고 필요하면 슈퍼 클래스에
        추가해서 코드를 완성합시다.

        validateRecipient()
 */
public class EmailNotification extends NotificationSystem {
    public EmailNotification(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }

    @Override
    public void send() {
        System.out.println("이메일 전송 중...");
        System.out.println(getMessage());       //메시지 출력
        System.out.println("이메일 전송 완료 !");
    }

    @Override
    public void validateRecipient() {   //수신자 검증 @ 있는지를 확인
        // recipient 데이터에 @가 있는지 확인하기 위한 조건문
        if(!getRecipient().contains("@")){      // String
            System.out.println("잘못된 이메일 주소 형식입니다.");
        }
        System.out.println("이메일 주소 형식이 유효합니다.");
    }

    @Override
    public void formatMessage() {
        String formatted = "<p>" + getMessage() + "</p>";
        updateMessage(formatted);
        System.out.println("메시지가 HTML 형식으로 포맷되었습니다.");
    }
}
