package HomeWork01_3_3;

public class Outside {
    private int a = 100;
    class Inside{
        private int a = 200;
        public void show(){
            int a = 300;
            System.out.println(Outside.this.a);//100
            System.out.println(this.a);//200
            System.out.println(a);//300
        }
    }

    public static void main(String[] args) {
        Outside.Inside in = new Outside().new Inside();
        in.show();
    }
}
