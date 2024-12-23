// import java.util.*;

// public class java_1 {
//     public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // System.out.println("sum is : " + (a + b));

        // int a = 10;

        // int c = a++;
        // System.out.println(c);

        // INSERT AN ELEMENT
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array : ");
        // int size = scan.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements : ");
        // for (int i = 0; i < size; i++) {
        // arr[i] = scan.nextInt();
        // }
        // System.out.println("Enter the index : ");
        // int index = scan.nextInt();
        // System.out.println("Enter the number to insert : ");
        // int insert = scan.nextInt();
        // for (int i = arr.length - 1; i >= index; i--) {
        // arr[i] = arr[i - 1];
        // }
        // arr[index] = insert;
        // System.out.println("The altered array is : ");
        // for (int i : arr) {
        // System.out.println(i + " ");
        // }

        // CREATE 2D ARRAY
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number of rows : ");
        // int rows = scan.nextInt();
        // System.out.println("Enter the number of columns : ");
        // int col = scan.nextInt();
        // int[][] arr = new int[rows][col];
        // System.out.println("Enter the elements : ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // arr[i][j] = scan.nextInt();
        // }
        // }
        // System.out.println("The array is : ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.println(arr[i][j]);
        // }
        // }

        // DELETE AN ELEMENT
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array : ");
        // int size = scan.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements : ");
        // for (int i = 0; i < size; i++) {
        // arr[i] = scan.nextInt();
        // }
        // System.out.println("Enter the index to be deleted : ");
        // int index = scan.nextInt();

        // for (int i = index; i < size - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[size - 1] = 0;

        // System.out.println("The altered array is : ");
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // FINDING ONE SURROUNDED BY ZEROES

        // Scanner scan = new Scanner(System.in);
        // int[][] arr = { { 0, 1, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 0 } };
        // int rows = arr.length;
        // int cols = arr[0].length;
        // int row_index = -1;
        // int col_index = -1;

        // for (int i = 1; i < rows - 1; i++) {
        // for (int j = 1; j < cols - 1; j++) {
        // if (arr[i][j] == 0) {
        // if (arr[i][j - 1] == 1 && arr[i][j + 1] == 1 && arr[i - 1][j] == 1 && arr[i +
        // 1][j] == 1) {
        // row_index = i;
        // col_index = j;
        // }
        // }
        // }
        // }
        // System.out.println(" index is : [" + row_index + "]" + "[" + col_index +
        // "]");
        // scan.close();
//     }

// }

// FIND MISSING ELEMENT IF ELEMENTS OF AN ARRAY ARE FROM 0 TO N-1
// import java.util.*;

// public class classwork{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in); 
//         int n = scan.nextInt(); 
//         int[] arr = new int [n+1]; 
//         int sum = n*(n-1)/2, sumofelements = 0; 
//         for(int i = 0 ; i<=n ; i++){
//             arr[i] = scan.nextInt(); 
//         }
//         for(int i = 0 ; i<n+1 ; i++){
//             sumofelements+=arr[i];
//         }
//         System.out.println(sumofelements-sum); 
//         scan.close();
//     }
// }