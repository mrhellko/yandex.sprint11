package practicum;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void maxMinAvrTest() {
        assertEquals(3, Algorithms.maxMinAvr(List.of(1 )), 0.0);
        assertEquals(3, Algorithms.maxMinAvr(List.of(1, 1, 1 )), 0.0);
        assertEquals(-3, Algorithms.maxMinAvr(List.of(-1 )), 0.0);
        assertEquals(-3, Algorithms.maxMinAvr(List.of(-1,-1,-1 )), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of(0)), 0.01);
        assertEquals(3, Algorithms.maxMinAvr(List.of(1, 1)), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of(1, -1)), 0.0);
        assertEquals(4.33, Algorithms.maxMinAvr(List.of( 1, 1, 2 )), 0.01);
        assertEquals(1.66, Algorithms.maxMinAvr(List.of( 1, -1, 2 )), 0.01);
        assertEquals(4.66, Algorithms.maxMinAvr(List.of( 1, 2, 2 )), 0.01);
        assertEquals(0.33, Algorithms.maxMinAvr(List.of( 1, -2, 2 )), 0.01);
        assertEquals(6, Algorithms.maxMinAvr(List.of( 2, 2, 2 )), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of( -2, 2, -2, 2 )), 0.0);
        assertEquals(13.22, Algorithms.maxMinAvr(List.of( 1, 2, 5, 5, 6, 7, 7, 7, 7 )), 0.01);
    }
    @Test
    public void max2Test() {
        assertEquals(1, Algorithms.max2(List.of( 1 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 2 )).intValue());
        assertEquals(6, Algorithms.max2(List.of( 1, 2, 3, 4, 5, 6, 7 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 1 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 1, 2 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 2, 2 )).intValue());
        assertEquals(2, Algorithms.max2(List.of( 2, 2, 2 )).intValue());
        assertEquals(6, Algorithms.max2(List.of( 1, 2, 5, 5, 6, 7, 7, 7, 7 )).intValue());
    }


    @Test
    public void removeElementFromArrayTest() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 1, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 1, 6, 1}, 0));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 1}, 0));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 0}, 0));
        assertArrayEquals(new int[]{2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{0, 2, 4, 5, 0, 6, 0}, 0));
        assertArrayEquals(new int[]{2, 2}, Algorithms.removeElementFromArray(new int[]{2, 2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{0, 0, 2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2, 0, 0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{0, 0, 0, 0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{}, 0));

        assertArrayEquals(new int[]{2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 1, 6, 1}, 1));
        assertArrayEquals(new int[]{1, 2, 5, 0, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 1}, 4));
        assertArrayEquals(new int[]{1, 2, 4, 5, 0, 6, 0}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 0}, -1));
        assertArrayEquals(new int[]{0, 2, 4, 0, 6, 0}, Algorithms.removeElementFromArray(new int[]{5, 0, 2, 4, 5, 0, 6, 0, 5}, 5));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{2, 2, 2, 2, 2, 2}, 2));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2}, 3));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{-9}, -9));
        assertArrayEquals(new int[]{2, 0, 0, 0}, Algorithms.removeElementFromArray(new int[]{2, 3, 3, 0, 0, 0}, 3));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{}, 9));
    }


    @Test
    public void removeVowelsTest() {
        assertEquals("�� �� ��", Algorithms.removeVowels("���� ���� ����"));
        assertEquals("�� �� ��", Algorithms.removeVowels("���� ���� ����"));
        assertEquals("�� �� ��", Algorithms.removeVowels("���� ���� ����"));
        assertEquals(" ", Algorithms.removeVowels("���� ����"));
        assertEquals("", Algorithms.removeVowels("��������"));
        assertEquals("", Algorithms.removeVowels("��������"));
        assertEquals("", Algorithms.removeVowels(""));
        assertEquals("� � � �", Algorithms.removeVowels("� � � �"));
        assertEquals("����", Algorithms.removeVowels("����"));
        assertEquals("Jst d t!", Algorithms.removeVowels("Just do it!"));
        assertEquals("jST D T!", Algorithms.removeVowels("jUST DO IT!"));
        assertEquals("JSTDT!", Algorithms.removeVowels("JUSTDOIT!"));
    }


    @Test
    public void removeDublicatesTest() {
        assertEquals("������", Algorithms.removeDublicates("������"));
        assertEquals("������", Algorithms.removeDublicates("��������"));
        assertEquals("������", Algorithms.removeDublicates("����������"));
        assertEquals("������", Algorithms.removeDublicates("������������"));
        assertEquals("������", Algorithms.removeDublicates("������������������������"));
        assertEquals("���� ���� ����", Algorithms.removeDublicates("����   ����   ����"));
        assertEquals("(���? ���? ����.)", Algorithms.removeDublicates("(((����???   ����???   �����...)))"));
        assertEquals("jUST DO IT!", Algorithms.removeDublicates("jJUuSsTt DO IT!"));
        assertEquals("������", Algorithms.removeDublicates("���������������"));
        assertEquals(" ", Algorithms.removeDublicates(" "));
        assertEquals("�", Algorithms.removeDublicates("�"));
        assertEquals("", Algorithms.removeDublicates(""));
    }


    @Test
    public void zipStrTest() {
        assertEquals("�1�1�1�1�1�1�1�1", Algorithms.zipStr("��������"));
        assertEquals("�4�1�1�1�1�1�1�1", Algorithms.zipStr("�����������"));
        assertEquals("�1�1�1�1�1�1�1�5", Algorithms.zipStr("������������"));
        assertEquals("�3�3�3�2�5�1�1�5", Algorithms.zipStr("�����������������������"));
        assertEquals("�1�2�1�2�1�2�1�2�1�2�1�2�1�2�1�2", Algorithms.zipStr("������������������������"));
        assertEquals("�3�3�2 3�1�1�1�3 1�2�3�1�1�1 4�1�1�1�3�2�1�1.3", Algorithms.zipStr("��������   ������ ��������    ����������..."));
        assertEquals("", Algorithms.zipStr(""));
        assertEquals(" 1", Algorithms.zipStr(" "));
        assertEquals("�1", Algorithms.zipStr("�"));
    }


    @Test
    public void isPalindromTest() {
        assertTrue( Algorithms.isPalindrom("�����"));
        assertFalse(Algorithms.isPalindrom("�����"));
        assertTrue(Algorithms.isPalindrom("� ���� ����� �� ���� �����"));
        assertTrue(Algorithms.isPalindrom("� ���� ����� �� ���� �����"));
        assertTrue(Algorithms.isPalindrom("�� - �����!"));
        assertTrue(Algorithms.isPalindrom("�� - ���, ������!"));
        assertTrue(Algorithms.isPalindrom("Madam, I'm Adam."));
        assertTrue(Algorithms.isPalindrom("A man, a plan, a canal-Panama."));
        assertTrue(Algorithms.isPalindrom("Was it a car or a cat I saw?"));
        assertTrue(Algorithms.isPalindrom("\"Not New York\", � Roy went on"));
        assertTrue(Algorithms.isPalindrom(" "));
        assertTrue(Algorithms.isPalindrom(""));
    }


    @Test
    public void reverseWordsInSentenceTest() {
        assertEquals("����", Algorithms.reverseWordsInSentence("����"));
        assertEquals("��� ����� ���", Algorithms.reverseWordsInSentence("��� ����� ���"));
        assertEquals(" ", Algorithms.reverseWordsInSentence(" "));
        assertEquals("", Algorithms.reverseWordsInSentence(""));
        assertEquals("��� ���� ����� ������� ������...", Algorithms.reverseWordsInSentence("��� ���� ����� ������� ������..."));
        assertEquals("�� - ���, ������!", Algorithms.reverseWordsInSentence("�� - ���, ������!"));
    }


    @Test
    public void sortSymbolsTest() {
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, Algorithms.sortSymbols(new char[]{'c', 'a', 'b', 'd'}));
        assertArrayEquals(new char[]{'a'}, Algorithms.sortSymbols(new char[]{'a'}));
        assertArrayEquals(new char[]{'a', 'a','a', 'a'}, Algorithms.sortSymbols(new char[]{'a', 'a','a', 'a'}));
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', '�', '�', '�', '�', '�'}, Algorithms.sortSymbols(new char[]{'�','�','�','�','�','c', 'a', 'b', 'd'}));
    }


    @Test
    public void isAnogramOfTest() {
        assertTrue(Algorithms.isAnogramOf("���", "���"));
        assertFalse(Algorithms.isAnogramOf("���", "���"));
        assertFalse(Algorithms.isAnogramOf("�����", "������"));
        assertTrue(Algorithms.isAnogramOf("�����", "�����"));
        assertTrue(Algorithms.isAnogramOf("", ""));
        assertFalse(Algorithms.isAnogramOf(" ", ""));
        assertFalse(Algorithms.isAnogramOf("", " "));
        assertTrue(Algorithms.isAnogramOf("������������", "�����������"));
        assertTrue(Algorithms.isAnogramOf("������������", "������������"));
    }


    @Test
    public void hasUniqueCharsTest() {
        assertTrue(Algorithms.hasUniqueChars(""));
        assertTrue(Algorithms.hasUniqueChars("t"));
        assertFalse(Algorithms.hasUniqueChars("tt"));
//        assertFalse(Algorithms.hasUniqueChars("�"));
//        assertFalse(Algorithms.hasUniqueChars("t�"));
        assertTrue(Algorithms.hasUniqueChars("maslo"));
        assertTrue(Algorithms.hasUniqueChars(""));
        assertFalse(Algorithms.hasUniqueChars(" maslo "));
//        assertFalse(Algorithms.hasUniqueChars("�����"));
        assertFalse(Algorithms.hasUniqueChars("panorama"));
        assertTrue(Algorithms.hasUniqueChars(" "));
    }
}
