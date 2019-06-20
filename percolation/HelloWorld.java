/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] grid;
        grid = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = false;

        System.out.println(Arrays.deepToString(grid));
    }
}
