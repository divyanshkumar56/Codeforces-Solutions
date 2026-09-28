import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int cc = 0;
        int cs = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>=65 && ch<=90) cc++;
            else cs++;
        }
        if(cc>cs) System.out.println(word.toUpperCase());
        else System.out.println(word.toLowerCase());
    }
}