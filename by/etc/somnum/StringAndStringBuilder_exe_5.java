package by.etc.somnum;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

import java.util.Scanner;

public class StringAndStringBuilder_exe_5 {

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

    public static int findCountLetter(String line) {

        int temp = 0;
        for (Character c : toCharacterArray(line)) {
            if (c == 'а') {
                temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку на русском языке: ");
        String line = userInput();

        System.out.println("В строке буква 'a' встретилась " + findCountLetter(line) + " раз(а)");
    }
}
