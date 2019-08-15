package by.etc.somnum;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.Scanner;

public class StringAndStringBuilder_exe_8 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static String findMaxLenghtWord(String line) {

        String maxWord = "";
        for (String word : line.split(" ")) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        String line = userInput();

        System.out.println("Самое длинное слово: " + findMaxLenghtWord(line));
    }
}
