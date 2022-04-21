package test;
import main.file2buf;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
/**
 * 将文件内容转换成byte数组返回,如果文件不存在或者读入错误返回null的测试
 *
 * @author liuziy
 * @createdate 2022/04/20
 *
 * */

public class file2bufTest {
    //空文件测试
    @Test
    public void fbTestEmpty() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("E:\\t.txt");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }

    @Test
    public void fbTestTxt() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("E:\\test.txt");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }

    @Test
    public void fbTestTxt1M() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("E:\\test1.txt");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
    @Test
    public void fbTestDoc() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("E:\\test.doc");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
    //34M的文本文件
    @Test
    public void fbTestDoc1M() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("E:\\test1.doc");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
}
