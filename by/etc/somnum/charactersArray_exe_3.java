package by.etc.somnum;

// В строке найти количество цифр.

import java.util.Scanner;

public class charactersArray_exe_3 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static Character[] toCharacterArray(String s) {

        if (s == null) {
            return null;
        }

        int len = s.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len; i++) {
            array[i] = new Character(s.charAt(i));
        }
        return array;
    }

    public static int findCountDigits(String line) {

        int result = 0;
        for (Character c : toCharacterArray(line)) {
            if (Character.isDigit(c)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку содержащюю цифры: ");
        String line = userInput();

        System.out.println("Количество цифр в строке = " + findCountDigits(line));
    }
}
