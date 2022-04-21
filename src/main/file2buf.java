package main;
import java.io.*;

/**
 * 将文件内容转换成byte数组返回,如果文件不存在或者读入错误返回null
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class file2buf{
    public static byte[] file2buffer(File fobj) throws IOException {
        if (!fobj.exists()) {
            return null;
        }
        byte[] b = new byte[1024];
        int n;
        ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
        try(FileInputStream fis = new FileInputStream(fobj)) {
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] data = bos.toByteArray();
        return data;
    }
}
