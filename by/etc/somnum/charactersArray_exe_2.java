package by.etc.somnum;

//Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class charactersArray_exe_2 {

    public static String userInput() {

        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        return line;
    }

    public static void main(String[] args) {

        System.out.print("Введите строку содержащее слово 'word': ");
        String line = userInput();

        System.out.println("Строка:" + line);

        line = line.replaceAll("word", "letter");
        System.out.println("Строка замена:" + line);
    }
}
