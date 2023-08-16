import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    void testIsSquareSuccess() {
        int[][] matrix = {{1, 1}, {2, 3}};
        assertTrue(Matrix.isSquareMatrix(matrix));
    }

    @Test
    void testIsSquareFail() {
        int[][] matrix = {{1, 1}, {2, 3}, {4, 5}};
        assertFalse(Matrix.isSquareMatrix(matrix));
    }

    @Test
    void testTranspose() {
        int[][] matrix = {{1,2},
                          {3,4},
                           {5,6}};

        int[][] expected = {{1,3,5},
                            {2,4,6}};

        assertArrayEquals(expected, Matrix.transpose(matrix));
    }

    @Test
    void testMirror() {
        int[][] matrix = {{2,3},
                          {5,6}};

        int[][] expected = {{3,2},
                            {6,5}};

        assertArrayEquals(expected, Matrix.mirrorMatrix(matrix));
    }

    @Test
    void testRotate() {
        int[][] matrix = {{2,3},
                {5,6}};

        int[][] expected = {{5,2},
                {6,3}};

        assertArrayEquals(expected, Matrix.rotate90Degrees(matrix));
    }

    @Test
    void testSumDirectional() {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int expected = 15;

        assertEquals(expected, Matrix.sumDiagonal(matrix));
    }

    @Test
    void testHadamardProduct() {
        int[][] matrix1 = {{1,2},
                {3,4}};

        int[][] matrix2 = {{5,6},
                {7,8}};

        int[][] expected = {{5,12},
                {21,32}};

        assertArrayEquals(expected, Matrix.hadamardProduct(matrix1, matrix2));
    }

    @Test
    void testSort() {
        int[][] matrix = {{9,8,7},
                {6,5,4},
                {3,2,1}};

        int[][] expected = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        assertArrayEquals(expected, Matrix.sortMatrix(matrix));
    }
}
