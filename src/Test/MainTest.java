import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class MainTest {

    public static Stream<Arguments> provideLogicalCoverageData(){
        return Stream.of(
                Arguments.of(2,1,1),
                Arguments.of(11,10,3),
                Arguments.of(-1,2,1),
                Arguments.of(1,2,3),
                Arguments.of(0,10,3),
                Arguments.of(2,1,1),
                Arguments.of(10,11,1),
                Arguments.of(2,2,2),
                Arguments.of(-1,9,1)
        );
    }

    @DisplayName("Check for code conditions.")
    @ParameterizedTest(name = "Test {index} : by using input number {0} in base {1} we mut get value {2}.")
    @MethodSource("provideLogicalCoverageData")
    public void testFor(int qin, int qsb, int expectedOutput){
        assertEquals(expectedOutput , Main.Chkding(qsb,qin));
    }

}