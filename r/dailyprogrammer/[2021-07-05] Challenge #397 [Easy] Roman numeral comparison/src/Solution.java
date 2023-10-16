class Solution {

    public int romanToInt(String roman) {

        if (roman.isBlank()) return 0;

        int sum = 0;
        int temp = translate(roman.charAt(0));

        for (int i = 1; i < roman.length(); i++) {
            int j = translate(roman.charAt(i));

            if (temp >= j) {
                sum += temp;
            } else {
                sum -= temp;
            }

            temp = j;
        }
        sum += temp;

        return sum;
    }

    public int translate(char c) {

        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
