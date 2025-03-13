public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.onOrOff);
        System.out.println("Canal atual? " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("=================");
        smartTv.turnOn();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeDown();
        smartTv.setChannel(88);
        smartTv.channelDown();
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("TV ligada? " + smartTv.onOrOff);
        System.out.println("=================");
        smartTv.turnOff();
        System.out.println("TV ligada? " + smartTv.onOrOff);
    }
}
