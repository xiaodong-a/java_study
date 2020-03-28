package HomeWork05;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Keyboard kb = new Keyboard();
        Computer cmp = new Computer();

        cmp.on();
        cmp.useUSB(mouse);
        cmp.useUSB(kb);
        cmp.off();
    }
}
