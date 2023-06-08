import java.util.Scanner;

public class Print_Maze_path_with_Jump {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
       printMazePathsWithJumps(0,0,n-1,m-1,"");
       
    }

    private static void printMazePathsWithJumps(int sr, int sc, int dr, int dc,String ans) {
        // base case 
        if(sc ==dc&& sr== dr){
            System.out.println(ans);
            return;
        }
   


        for (int h = 1; h <=dc-sc; h++) {
            printMazePathsWithJumps(sr, sc+h, dr, dc,ans+"h"+h);
        }
        for (int v = 1; v <=dr-sr; v++) {
            printMazePathsWithJumps(sr+v, sc, dr, dc,ans+"v"+v);
        }
        for (int d = 1; d <=dr-sr&&d<dc-sc; d++) {
            printMazePathsWithJumps(sr+d, sc+d, dr, dc,ans+"d"+d);
        }

    }
}
