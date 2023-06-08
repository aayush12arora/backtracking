//package Java_Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths {
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter number of rows");
    int n = sc.nextInt();
    System.out.println("Enter number of columns");
    int m = sc.nextInt();
    ArrayList<String> paths= getMazePaths(0,0,n-1,m-1);
    System.out.println(paths);
}

private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
// base case 
if(sc ==dc&& sr== dr){
    ArrayList<String> bret = new ArrayList<>();
bret.add("");
return bret;
}


    ArrayList<String> hpaths = new ArrayList<>();
    if(sc<dc){
        hpaths=      getMazePaths(sr, sc+1, dr, dc);
    }

    ArrayList<String> vpaths = new ArrayList<>(); 
    if(sr<dr){
        vpaths=  getMazePaths(sr+1, sc, dr, dc);
    }


    ArrayList<String>retpaths = new ArrayList<>();
    for (String string : hpaths) {
        retpaths.add("h"+string);
                    
                }


    for (String string : vpaths) {

        retpaths.add("v"+string);   
    }
    


    return retpaths;
}

}
