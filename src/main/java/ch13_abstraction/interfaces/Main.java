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
        // Channel
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton() ,new VolumeDownButton(), new VolumeUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        // Volume
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
    }
}
