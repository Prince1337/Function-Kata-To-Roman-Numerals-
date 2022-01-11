import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ToRomanNumerals {

  private TreeMap<Integer, String> numerals;

  public ToRomanNumerals(TreeMap<Integer, String> numerals) {
    this.numerals = numerals;
    numerals.put(1,"I");
    numerals.put(2,"II");
    numerals.put(3,"III");
    numerals.put(5, "V");
    numerals.put(10, "X");
    numerals.put(50, "L");
    numerals.put(100, "C");
    numerals.put(500, "D");
    numerals.put(1000, "M");

    numerals.put(4, "IV");
    numerals.put(9, "IX");
    numerals.put(40, "XL");
    numerals.put(90, "XC");
    numerals.put(400, "CD");
    numerals.put(900, "CM");
  }


  String convert(int number){
    int biggestDigit = numerals.floorKey(number);
    if(numerals.containsKey(number)){
      return numerals.get(number);
    }
    return  numerals.get(biggestDigit) + convert(number-biggestDigit);
  }
}
