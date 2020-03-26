package HomeWork03;

public class Test {
    public static void main(String[] args) {
        PingPangPlayer  ppp=new PingPangPlayer("小A",22);
        ppp.study();
        ppp.studyEnglish();
        ppp.eat("鱼");
        System.out.println();

        BasketballPlayer bkp=new BasketballPlayer("小B",23);
        bkp.study();
        bkp.eat("牛肉");
        System.out.println();

        PingPangCoach  ppc=new PingPangCoach("小C",24);
        ppc.teach();
        ppc.studyEnglish();
        ppc.eat("羊肉");
        System.out.println();

        BaskerballCoach  bkc =new BaskerballCoach("小D",25);
        bkc.teach();
        bkc.eat("虾");
    }
}
