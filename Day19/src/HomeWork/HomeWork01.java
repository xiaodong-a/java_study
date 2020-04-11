package HomeWork;

import java.io.File;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/test1.txt");
        file.createNewFile();
        File dir = new File("D:/测试目录");
        dir.mkdir();
        System.out.println(file.getAbsolutePath());
        System.out.println(dir.getAbsolutePath());

        System.out.println(file.getName());
        System.out.println(dir.getName());

        System.out.println(file.length());
        System.out.println(dir.length());

        System.out.println(file.exists());
        System.out.println(dir.exists());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(dir.isFile());
        System.out.println(dir.isDirectory());
    }
}
