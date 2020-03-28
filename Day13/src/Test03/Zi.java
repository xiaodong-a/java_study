package Test03;

public class Zi extends Fu{
     int a=1;
   public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.a);
        z.setA(20);
        System.out.println(z.getA());

        Fu fu= new Zi();
     //   System.out.println(fu.a);
     //   fu.a=100;
      //  System.out.println(fu.a);
        System.out.println(fu.getA());
        fu.setA(121);
        System.out.println(fu.getA());
    }
}
