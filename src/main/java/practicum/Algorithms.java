package practicum;

import java.util.*;
import java.util.stream.Collectors;

public class Algorithms {

    /**
     *
     * � �������, � ������� ������� �� �������� ������ �������� � �������,
     * ������ ����� ��������� ������� � ���������� �����,
     * � ����� �������, ����� ����������, ������� � ������.
     *
     * �� ������������ ��� ������� ���������� ���������, ������ ����������� ���������
     * java.util.Collections, java.util.Arrays, java.lang.Math, � ����� ������
     * replace � replaceAll, reverce, equals, indexOf, toLowerCase, toUpperCase
     * split, substring �� java.lang.String.
     * ������ ������������ �����, �������� ���������,
     * ������� ���� ������ � �� �������.
     *
     * ��� ��������� ��������� ����� �������, ���� ������
     * ����������� �� ������������� ������� Java API?
     */

    /**
     * ��������� ������������, ����������� � ������� ����� ��� ������ �����
     * ������� �� �����
     * ������ �������������� ������� ��������
     */
    public static double maxMinAvr(List<Integer> numbers) {
        //O(N)
        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            sum += current;
        }
        return (double) sum / numbers.size() + max + min;
    }


    /**
     * ������� ������ ������������ �������� � �������,
     * ���� ������ ���, �� ������� ������
     * ������ ������������� �������� ��������
     */
    public static Integer max2(List<Integer> list) {
        //O(N)
        int max1 = list.get(0);
        int max2 = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max1) {
                max2 = max1;
                max1 = current;
            }
        }
        return max2;
    }

    /**
     * ������� ����� �� �������.
     * ������� ������ �� ���������� ����� ��������,
     * �� � �� ���������� "���������" �� ����� ��������� ���������
     * ��������, ���� �� ������� [0, 6, 0 ,5, 0] ����� ������� ������� 0,
     * �� ������������ ������ ������ ���������� ��� �������� [6, 5]
     */
    public static int[] removeElementFromArray(int[] numbers, int value) {
        //O(N)
        int resultSize = 0;
        for (int i : numbers) {
            if (i != value) resultSize++;
        }
        int[] result = new int[resultSize];
        int currentIndex = 0;
        for (int number : numbers) {
            if (number != value) result[currentIndex++] = number;
        }
        return result;
    }


    /**
     * ������� ��� ������� �� ������.
     * ��������, "���� ���� ����" -> "�� �� ��"
     */
    public static String removeVowels(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean res = isVowel(currentChar);
            if (!res) {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�':
            case '�': return true;
            default: return false;
        }
    }


    /**
     * ������ ������������� ������ ������� � ������
     * �������� "�������������" -> "������"
     * (*) - � ���� ������ ����� ��������� ���������
     * ������������� ���� ������� ��������,
     * ��� ���� � �������� ������ �������� ������ �����,
     * ��������, "���������������" -> "������",
     */
    public static String removeDublicates(String str) {
        if(str.length() == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) ==
                    Character.toLowerCase(stringBuilder.charAt(stringBuilder.length() -1))
            ) {
                continue;
            }
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    /**
     * ����� ������, ������ ������������� �������
     * � �������� ���������� �������� ��� ������� �������
     * �������� "��������������" -> "�1�3�1�4�2�2"
     */
    public static String zipStr(String str) {
        if(str.length() == 0) return "";
        List<Pair> result = new ArrayList<>();
        char prevSym = str.charAt(0);
        Pair pair = new Pair(prevSym);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prevSym) {
                pair.count++;
            } else {
                result.add(pair);
                pair = new Pair(str.charAt(i));
            }
            prevSym = str.charAt(i);
        }
        result.add(pair);
        return result.stream().map(Pair::toString).collect(Collectors.joining(""));
    }

    static class Pair {
        char c;
        int count;

        public Pair(char c) {
            this.c = c;
            this.count = 1;
        }

        @Override
        public String toString() {
            return c + String.valueOf(count);
        }
    }


    /**
     * �������� �������� �� ������ �����������,
     * �� ����  ��������� �������� � ����� ������������.
     * ��������, ����� "�����" - ���������, � ����� "�����" ���.
     * ������ "� ���� ����� �� ���� �����" ���� ���������,
     * � ������ "� ���� ������� ���� �����" ���.
     * "A man, a plan, a canal-Panama", ���� ���������
     * <p>
     * (!) ��� ��� ��������� ���������� ���������
     * � ������ �������������� �������� �������� �� java.lang.String
     * �������� �������� ������� ����� �������� UTF-8
     * (����� ������ ��� ��������� � ������ �� � ��������)
     */
    public static boolean isPalindrom(String str) {
        int indexLeft = 0;
        int indexRight = str.length() - 1;
        while (indexLeft < indexRight) {
            char leftCharacter = Character.toLowerCase(str.charAt(indexLeft));
            char rightCharacter = Character.toLowerCase(str.charAt(indexRight));
            if (!Character.isLetter(leftCharacter)) {
                indexLeft++;
                continue;
            }
            if (!Character.isLetter(rightCharacter)) {
                indexRight--;
                continue;
            }
            if (leftCharacter != rightCharacter) return false;
            indexLeft++;
            indexRight--;
        }
        return true;
    }


    /**
     * ����������� ��� ����� � �����������
     * "��� ����� ������" -> "��� ����� ������"
     */
    public static String reverseWordsInSentence(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                strings.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            } else if (sentence.charAt(i) == '.' || sentence.charAt(i) == ',' || sentence.charAt(i) == '!') {
                strings.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(sentence.charAt(i));
            } else {
                stringBuilder.append(sentence.charAt(i));
            }
        }
        strings.add(stringBuilder.toString());
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            stringBuilder = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                stringBuilder.append(s.charAt(i));
            }
            if (stringBuilder.length() > 0 && (stringBuilder.charAt(0) == '.'|| stringBuilder.charAt(0) == ',' || stringBuilder.charAt(0) == '!')) {
                result.deleteCharAt(result.length() - 1);
            }
            result.append(stringBuilder.toString()).append(" ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    /**
     * ������������ ������� � �������,
     * �� ����������� �������������� ��������� ������.
     * ��� ����� ������� �������� {'c', 'a', 'b'},
     * ������������ ������ ��� �� ��������������� ������ {'a', 'b', 'c'}
     */
    public static char[] sortSymbols(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < symbols.length; j++) {
                if (symbols[indexMin] > symbols[j]) {
                    indexMin = j;
                }
            }
            char tmp = symbols[indexMin];
            symbols[indexMin] = symbols[i];
            symbols[i] = tmp;

        }
        return symbols;
    }


    /**
     * �������� �������� �� ��� ������ �����������.
     * ������ �������� �����������, ���� ��� ������� �� ����� � ��� �� ����
     * ��������, ����� "���" � "���" ���������, � ����� "���" �  "���" ���.
     */
    public static boolean isAnogramOf(String word, String anogram) {
        if (word.length() != anogram.length()) return false;
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            hashMap.merge(word.charAt(i), 1, Integer::sum);
            hashMap.merge(anogram.charAt(i), -1, Integer::sum);
        }
        return hashMap.values().stream().allMatch(v -> v == 0);
    }

    /**
     * ��������, ��� �� ������� � ������ ����������� ���� ���.
     * ���� ������ �������� ������������� �������,
     * �� ���������� false, ���� �� �������� - true
     * ������ ������������ �������������� ��������� ������.
     * <p>
     * (!) � ���� ������ ������ ����� ���������
     * ����� ������ �� ������� ASCII (127 ��������)
     * <p>
     * (!!) ��������� - O(n)
     */

    public static boolean hasUniqueChars(String str) {
        return str.chars().distinct().count() == str.length();
    }

}
