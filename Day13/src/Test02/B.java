package Test02;

public interface B {
    public default void method(){
        System.out.println("B default");
    }
}
