import java.util.Scanner;

public class Print_Stairs_Paths {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        PrintSP(n,"");
    }

    private static void PrintSP(int n,String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
else if(n<0){
     return;
}
        PrintSP(n-1, ans+"1");
        PrintSP(n-2, ans+"2");

    }
}
