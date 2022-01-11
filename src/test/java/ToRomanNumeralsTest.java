import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class ToRomanNumeralsTest {

  ToRomanNumerals toRomanNumerals = new ToRomanNumerals(new TreeMap<>());

  @Test
  void convertNumber1(){
    int number = 1;
    String actual = toRomanNumerals.convert(number);
    String expected = "I";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber2(){
    int number = 2;
    String actual = toRomanNumerals.convert(number);
    String expected = "II";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber4(){
    int number = 4;
    String actual = toRomanNumerals.convert(number);
    String expected = "IV";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber5(){
    int number = 5;
    String actual = toRomanNumerals.convert(number);
    String expected = "V";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber9(){
    int number = 9;
    String actual = toRomanNumerals.convert(number);
    String expected = "IX";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber10(){
    int number = 10;
    String actual = toRomanNumerals.convert(number);
    String expected = "X";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber42(){
    int number = 42;
    String actual = toRomanNumerals.convert(number);
    String expected = "XLII";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber99(){
    int number = 99;
    String actual = toRomanNumerals.convert(number);
    String expected = "XCIX";

    assertEquals(expected, actual);
  }

  @Test
  void convertNumber2013(){
    int number = 2013;
    String actual = toRomanNumerals.convert(number);
    String expected = "MMXIII";

    assertEquals(expected, actual);
  }

}