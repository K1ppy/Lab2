package Test;

import static org.junit.jupiter.api.Assertions.*;

import com.company.Main;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void testCalcValue() {
        int n = 3;
        int m = 3;
        int actual = Main.minimumColumn(n, m);
         //не знаю как тестировать рандомные входные данные
        //не было времени научиться нормально заливать на гитхаб
    }
}