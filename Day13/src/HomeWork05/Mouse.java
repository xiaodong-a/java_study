package HomeWork05;

public class Mouse implements USBinterface {
    @Override
    public void connet() {
        System.out.println("鼠标连接了");
    }

    @Override
    public void disconnet() {
        System.out.println("鼠标断开了");
    }
}
