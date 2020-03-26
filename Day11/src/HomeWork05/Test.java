package HomeWork05;

public class Test {
    public static void main(String[] args) {
        Clothes clothes = new Clothes("白色","A");

        Person girl = new GirlFriend("小李",170);//向上转换
        BoyFriend boy = new BoyFriend("小王",180);

        boy.behavior(girl);

        if(girl instanceof GirlFriend){
            GirlFriend girl1 = (GirlFriend) girl;  //向下转换
            girl1.behavior(clothes);
        }
    }
}
