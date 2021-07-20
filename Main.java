public class Main {

    public static void main(String[] args) {
        arrayDisplay();
        length100();
        array3();
        diagonal();

    }

    // № 1.
    static int[] One() {
        int[] array1 = {1, 0, 1, 1, 0};
        return array1;
    }

    static void arrayDisplay() {
        int[] array1 = One();

        for (int i = 0; i < array1.length; i++) {
            int i1 = array1[i];
            if (array1[i] == 1) {
                array1[i] = 0;
            } else array1[i] = 1;


            System.out.println(array1[i]);
        }
    }

    //№ 2.
    public static void length100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    //№ 3.
    static void array3() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            int i1 = arr2[i];
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
    }

    //№ 4.
    static void diagonal() {
        int mass[][] = fordiagonal();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }


    static int[][] fordiagonal() {
        return new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
    }
}




