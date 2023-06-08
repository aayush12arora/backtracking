import java.util.ArrayList;
import java.util.Scanner;

public class Print_Maze_Paths {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
  
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc,String ans) {


        // base case 
if(sc ==dc&& sr== dr){
System.out.println(ans);
return;
}

if(sc<dc){
    printMazePaths(sr,sc+1,dr,dc, ans+"h");
}
       if(sr<dr){
        printMazePaths(sr+1,sc,dr,dc, ans+"v");
       }
       
    }
}
