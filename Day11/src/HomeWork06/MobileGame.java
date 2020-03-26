package HomeWork06;

public class MobileGame extends Game{
    public MobileGame() {
    }

    public MobileGame(String type, String name) {
        super(type, name);
    }

    public void efforts(){
        System.out.println("晚上不睡觉玩"+getName());
    }
    public void damage(){
        System.out.println("导致白天上课困，毕业后找不到工作");
    }
    public void prepare(){
        efforts();
        damage();
    }

    @Override
    public void play() {
        System.out.println("名称为"+getName()+"的"+getType()+
                "游戏非常流行");
    }
}
