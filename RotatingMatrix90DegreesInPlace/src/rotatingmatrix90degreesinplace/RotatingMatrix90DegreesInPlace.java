/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatingmatrix90degreesinplace;

/**
 *
 * @author paulb
 */

public class RotatingMatrix90DegreesInPlace {

    private static int[][] matrix = { 
        { 1, 2, 3, 4, 5 }, 
        { 6, 7, 8, 9, 10 }, 
        { 11, 12, 13, 14, 15 }, 
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25} 
    };

    private final static int N = 5;

    private static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print();

        for (int ring = 0; ring < N / 2; ring++) {
            int farthest = N - ring - 1;

            for (int i = ring; i < farthest; i++) {
                int temp = matrix[ring][i];
                matrix[ring][i] = matrix[farthest - i + ring][ring];
                matrix[farthest - i + ring][ring] = 
                    matrix[farthest][farthest - i + ring];
                matrix[farthest][farthest - i + ring] = 
                    matrix[i][farthest];
                matrix[i][farthest] = temp;
            }
        }

        print();
    }
}