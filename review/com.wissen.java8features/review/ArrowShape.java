//package review;
//import java.util.Scanner;
//
//public class ArrowShape {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter the number of rows (N): ");
////        int n = scanner.nextInt();
////        
////        // Print upper half
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < 2 * n - 1; j++) {
////                if (j == n - 1 - i || j == n - 1 + i) {
////                    System.out.print("*");
////                } else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////        
////        // Print lower half
////        for (int i = n - 2; i >= 0; i--) {
////            for (int j = 0; j < 2 * n - 1; j++) {
////                if (j == n - 1 - i || j == n - 1 + i) {
////                    System.out.print("*");
////                } else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println();
////        }
////        
////        scanner.close();
//    	public class Pattern {
//    	    public static void main(String[] args) {
//    	        int size = 4; // adjust the size of the pattern as needed
//    	        printPattern(size);
//    	    }
//
//    	    public static void printPattern(int size) {
//    	        for (int i = 1; i <= size * 2 - 1; i++) {
//    	            for (int j = 1; j <= size * 2 - 1; j++) {
//    	                if (i == size || j == size || i + j == size * 2 || i - j == size || j - i == size)
//    	                    System.out.print("*");
//    	                else
//    	                    System.out.print(" ");
//    	            }
//    	            System.out.println();
//    	        }
//    	    }
//    	}
//
//    }
//}
