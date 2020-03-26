package HomeWork05;

public class BoyFriend extends Person{
    public BoyFriend(String name, double height) {
        super(name, height);
    }

    public BoyFriend() {
    }
    public void behavior(Person p){
        System.out.println("挣钱，和"+p.getName()+"一块逛街");
    }
}
