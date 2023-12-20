package day_067_mrt;

public class C127 {
    /*
    *  0        0
    *
    *           x         0
    *
    *  x                  x
    *
    * */
    public static void main(String[] args) {
        char[][] grid =new char[3][3];
          grid[1][1]='X';
          grid[0][0]='0';
          grid[2][0]='X';
          grid[0][1]='0';
          grid[2][2]='X';
          grid[1][2]='0';
          // line n1
          grid[2][1]='X'; // bunu yazinca 3 lü ardisik x olur
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[j].length ; j++) {
                System.out.println(grid[i][j]);

            }

        }
        //Which line of code, when inserted in place of //line n1, adds an X into the grid so that
        // the gird contains three consecutive Xs?
        // Ardisik 3 lü x olacak

        // Cevap= A (grid[2][1]='X'; )
    }
}
