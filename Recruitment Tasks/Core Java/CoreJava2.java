public class CoreJava2 {

    /**
     * Zwróć sumę wszystkich elementów tablicy
     */
    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    /**
     * Zwróć sumę co drugiego elementu tablicy począwszy od array[0],
     * czyli array[0] + array[2] + array[4] + ...
     */
    public int sumEverySecond(int[] array) {
        int sum = 0;

        for(int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Zwróć sumę parzystych elementów tablicy
     * <p>
     * Przykład:
     * [5, 8, 9, 13, 12, 8] => 8 + 12 + 8 = 28
     */
    public int sumEvenValues(int[] array) {
        int sum = 0;
        for(int i : array) {
            if(array[i] % 2 == 0) sum += array[i];
        }
        return sum;
    }

    /**
     * Zwróć tablicę zawierającą parzyste elementy tablicy
     * <p>
     * Przykład:
     * [5, 8, 9, 13, 12, 8] => [8, 12, 8]
     */
    public int[] filterEvenValues(int[] array) {
        int evenCounter = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) evenCounter++;
        }

        int[] even = new int[evenCounter];
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                even[index] = array[i];
                index++;
            }
        }

        return even;
    }

    /**
     * Zwróć:
     * - true gdy wszystkie wartości parametru mają wartość true
     * - false, jeśli jakakolwiek wartość parametru ma wartość false
     */
    public boolean allTrue(boolean... value) {
        for (boolean x : value) {
            if (!x) {
                return false;
            }
        }

        return true;
    }

    /**
     * Skleja wszystkie napisy z parametru
     */
    public String concat(String... a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : a) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    /**
     * Sprawdza czy liczba 'number', zapisana w systemie dziesiętnym, zawiera cyfrę 'digit'.
     * <p>
     * Przykłady:
     * (number = 456, digit = 5) => true, bo 5 jest pośród 4,5,6
     * (number = 456, digit = 7) => false, bo 7 nie ma pośród 4,5,6
     *
     * @param number dowolna dodatnia liczba całkowita
     * @param digit  szukana cyfra, dozwolone wartości liczby digit to 0,1,2,3,4,5,6,7,8,9
     */
    public boolean containsDigit(int number, int digit) {
        String string = String.valueOf(number);

        return string.contains(String.valueOf(digit));
    }

    /**
     * Zwróć "stronę" tablicy,
     * tj. wycinek tablicy o maksymalnej wielkości pageSize
     * <p>
     * Przykład:
     * dla array = [5, 8, 9, 13, 3, 12, 8]
     * (pageSize = 2, pageNumberZeroBased = 0) => [5, 8]
     * (pageSize = 2, pageNumberZeroBased = 1) => [9, 13]
     * (pageSize = 3, pageNumberZeroBased = 0) => [5, 8, 9]
     * (pageSize = 3, pageNumberZeroBased = 1) => [13, 3, 12]
     */
    public int[] getPage(int[] array, int pageSize, int pageNumberZeroBased) {
        int endIndex = pageNumberZeroBased + pageSize;
        int[] result = new int[endIndex - pageNumberZeroBased];

        for(int i = 0; pageNumberZeroBased < endIndex; pageNumberZeroBased++, i++) {
            result[i] = array[pageNumberZeroBased];
        }

        return result;
    }

    /**
     * Metoda określa możliwość udzielenia pożyczki w zależności od występujących warunków.
     * Pożyczka może być udzielona wtedy i tylko wtedy, gdy pożyczkobiorca ma pracę lub pracę posiada współmałżonek,
     * z którym pożyczkobiorca posiada wspólnotę majątkową.
     * <p>
     * Zadanie: poniższa implementacja jest formalnie prawidłowa, lecz niezbyt czytelna. Uprość jej implementację.
     *
     * @param hasJob            określa, czy kredytobiorca ma pracę
     * @param hasSpouse         określa, czy kredytobiorca jest w związku małżeńskim
     * @param spouseHasJob      określa, czy współmałżonek ma pracę
     * @param communityProperty określa, czy pomiędzy małżonkami występuje wspólnota majątkowa
     */
    public boolean loanApproved(boolean hasJob, boolean hasSpouse, boolean spouseHasJob,
                                boolean communityProperty) {
        if (!hasJob) {
            if (hasSpouse && spouseHasJob && communityProperty) {
                return true;
            } else {
                return false;
            }
        } else {
            return communityProperty;
        }
    }
}
