import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void twoMultiplyTwoEquals4(){
        Main main = new Main();
        assertEquals(4, main.multiply(2,2));
    }

    @Test
    void threeMultiplyThreeEquals9(){
        Main main = new Main();
        assertEquals(9, main.multiply(3,3));
    }
}