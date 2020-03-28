package HomeWork04;

public class Dog extends Animal implements Sports{
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak(String str) {
        System.out.println(getName()+"说："+str);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"狗刨中！");
    }
    public void goplay(){
        speak("我去玩了！");
        swimming();
    }
}
