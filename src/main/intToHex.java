package main;

/**
 * 使用任何你熟悉的语言实现函数intToHex，将一个整数转换为16进制的字符串（不能使用库函数）。
 *
 * @author liuziy
 * @createdate 2022/04/19
 *
 * */
public class intToHex {
    public void exchange1(int num) {
        if(num == 0){
            System.out.println(num);
            return ;
        }
        char[] chs = new char[8];
        int index = chs.length - 1;
        //while
        while(num != 0) {
            int temp = num & 15;
            chs[index--] = (char) (temp + (temp > 9 ? 'A' - 10 : '0'));
    /*      不够简洁
            if (temp > 9) {
                chs[index] = ((char) (temp - 10 + 'A'));
            } else {
                chs[index] = ((char) (temp + '0'));
            }
    */
            num = num >>> 4;
        }
        System.out.println(toStringBulider(chs));
    }

    public void exchange2(int ten){
        if(ten == 0){
            System.out.println(ten);
            return ;
        }
        int ts,i = 7;
        char[] chs = new char[8];
        if(ten > 0){
            while(ten != 0){
                ts = ten % 16;
                ten = ten / 16;
                chs[i--] = (char) (ts + (ts > 9 ? 'A' - 10 : '0'));
            }
        }
        else{
            while(ten != 0){
                int temp = ten & 15;
                chs[i--] = (char) (temp + (temp > 9 ? 'A' - 10 : '0'));
                ten = ten >>> 4;
            }
        }
        System.out.println(toStringBulider(chs));
    }

    private StringBuilder toStringBulider(char[] chs) {
        StringBuilder temp = new StringBuilder("");
        for(int i = 0;i < chs.length;i++){
            temp = temp.append(chs[i]);
        }
        return temp;
    }
}

