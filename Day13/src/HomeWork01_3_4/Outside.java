package HomeWork01_3_4;

public class Outside {
        public void show(){
            int a=10;
            class Inside{
                public void show(){
                    System.out.println("a=" + a);//10
                }
            }
            Inside in = new Inside();
            in.show();
        }

    public static void main(String[] args) {
            Outside out = new Outside();
            out.show();
    }
}
