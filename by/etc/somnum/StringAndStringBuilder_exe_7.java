package by.etc.somnum;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringAndStringBuilder_exe_7 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static Set<Character> deleteDupcicateSymbol(String line) {

        Set<Character> set = new LinkedHashSet<Character>();
        for (char c : line.toCharArray()) {
            set.add(Character.valueOf(c));
        }
        return set;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку: ");
        String line = userInput();

        line = line.replaceAll(" ", ""); //удаляем пробелы

        System.out.println(deleteDupcicateSymbol(line).toString());
    }
}
