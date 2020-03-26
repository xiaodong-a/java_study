package HomeWork03;

public class BaskerballCoach extends Coach {
    public BaskerballCoach() {
    }

    public BaskerballCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println(getName()+"教如何运球和投篮");
    }

    @Override
    public void eat(String food) {
        System.out.println("篮球教练"+getName()+"吃"+food);
    }
}
