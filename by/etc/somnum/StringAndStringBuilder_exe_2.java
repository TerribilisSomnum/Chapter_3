package by.etc.somnum;

// В строке вставить после каждого символа 'a' символ 'b'.

import java.util.ArrayList;
import java.util.Scanner;

public class StringAndStringBuilder_exe_2 {

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

    public static String insertsCharacterAfterCharacter(String line) {

        String temp = "";
        for (Character c : toCharacterArray(line)) {
            if (c == 'a') {
                temp += c;
                temp += 'b';
            } else {
                temp += c;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String line = userInput();


        System.out.println("Строка:" + insertsCharacterAfterCharacter(line));
    }
}
