package test;

import main.intToHex;
import org.junit.Test;
/**
 * 使用任何你熟悉的语言实现函数intToHex，将一个整数转换为16进制的字符串（不能使用库函数）的测试
 *
 * @author liuziy
 * @createdate 2022/04/20
 *
 * */
public class intToHexTest {
    @Test
    public void iTHTest(){
        intToHex it = new intToHex();
        int sum1 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            it.exchange1(0);
            long end1 = System.currentTimeMillis();
            sum1 += end1-start1;
        }
        int sum2 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start2 = System.currentTimeMillis();
            it.exchange2(0);
            long end2 = System.currentTimeMillis();
            sum2 += end2-start2;
        }
        System.out.println("方法一运行时间： "+(sum1)+"ms");
        System.out.println("方法二运行时间： "+(sum2)+"ms");
    }
    @Test
    public void iTHTest1(){
        intToHex it = new intToHex();
        int sum1 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            it.exchange1(8);
            long end1 = System.currentTimeMillis();
            sum1 += end1-start1;
        }
        int sum2 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start2 = System.currentTimeMillis();
            it.exchange2(8);
            long end2 = System.currentTimeMillis();
            sum2 += end2-start2;
        }
        System.out.println("方法一运行时间： "+(sum1)+"ms");
        System.out.println("方法二运行时间： "+(sum2)+"ms");
    }
    @Test
    public void iTHTest2(){
        intToHex it = new intToHex();
        int sum1 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            it.exchange1(100000);
            long end1 = System.currentTimeMillis();
            sum1 += end1-start1;
        }
        int sum2 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start2 = System.currentTimeMillis();
            it.exchange2(100000);
            long end2 = System.currentTimeMillis();
            sum2 += end2-start2;
        }
        System.out.println("方法一运行时间： "+(sum1)+"ms");
        System.out.println("方法二运行时间： "+(sum2)+"ms");
    }
    @Test
    public void iTHTest3(){
        intToHex it = new intToHex();
        int sum1 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            it.exchange1(-1);
            long end1 = System.currentTimeMillis();
            sum1 += end1-start1;
        }
        int sum2 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start2 = System.currentTimeMillis();
            it.exchange2(-1);
            long end2 = System.currentTimeMillis();
            sum2 += end2-start2;
        }
        System.out.println("方法一运行时间： "+(sum1)+"ms");
        System.out.println("方法二运行时间： "+(sum2)+"ms");
    }
    @Test
    public void iTHTest4(){
        intToHex it = new intToHex();
        int sum1 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start1 = System.currentTimeMillis();
            it.exchange1(-100000);
            long end1 = System.currentTimeMillis();
            sum1 += end1-start1;
        }
        int sum2 = 0;
        for(int i = 0 ;i < 1000;i++){
            long start2 = System.currentTimeMillis();
            it.exchange2(-100000);
            long end2 = System.currentTimeMillis();
            sum2 += end2-start2;
        }
        System.out.println("方法一运行时间： "+(sum1)+"ms");
        System.out.println("方法二运行时间： "+(sum2)+"ms");
    }

}
