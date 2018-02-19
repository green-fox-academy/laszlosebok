public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] multiArray = new int[4][4];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length ; j++) {
                if (i == j) {
                    multiArray[i][j] = 1;
                } else {
                    multiArray[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length ; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
