import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    @DisplayName("Valid Base and Valid Input")
    void validBaseAndValidInput() {
        assertEquals(3,Main.Chkding(8,7));
        assertEquals(3,Main.Chkding(10,1));
    }

    @Test
    @DisplayName("Invalid Digit")
    public void invalidDigit(){
        assertEquals(2,Main.Chkding(123,2));
    }

    @Test
    @DisplayName("Invalid Base or Invalid Input")
    public void validBaseAndInvalidInput(){
        assertEquals(1,Main.Chkding(2,-1));
        assertEquals(1,Main.Chkding(12,1));
    }
}