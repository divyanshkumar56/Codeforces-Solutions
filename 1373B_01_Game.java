import java.util.*;
 
public class Main{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int c0 = 0;
            int c1 = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') c0++;
                else c1++;
            }
            if(Math.min(c0,c1)%2==1) System.out.println("DA");
            else System.out.println("NET");
        }
}
}