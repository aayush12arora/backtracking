import java.util.ArrayList;
import java.util.Scanner;
public class Get_Maze_path_with_Jump1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        ArrayList<String> paths= getMazePathsWithJumps(0,0,n-1,m-1);
        System.out.println(paths);
    }

    private static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        // base case 
        
        
        ArrayList<String> paths = new ArrayList<>();
        
        if(sc ==dc&& sr== dr){
            ArrayList<String> bret = new ArrayList<>();
        bret.add("");
        return bret;
        }
        else if (sr > dr || sc > dc)
        {
          ArrayList< String> bres = new ArrayList< >();
          return bres;
        }
        

        //horizontal jumps
        for(int h=1;h<=dc-sc;h++){
        ArrayList<String> hpaths = getMazePathsWithJumps(sr, sc+h, dr, dc);
        for (String string : hpaths) {
            paths.add("h"+h+string);
                        
                    }
        }
        
        //verticala jumps
        for(int v=1;v<=dr-sr;v++){
            ArrayList<String> vpaths = getMazePathsWithJumps(sr+v, sc, dr, dc);
            for (String string : vpaths) {
                paths.add("v"+v+string);
                            
                        }
            }
        
        
          //diagonal jumps
        for(int d=1;d<=dr-sr&&d<=dc-sc;d++){
            ArrayList<String> dpaths =getMazePathsWithJumps(sr+d, sc+d, dr, dc);
            for (String string : dpaths) {
                paths.add("d"+d+string);
                            
                        }
            }
        
           
            
        
        
            return paths;
            }
}
