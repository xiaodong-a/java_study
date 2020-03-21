package com.study;
//2020 03 19
//看到上午老师的五子棋程序，自己想写一个
//重点是如何判断五子连珠，如果是每次下棋后判断这子周围有无连珠，应该比较快，但是边界处理麻烦。
//先写个简单的搞出来，如果五子连珠，必定有个5x5的网格连珠.
//最简单的10x10，其实可以更灵活，不想费时间了
import java.util.Scanner;
class QiPan {

    static int[][]  qipan = new int[10][10];

    //qipan存储棋子数据，初始化数据为0
    public static void initQiPan(){
        System.out.println("10x10棋盘测试版，请按规定输入，否则棋盘会崩溃");
        System.out.println("先手执◯，后手执⬤");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                qipan[i][i]=0;
            }
        }
    }

    //展示棋子，0代表无子+，1代表◯,2代表⬤；先手1  后手2
    public static void  showQiPan(){
        System.out.println("   1  2  3  4  5  6  7  8  9  10");
        for(int i=0;i<10;i++){
            if(i!=9) {
                System.out.print(" "+(i + 1) + " ");
            }else{
                System.out.print((i + 1) + " ");
            }
            for(int j=0;j<10;j++){
                String symbol = qipan[i][j] == 0? "+  ":(qipan[i][j]==1? "◯ ":"⬤ ");
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
    //判断5x5棋盘五子连珠，这个写的很差
    public static boolean wuZiLianzhu(int[][] qipan2){
        //每行判断，是否结束
        for(int i=0;i<5;i++){
            if(qipan2[i][0]==1&&qipan2[i][1]==1&&qipan2[i][2]==1&&qipan2[i][3]==1&&qipan2[i][4]==1){
                System.out.println("先手者胜，GameOver");
                return true;
            }
            if(qipan2[i][0]==2&&qipan2[i][1]==2&&qipan2[i][2]==2&&qipan2[i][3]==2&&qipan2[i][4]==2){
                System.out.println("后手者胜，GameOver");
                return true;
            }
        }
        //每列判断，是否结束
        for(int j=0;j<5;j++){
            if(qipan2[0][j]==1&&qipan2[1][j]==1&&qipan2[2][j]==1&&qipan2[3][j]==1&&qipan2[4][j]==1){
                System.out.println("先手者胜，GameOver");
                return true;
            }
            if(qipan2[0][j]==2&&qipan2[1][j]==2&&qipan2[2][j]==2&&qipan2[3][j]==2&&qipan2[4][j]==2){
                System.out.println("后手者胜，GameOver");
                return true;
            }
        }

        //对角判断是否结束
        if(qipan2[0][0]==1&&qipan2[1][1]==1&&qipan2[2][2]==1&&qipan2[3][3]==1&&qipan2[4][4]==1){
            System.out.println("先手者胜，GameOver");
            return true;
        }
        if(qipan2[0][4]==1&&qipan2[1][3]==1&&qipan2[2][2]==1&&qipan2[3][1]==1&&qipan2[4][0]==1){
            System.out.println("先手者胜，GameOver");
            return true;
        }
        if(qipan2[0][0]==2&&qipan2[1][1]==2&&qipan2[2][2]==2&&qipan2[3][3]==2&&qipan2[4][4]==2){
            System.out.println("后手者胜，GameOver");
            return true;
        }
        if(qipan2[0][4]==2&&qipan2[1][3]==2&&qipan2[2][2]==2&&qipan2[3][1]==2&&qipan2[4][0]==2){
            System.out.println("后手者胜，GameOver");
            return true;
        }
        return false;
    }

    //10x10棋盘判断是否游戏结束
    public static boolean gameOver(){
        int[][] smallqipan = new int[5][5];
        //10x10棋盘拆分成25个5x5棋盘。算法不够好
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                //给small棋盘赋值,有数组切片就好了。这块还没去了解
                for(int ii=0;ii<5;ii++){
                    for(int jj=0;jj<5;jj++){
                        smallqipan[ii][jj]=qipan[i+ii][j+jj];
                    }
                }
                if(wuZiLianzhu(smallqipan)){
                    return true;
                }
            }
        }
        return false;
    }

    //落子判断，有子不能落子，有子则落子。超出棋盘不能下子，
    public static boolean luoZi(int row,int col,int number){
        if(row>9 || row <0 || col>9 ||col<0){
            System.out.println("超出棋盘范围，请重新落子");
            return false;
        }
        if(qipan[row][col]!=0){
            System.out.println("此处有子，请重新落子");
            return false;
        }
        qipan[row][col]=number;  //第二种方法，可在此处，在落子周围进行五子连珠判断；好像边界考虑也不难，之后再写第二种
        return true;
    }

    //和棋判断，无五子连珠，且棋盘已满
    public static boolean  heQi(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(qipan[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println("和棋！");
        return true;
    }
}

//10x10棋盘对象已经写好，可以下棋了
public class WuZiQi{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        QiPan  gobang = new QiPan();
        int flag = 1; // 奇数先手者下棋，偶数后手者下棋
        int  row;
        int  col;
        gobang.initQiPan();
        gobang.showQiPan();
        while (gobang.gameOver()!=true && gobang.heQi()!=true){
            if (flag%2==1){
                System.out.println("先手者下棋：◯");
                System.out.print("下在哪一行(请输入整数)：");
                row =in.nextInt();
                System.out.print("下在哪一列(请输入整数)：");
                col =in.nextInt();
                if(gobang.luoZi(row-1,col-1,1)){
                    gobang.showQiPan();
                    flag+=1;
                }
            }else{
                System.out.println("后手者下棋：◯");
                System.out.print("下在哪一行(请输入整数)：");
                row =in.nextInt();
                System.out.print("下在哪一列(请输入整数)：");
                col =in.nextInt();
                if(gobang.luoZi(row-1,col-1,2)){
                    gobang.showQiPan();
                    flag+=1;
                }
            }
        }
    }
}