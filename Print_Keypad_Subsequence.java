import java.util.Scanner;

public class Print_Keypad_Subsequence {
    static String []code = {"" ,"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nu= sc.next();
        
        printKSS(nu,"");
    }

    private static void printKSS(String nu,String ans) {
if(nu.length()==0){
    System.out.println(ans);
    return;
}
        char ch = nu.charAt(0);
        String lques = nu.substring(1);
        int a = Integer.parseInt(String.valueOf(ch));
        String  ncodes = code[a];
        for (int i = 0; i < ncodes.length(); i++) {
            char c = ncodes.charAt(i);
            
           /// ans = ans+c;
            printKSS(lques, ans+c);
        }
    }
}
