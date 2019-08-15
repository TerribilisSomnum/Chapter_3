package by.etc.somnum;

//В строке найти количество чисел.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class charactersArray_exe_4 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static int findCountNumber(String line) {

        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку содержащюю цифры: ");
        String line = userInput();

        System.out.println("Количество чисел в строке = " + findCountNumber(line));
    }
}