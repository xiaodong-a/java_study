package HomeWork02;

public class Test01 {
    public static void main(String[] args) {
        zhaZhi(new Apple());
        zhaZhi(new Banana());
        zhaZhi(new Pear());

    }
    public static void zhaZhi(Fruit  f){
        f.getJuice();
    }
}
