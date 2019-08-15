package by.etc.somnum;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;

public class charactersArray_exe_1 {

    public static ArrayList<String> userInput() {

        ArrayList<String> result = new ArrayList<String>();

        System.out.println("Введите количество строчек: ");
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите слово в camelCase: ");
            Scanner userWord = new Scanner(System.in);
            String word = userWord.nextLine();
            result.add(word);
        }
        return result;
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

    public static ArrayList<String> toSnakeCase(ArrayList<String> sourceArray) {

        ArrayList<String> result = new ArrayList<String>();

        for (String s : sourceArray) {
            String temp = "";
            for (Character c : toCharacterArray(s)) {
                if (Character.isUpperCase(c)) {
                    temp += "_";
                    temp += Character.toLowerCase(c);
                } else {
                    temp += c;
                }
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> words = userInput();
        System.out.println(words);

        System.out.print("Результат преобразования: " + toSnakeCase(words));
    }
}
