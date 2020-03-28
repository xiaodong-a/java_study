package HomeWork03;

import HomeWork02.Pear;

public class Test {
    public static void main(String[] args) {
        Clothes clothes = new Clothes("白色","A");

        Person girl = new GirlFriend("小李",170);
        Person boy = new BoyFriend("小王",180);  //向上转换

        GirlFriend girl2 = (GirlFriend) girl;
        girl2.behavior(clothes);

        BoyFriend boy2 = (BoyFriend) boy;
        boy2.behavior(girl);  //已经自动向上转换为person
    }
}
