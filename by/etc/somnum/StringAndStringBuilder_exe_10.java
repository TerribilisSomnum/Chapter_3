package by.etc.somnum;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

import java.util.Scanner;

public class StringAndStringBuilder_exe_10 {

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

    public static int calculateSentenceCount(String line) {

        int result = 0;

        for (Character c : toCharacterArray(line)) {
            if (Character.toString(c).equals(".")) {
                result++;
            } else if (Character.toString(c).equals("!")) {
                result++;
            } else if (Character.toString(c).equals("?")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print("Введите несколько предложений: ");
        String line = userInput();

        System.out.println("Всего " + calculateSentenceCount(line) + " предложений");
    }
}
