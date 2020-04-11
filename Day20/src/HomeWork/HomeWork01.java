package HomeWork;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//采用字节流一次拷贝数组的方式拷贝一张图片.
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        FileInputStream  fi = new FileInputStream("H:/NCL/需要的库.PNG");
        FileOutputStream fo = new FileOutputStream("H:/NCL/需要的库2.PNG");
     /*   int by;
        while ((by=fi.read())!=-1){
            fo.write(by);
        }*/
     byte[] by = new byte[8*1024];
     int len;
     while ((len=fi.read(by))!=-1){
         fo.write(by,0,len);
     }
        fi.close();
        fo.close();
    }
}