package com.study.homework.homework7;

public class Test {
    public static void main(String[] args) {
        PingPangPlayer  ppp=new PingPangPlayer("小A",22);
        ppp.study();
        ppp.eat("鱼");

        BasketballPlayer bkp=new BasketballPlayer("小B",23);
        bkp.study();
        bkp.eat("牛肉");

        PingPangCoach  ppc=new PingPangCoach("小C",24);
        ppc.teach();
        ppc.eat("羊肉");

        BaskerballCoach  bkc =new BaskerballCoach("小D",25);
        bkc.teach();
        bkc.eat("虾");
    }
}
