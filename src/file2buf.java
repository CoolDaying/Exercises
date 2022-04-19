import java.io.*;

/**
 * 将文件内容转换成byte数组返回,如果文件不存在或者读入错误返回null
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class file2buf{
    public static void main(String[] args) {
        File file = new File("E:\\test.txt");
        byte[] byteOutput = file2buf.file2buffer(file);
        System.out.println(byteOutput);
    }
    public static byte[] file2buffer(File fobj) {
            try {
                FileInputStream fis = new FileInputStream(fobj);
                ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
                byte[] b = new byte[1024];
                int n;
                while ((n = fis.read(b)) != -1) {
                    bos.write(b, 0, n);
                }
                fis.close();
                byte[] data = bos.toByteArray();
                bos.close();
                return data;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
}
