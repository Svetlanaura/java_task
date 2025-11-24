import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        // 1. Создаём матрицу 8×8
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();

        // 2. Заполняем случайными значениями 0–255
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        // 3. Выводим исходную матрицу
        System.out.println("Исходная матрица:");
        printMatrix(colors);

        // 4. Создаём матрицу для результата поворота
        int[][] rotatedColors = new int[SIZE][SIZE];

        // 5. Поворот на 90 градусов по часовой стрелке
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - 1 - i] = colors[i][j];
            }
        }

        // 6. Выводим повернутую матрицу
        System.out.println("\nПовернутая матрица на 90 градусов:");
        printMatrix(rotatedColors);
    }

    // Метод вывода матрицы
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
