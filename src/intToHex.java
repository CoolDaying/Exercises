import org.junit.Test;

/**
 * 使用任何你熟悉的语言实现函数intToHex，将一个整数转换为16进制的字符串（不能使用库函数）。
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class intToHex {
    @Test
    public void exchange1() {
        int num = 1000;
        char[] chs = new char[8];
        int index = chs.length - 1;
        for (int i = 0; i < 8; i++) {
            int temp = num & 15;
            if (temp > 9) {
                chs[index] = ((char) (temp - 10 + 'A'));
            } else {
                chs[index] = ((char) (temp + '0'));
            }
            index--;
            num = num >>> 4;
        }
        System.out.println(toString(chs));
    }
    @Test
    public void exchange2(){
        int ten =1000;
        int ts,i = 7;
        char[] chs = new char[8];
        while(ten > 15){
            ts = ten % 16;
            ten = ten / 16;
            if(ts > 9)
                chs[i] = ((char) (ts - 10 + 'A'));
            else
                chs[i] = ((char) (ts + '0'));
            --i;
        }
        chs[i] = ((char) (ten + '0'));
        System.out.println(toString(chs));
    }
    private String toString(char[] chs) {
        String temp = "";
        for(int i = 0;i < chs.length;i++){
            temp = temp + chs[i];
        }
        return temp;
    }
}

