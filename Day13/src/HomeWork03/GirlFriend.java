package HomeWork03;

public class GirlFriend extends Person{
    public GirlFriend(String name, double height) {
        super(name, height);
    }
    public GirlFriend() {
    }
    public void behavior(Clothes c){
        System.out.println("做饭，洗"+c.getBrand()+"品牌"+
                c.getColor()+"的衣服");
    }
}
