package Test;

import static org.junit.jupiter.api.Assertions.*;

import com.company.Main;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void testCalcValue() {
        double eps = 1e-2;
        //Tes1
        int n = 2;
        int m = 2;
        int[][] matrix = new int[n][m];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 0;
        matrix[1][1] = 2;
        int actual = Main.minimumColumn(matrix, n, m);
        int expected = 1;
        assertEquals(expected, actual, eps);
        //Test2
        n = 2;
        m = 3;
        int[][] new_matrix = new int[n][m];
        new_matrix[0][0] = 2;
        new_matrix[0][1] = 2;
        new_matrix[0][2] = 2;
        new_matrix[1][0] = 1;
        new_matrix[1][1] = 2;
        new_matrix[1][2] = 2;
        actual = Main.minimumColumn(new_matrix, n, m);
        expected = 1;
        assertEquals(expected, actual, eps);

    }
}
