package ch13_abstraction.interfaces;

public class ACController {
    private PowerButton powerButton;
    private TempDownButton tempDownButton;
    private TempUpButton tempUpButton;

    public ACController(PowerButton powerButton, TempDownButton tempDownButton, TempUpButton tempUpButton) {
        this.powerButton = powerButton;
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
    }

    // Power
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    // Channel
    public void onPressTempDownButton() {
        tempDownButton.onPressed();
    }

    public void onDownTempDownButton() {
        tempDownButton.onDown();
    }

    public void onPressTempUpButton() {
        tempUpButton.onPressed();
    }

    public void onUpTempUpButton() {
        System.out.println(tempUpButton.onUp());
    }
}
