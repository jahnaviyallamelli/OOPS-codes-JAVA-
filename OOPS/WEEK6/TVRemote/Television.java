// File: TVRemote/Television.java
package TVRemote;

public class Television implements RemoteControl {
    private boolean isOn;
    private int currentChannel;

    public Television() {
        isOn = false;
        currentChannel = 0; // Default channel
    }

    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Welcome to TATA SKY");
        } else {
            System.out.println("TV is already ON.");
        }
    }

    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is switched OFF.");
        } else {
            System.out.println("TV is already OFF.");
        }
    }


    public void tuneChannel(int channel) {
        if (isOn) {
            switch (channel) {
                case 1:
                    System.out.println("Switched to STAR SPORTS CHANNEL");
                    break;
                case 2:
                    System.out.println("Switched to NGC CHANNEL");
                    break;
                case 3:
                    System.out.println("Switched to DISCOVERY CHANNEL");
                    break;
                case 4:
                    System.out.println("Switched to STARMOVIES CHANNEL");
                    break;
                case 5:
                    System.out.println("Invalid channel");
                    break;
                case 6:
                    System.out.println("Invalid channel");
                    break;
                default:
                    System.out.println("Invalid channel");
            }
        } else {
            System.out.println("TV is switched OFF. Please switch it ON first.");
        }
    }
}
