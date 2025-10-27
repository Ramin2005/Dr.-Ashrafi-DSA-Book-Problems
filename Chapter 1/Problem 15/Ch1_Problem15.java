
import java.util.Set;

public class Ch1_Problem15 {

    //approach 1
    //Queens({-1, -1, -1, -1, -1, -1, -1, -1}, 0, result)
    public static void QueensApproach1(int[] list, int column, Set<int[]> result) {

        //base case
        if (column == 8) {

            for (int i = 0; i < 8; i++) {
                list[i] += 1;
            }

            //add a copy of the current solution to result set
            result.add(list.clone());

        } else {

            //recursive case
            for (int i = 0; i < 8; i++) {

                //check if it's safe to place queen at (i, column)
                if (isSafe(list, i, column)) {

                    //place queen at (i, column)
                    list[column] = i;
                    //recur to place queen in next column
                    QueensApproach1(list, (column + 1), result);
                    //backtrack
                    list[column] = -1;

                }

            }

        }
    }

    //helper method to check if it's safe to place queen at (row, column)
    private static boolean isSafe(int[] list, int row, int column) {

        //check all previous columns
        for (int j = 0; j < column; j++) {

            //check same row
            if (list[j] == row) {

                return false;

            }

            //check diagonals
            if (Math.abs((column - j)) == Math.abs((list[j] - row))) {

                return false;

            }

        }

        return true;
    }
}
