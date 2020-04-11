package HomeWork;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fi = new FileReader("H:/斗破苍穹.txt");
        char ch;
        int  cc;
        int count=0;
        while (count<100){
            System.out.println((char)fi.read());
            count++;
        }
        fi.close();
    }
}
