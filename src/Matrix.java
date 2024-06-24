public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 8, 7, 2, 9},
                {7, 0, 9, 4, 1},
                {6, 3, 5, 9, 8},
                {2, 4, 3, 6, 7},
                {2, 4, 3, 6, 5},
        };

//        int[][] matrix = {
//                {1, 8, 7, 2},
//                {7, 0, 9, 4},
//                {6, 3, 5, 9},
//                {2, 4, 3, 6}
//        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j == matrix[i].length - i - 1) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i < matrix.length / 2 && j <= i || i >= matrix.length / 2 && j <= matrix[i].length - i - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i < matrix.length / 2 && j >= matrix[i].length - i - 1 || i >= matrix.length / 2 && j >= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j < matrix.length / 2 && j >= i || j >= matrix.length / 2 && j <= matrix[i].length - i - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("********************************");


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j < matrix.length / 2 && j >= matrix[i].length - i - 1 || j >= matrix.length / 2 && j <= i) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }


}



