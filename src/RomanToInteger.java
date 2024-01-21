import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = romanValues.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                result -= romanValues.get(s.charAt(i));
            } else {
                result += romanValues.get(s.charAt(i));
            }
        }

        return result;
    }


    public static int romanToInt_2(String s) {
        int ans = 0;
        int num = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }

            if (num < prev)
                ans -= num;
            else
                ans += num;
            prev = num;
        }
        return ans;
    }


    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(s1 + " in integer: " + romanToInt(s1));
        System.out.println(s2 + " in integer: " + romanToInt_2(s2));
        System.out.println(s3 + " in integer: " + romanToInt(s3));
    }
}
