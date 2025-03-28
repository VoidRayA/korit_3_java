package ch13_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    TvRemoteController의 필드에 추가
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.
 */
public class Main {
    public static void main(String[] args) {
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                new PowerButton(), new ChannelDownButton(), new ChannelUpButton() ,new VolumeDownButton(), new VolumeUpButton());
//
//        tvRemoteController.onPressedPowerButton();
//        // Channel
//        tvRemoteController.onPressedChannelDownButton();
//        tvRemoteController.onDownChannelDownButton();
//        tvRemoteController.onPressChannelUpButton();
//        tvRemoteController.onUpChannelUpButton();
//
//        // Volume
//        tvRemoteController.onPressedVolumeDownButton();
//        tvRemoteController.onDownVolumeDownButton();
//        tvRemoteController.onPressVolumeUpButton();
//        tvRemoteController.onUpVolumeUpButton();

        /*
            과제 TempDownButton, TempUpButton, ACController 파일을 생성하고
            정의하여
            Main에 ACController 객체를 생성하고

            전원이 켜졌습니다

            온도를 한 칸 내립니다
            온도를 계속 내립니다

            온도를 한 칸 올립니다
            온도를 계속 올립니다

            전원이 꺼졌습니다.
         */

        ACController acController = new ACController(
                new PowerButton(), new TempDownButton(), new TempUpButton());

        acController.onPressedPowerButton();
        System.out.println();
        acController.onPressTempDownButton();
        acController.onDownTempDownButton();
        System.out.println();
        acController.onPressTempUpButton();
        acController.onUpTempUpButton();
        System.out.println();
        acController.onPressedPowerButton();
    }
}
