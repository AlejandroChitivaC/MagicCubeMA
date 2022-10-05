public class MagicMain {
    public static void main(String[] args) {
        int[][] padre1 = new int[3][3];
        int[][] padre2 = new int[3][3];
        int[][] hijo1 = new int[3][3];
        int[][] hijo2 = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                padre1[i][j] = (int) (Math.random() * 9 + 1);
                padre2[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        //padre 1

        System.out.println("Padre 1");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(padre1[i][j] + " ");
            }
            System.out.println();
        }
        int sumac1 = 0;
        int sumac2 = 0;
        int sumac3 = 0;
        for (int i = 0; i < 3; i++) {
            sumac1 += padre1[i][0];
            sumac2 += padre1[i][1];
            sumac3 += padre1[i][2];
        }
        System.out.println("col1= "+sumac1);
        System.out.println("col2= "+sumac2);
        System.out.println("col3= "+sumac3);


        for (int i = 0; i < 3; i++) {
            int sumap1 = 0;
            for (int j = 0; j < 3; j++) {
                sumap1 += padre1[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumap1);
        }
        System.out.println("--------------------------------------------------------------------------------------");

        //padre 2
        System.out.println("Padre 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(padre2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            int sumap2 = 0;
            for (int j = 0; j < 3; j++) {
                sumap2 += padre2[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sumap2);
        }
        System.out.println("--------------------------------------------------------------------------------------");




    }
}
