package HomeWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//采用字符流拷贝一个字符文件.
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        FileReader fi = new FileReader("H:/NCL/曙光2.txt");
        FileWriter fo = new FileWriter("H:/NCL/曙光back.txt");

        char[] ch = new char[1024*8];
        int len;
        while ((len=fi.read(ch))!=-1){
            fo.write(ch,0,len);
        }
        fi.close();
        fo.close();
    }
}
