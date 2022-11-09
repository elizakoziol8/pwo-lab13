package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5",
        "xx12x12x1x"})
    void cont5DigTest1(String str) {

        System.out.println("Test pozytywny dla: " + str);

        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5",
        "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd"})
    void numOfDigitsTest(String str) {
        System.out.println("Liczba cyfr w stringu: \"" + str + "\" to " + Text.numOfDigits(str));
        assertEquals(Text.numOfDigits(str), 4);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd"})
    void numOfDigitsTest2(String str) {
        System.out.println("Liczba cyfr w stringu: \"" + str + "\" to " + Text.numOfDigits(str));
        assertNotEquals(Text.numOfDigits(str), 3);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"abcdefghj", "asdasdg"})
    void notContDigitsTest(String str) {

        System.out.println("String nie zawiera cyfr: " + str);

        assertTrue(Text.notContDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"1x3vdsfsdf", "123123", "aasbdf3"})
    void notContDigitsTest2(String str) {

        System.out.println("String zawiera cyfry: " + str);

        assertFalse(Text.notContDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"798324879324", "112323123", "534"})
    void contOnlyDigits(String str) {

        System.out.println("String zawiera tylko cyfry: " + str);

        assertTrue(Text.contOnlyDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"79832a4879324", "112323b123", "53fg4"})
    void contOnlyDigits2(String str) {

        System.out.println("String nie zawiera tylko cyfry: " + str);

        assertFalse(Text.contOnlyDigits(str));
    }
}