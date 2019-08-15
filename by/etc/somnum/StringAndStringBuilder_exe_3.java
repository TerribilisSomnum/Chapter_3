package by.etc.somnum;

//Проверить, является ли заданное слово палиндромом.

import java.util.Scanner;

public class StringAndStringBuilder_exe_3 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static String findWordPalyndrom(String line) {

        String temp = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            temp += line.charAt(i);
        }
        if (temp.equals(line)) {
            return "Слово является палиндромом";
        } else {
            return "Слово не является палиндромом";
        }
    }

    public static void main(String[] args) {

        System.out.print("Введите слово: ");
        String line = userInput();

        System.out.println(findWordPalyndrom(line));
    }
}
