public class CoreJava {

    /** Wytyczne do zadań:
     * - załóż, że dane wejściowe są poprawne, nie sprawdzaj warunków brzegowych,
     np. czy argumenty mają wartość null, lub czy tablice są puste;
     * - nie uruchamiaj kodu, nie pisz main'a ani unit testów
     * - nie wydzielaj osobnych metod ani stałych.
     */


    /**
     * Zwróć pierwszy element tablicy
     */
    public int firstElem(int[] array) {
        return array[0];
    }

    /**
     * Zwróć ostatni element tablicy
     */
    public int lastElem(int[] array) {
        return array[array.length-1];
    }

    /**
     * Zwróć wybrany element tablicy
     */
    public int elementAtIndex(int[] array, int index) {
        return array[index];
    }

    /**
     * Zwróć negację podanego parametru
     */
    public boolean not(boolean a) {
        return !a;
    }

    /**
     * Zwraca wynik operacji 'LUB' dla podanych wartości logicznych a i b
     */
    public boolean or(boolean a, boolean b) {
        return a || b;
    }

    /**
     * Dla podanej liczby  a, zwróć liczbę a zwiększoną o 21
     */
    public int addTwentyOne(int a) {
        return a + 21;
    }

    /**
     * Dla podanych liczb a i b, zwróć ich iloczyn
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Metoda powinna zwrócić wartość 4 miliardy
     */
    public long returnFourBillion() {
        return 4000000000L;
    }

    /**
     * Dla podanych napisów a i b, zwróć ich sklejoną wartość
     */
    public String concat(String a, String b) {
        return new StringBuilder().append(a).append(b).toString();
        // lub prościej return a + b;
    }

    /**
     * Zwróć ostatni znak napisu
     */
    public char lastChar(String a) {
        return a.charAt(a.length() - 1);
    }

    /**
     * Zwróć wartość bezwzględną dla podanej liczby
     */
    public int abs(int a) {
        return Math.abs(a);
    }

    /**
     * Sprawdza, czy kwadrat podanej liczby jest większa od 0
     */
    public boolean squareIsGreaterThan0(int a) {
        return a * a > 0;
    }

}
