import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c =sc.next().toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i= c.length-1;i>=0;i--) {
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}
