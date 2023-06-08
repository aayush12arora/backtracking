import java.util.Scanner;

public class Print_Permutation_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       print_permutation(str,"");
      
    }

    private static void print_permutation(String S,String ans) {
        if(S.length()==0){
      System.out.println(ans);
      return;
        }
         
        for(int i =0;i<S.length();i++){
           char ch = S.charAt(i);
        String left = S.substring(0,i)+S.substring(i+1); 
    print_permutation(left,ans+ch);
      
        }
    }
}
