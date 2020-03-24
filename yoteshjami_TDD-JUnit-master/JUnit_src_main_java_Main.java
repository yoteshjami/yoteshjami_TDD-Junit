import java.util.Scanner;
public class Main {
    public static String reverseString(String s,int n) {
        if( (n < 2 && n >= 0) || s==""){
            return s;
        }
        String s1=s.substring(s.length()-2);
        StringBuilder sb=new StringBuilder(s1);
        String l=sb.reverse().toString();
        return s.substring(0,s.length()-2)+l;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = st.length();
        String st1=reverseString(st,n);
        System.out.println(st1);
    }
}
