public class MagicMain {
    public static void main(String[] args) {
        int[][] padre1 = new int[3][3];
        int[][] padre2 = new int[3][3];
        int[][] hijo1 = new int[3][3];
        //Llenar los padres con numeros aleatorios
        fillMatrix(padre1);
        fillMatrix(padre2);

        System.out.println("Padre 1");

        printMatrix(padre1);
        System.out.println("Fitness: " + fitnessFunction(padre1));
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Padre 2");
        printMatrix(padre2);
        System.out.println("Fitness: " + fitnessFunction(padre2));
        System.out.println("--------------------------------------------------------------------------------------");
        if (fitnessFunction(padre1) == 0 && fitnessFunction(padre2) == 0) {

            fillMatrix(padre1);
            fillMatrix(padre2);
            System.out.println("New Padre 1");
            printMatrix(padre1);
            System.out.println("Fitness: " + fitnessFunction(padre1));
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("New Padre 2");
            printMatrix(padre2);
            System.out.println("Fitness: " + fitnessFunction(padre2));
        }

        System.out.println("--------------------------------------------------------------------------------------");

    }


    public static int fitnessFunction(int[][] matrix) {
        int fitness = 0;
        //filas
        if (matrix[0][0] + matrix[0][1] + matrix[0][2] == 15) fitness++;
        if (matrix[1][0] + matrix[1][1] + matrix[1][2] == 15) fitness++;
        if (matrix[2][0] + matrix[2][1] + matrix[2][2] == 15) fitness++;
        //columnas
        if (matrix[0][0] + matrix[1][0] + matrix[2][0] == 15) fitness++;
        if (matrix[0][1] + matrix[1][1] + matrix[2][1] == 15) fitness++;
        if (matrix[0][2] + matrix[1][2] + matrix[2][2] == 15) fitness++;
        //diagonales
        if (matrix[0][1] + matrix[1][1] + matrix[2][2] == 15) fitness++;
        if (matrix[0][2] + matrix[1][1] + matrix[2][0] == 15) fitness++;
        return fitness;
    }

    public static void fillMatrix(int[][] m1) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    private static void printMatrix(int[][] p) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }


}
