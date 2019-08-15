package by.etc.somnum;

//Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить на  одиночные  пробелы.
//Крайние пробелы в строке удалить.

import java.util.Scanner;

public class charactersArray_exe_5 {

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

    public static String removeSpaces(String line) {

        String result = "";
        for (Character c : toCharacterArray(line)) {
            if (!Character.isSpace(c)) {
                result += c;
            } else {
                if (result.lastIndexOf(" ") != result.length() - 1) {
                    result += c;
                }
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {

        System.out.print("Введите строку с множественными пробелами: ");
        String line = userInput();

        System.out.println("Строка с нормальными пробелами: " + removeSpaces(line));
    }
}
