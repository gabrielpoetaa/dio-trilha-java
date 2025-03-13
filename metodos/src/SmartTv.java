public class SmartTv {
    boolean onOrOff = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        onOrOff = true;
    }

    public void turnOff(){
        onOrOff = false;
    }

    public void setChannel (int newChannel) { 
        channel = newChannel;
        System.out.println("Canal alterado para: " + channel);
    }

    public void channelUp() {
        channel++;
        System.out.println("Canal alterado para: " + channel);
    }

    public void channelDown() {
        channel--;
        System.out.println("Canal alterado para: " + channel);
    }

    public void volumeUp(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }
}
