package HomeWork05;

public class Keyboard implements USBinterface{
    @Override
    public void connet() {
        System.out.println("键盘连接了");
    }

    @Override
    public void disconnet() {
        System.out.println("键盘断开了");
    }
}
