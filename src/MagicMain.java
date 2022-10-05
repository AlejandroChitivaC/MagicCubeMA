public class MagicMain {
    public static void main(String[] args) {
        int[][] padre1 = new int[3][3];
        int[][] padre2 = new int[3][3];
        int[][] hijo1 = new int[3][3];
        int[][] hijo2 = new int[3][3];

        //Llena los padres con numeros aleatorios del 1 al 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                padre1[i][j] = (int) (Math.random() * 9 + 1);
                padre2[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        //padre 1

        //calcular sumas horizontales y verticales


        System.out.println("Padre 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(padre1[i][j] + " ");
            }
            System.out.println();
        }
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
