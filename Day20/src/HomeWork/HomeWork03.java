package HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        FileReader fi = new FileReader("H:/斗破苍穹.txt");
        char ch;
        int  cc;
        int count=0;
        int total=0;
        while ((cc=fi.read())!=-1){
            total++;
            ch = (char) cc;
            if (ch=='的') count++;
        }
        System.out.println(total);
        System.out.println(count);
        fi.close();
    }
}
