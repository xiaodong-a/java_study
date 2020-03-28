package HomeWork05;

public class Computer {
    public void on(){
        System.out.println("电脑开机");
    }
    public void off(){
        System.out.println("电脑关机");
    }
    public void useUSB(USBinterface usb){
        usb.connet();
        usb.disconnet();
    }
}
