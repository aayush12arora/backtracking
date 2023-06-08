import java.util.Scanner;

public class Flood_Fill {
 public static void main(String[] args) {
    int n,m;
    Scanner sc = new Scanner(System.in);
  m =sc.nextInt();
    n= sc.nextInt();
    boolean visited[][]= new boolean[m][n];    
int  maze[][]= new int[m][n];
for (int i = 0; i < maze.length; i++) {
    for (int j = 0; j < maze[i].length; j++) {
        maze[i][j]=sc.nextInt();
    }
}

    floodFill(maze,0,0,"",visited);
}

private static void floodFill(int[][] maze, int sr, int sc, String string, boolean[][] visited) {

if(sr<0||sc<0||sr==maze.length||sc==maze[0].length||maze[sr][sc]==1||visited[sr][sc]==true){
    return;
}
if(sr==maze.length-1&&sc==maze[0].length-1){
    System.out.println(string);
    return;
}
   visited[sr][sc]=true;
    floodFill(maze, sr-1, sc, string+"t", visited);
    floodFill(maze, sr, sc-1, string+"l", visited);
    floodFill(maze, sr+1, sc, string+"d", visited);
    floodFill(maze, sr, sc+1, string+"r", visited);
    visited[sr][sc]=false;
}
}
