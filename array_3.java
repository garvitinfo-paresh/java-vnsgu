import java.util.*;
class array_3 {
    public static void main(String args[]) {
        int a[][] = new int[5][5], i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter value of a[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }
}
