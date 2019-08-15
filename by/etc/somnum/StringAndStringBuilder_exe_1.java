package by.etc.somnum;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringAndStringBuilder_exe_1 {

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

    public static ArrayList<Integer> findCountSpaces(String line) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int temp = 0;

        for (Character c : toCharacterArray(line)) {
            if (Character.isSpace(c)) {
                temp++;
            } else {
                if (temp > 0) {
                    result.add(temp);
                    temp = 0;
                }
            }
        }
        return result;
    }

    public static int maxCountSpase(ArrayList<Integer> arrayCountMax) {

        int max = Collections.max(arrayCountMax);
        return max;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку с множественными пробелами: ");
        String line = userInput();

        System.out.println("Наибольшее количество подряд идущих пробелов = " + maxCountSpase(findCountSpaces(line)));
    }
}
