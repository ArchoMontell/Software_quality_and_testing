package edu.prydatkin;
import java.util.HashMap;
import java.util.Map;


/*
    @author lilbl
    @project Lab4
    @class Converter
    @version 1.0.0
    @since 4/10/2025 - 13.20
*/


public class Converter {
    public static int convertRomanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));

            }
        }
        return result;
    }
}
