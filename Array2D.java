import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        int row, col, m, n;
        int arr[][] = new int[10][10];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter row for the array  : ");
        row = s.nextInt();
        System.out.println("Enter column for the array : ");
        col = s.nextInt();

        System.out.println("Enter " + (row * col) + " Array Elements : ");
        for (m = 0; m < row; m++) {
            for (n = 0; n < col; n++) {
                arr[m][n] = s.nextInt();
            }
        }
        for (m = 0; m < row; m++) {
            for (n = 0; n < col; n++) {

                System.out.print(arr[m][n] + " ");
            }
            System.out.println();


        }


    }}

