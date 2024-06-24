public class Tasks {
    public static void main(String[] args) {

        //Task1
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 2;
        }
        for (int el : arr1) {
            System.out.print(el + " ");
        }
        System.out.println();

        //Task2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }
        for (int el : arr2) {
            System.out.print(el + " ");
        }
        System.out.println();

        //Task3
        int[] arr3 = new int[20];
        int count = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                arr3[count++] = i;
            }
        }

        for (int el : arr3) {
            System.out.print(el + " ");
        }
        System.out.println();


        //Task4
        int[] arr4 = {3, 6, 1, 235, 20, 34, 100, 11, 205};
        for (int el : arr4) {
            if (el % 5 == 0) {
                System.out.print(el + " ");
            }
        }
        System.out.println();


        //Task5
        double[] arr5 = {1, 20, 30.23, 105.99, 1000.123, 200.57};
        for (double el : arr5) {
            if (el >= 24.12 && el <= 467.23) {
                System.out.print(el + " ");
            }
        }
        System.out.println();


        //Task6
        int[] arr6 = {1, 5, 4, 22, 74, 11, 96, 333, 38};
        int count6 = 0;
        for (int el : arr6) {
            if (el % 2 == 0) {
                count6++;
            }
        }
        System.out.println("The count of elements that can be devided by 2: " + count6);


        //Task7
        int N = 7;
        for(int i = 1; i < 11; i++) {
            System.out.println(N + " X " + i + " = " + N * i);
        }


    }
}
