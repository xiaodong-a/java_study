package HomeWork02;

public class UiTeacher extends Staff implements Plot {
    public UiTeacher() {
    }

    public UiTeacher(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void plot() {
        System.out.println("UI讲师实现绘画接口");
    }
}
