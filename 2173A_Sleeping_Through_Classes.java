import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int latestPos = Integer.MIN_VALUE;
            int count = 0;
 
            for (int i = 0; i < n ; i++) {
                if(s.charAt(i)=='0') {
                    {
                        if(latestPos < i-k) count++;
                    }
                }
                else latestPos = i;
            }
            System.out.println(count);
        }
    }
}