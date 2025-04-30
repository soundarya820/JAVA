import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];

        
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Choose an operation:\n1. Addition\n2. Multiplication\n3. Transpose");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("Matrix Addition Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                printMatrix(result);
                break;

            case 2: 
                System.out.println("Matrix Multiplication Result:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0; // Initializing to zero
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                printMatrix(result);
                break;

            case 3: 
                System.out.println("Transpose of First Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[j][i];
                    }
                }
                printMatrix(result);
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }

        sc.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

