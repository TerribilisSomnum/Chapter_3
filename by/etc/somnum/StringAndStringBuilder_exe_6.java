package by.etc.somnum;

// Из заданной строки получить новую, повторив каждый символ дважды.

import java.util.Scanner;

public class StringAndStringBuilder_exe_6 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static String duplicateCharacters(String line) {

        String newLine = "";
        for (int i = 0; i < line.length(); i++) {
            newLine += line.charAt(i);
            newLine += line.charAt(i);
        }
        return newLine;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        String line = userInput();

        System.out.println(duplicateCharacters(line));
    }
}
