package by.etc.somnum;

/*
Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом  три  различных
операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PatternAndMatcher_exe_1 {

    public static String userInput() {

        System.out.println("Сколько абзацев вы хотите вести? ");
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();

        System.out.println("Дерзай \n");

        String result = "";
        for (int i = 0; i < count + 1; i++) {
            String line = reader.nextLine();
            result += line;
            result += "\n";
        }
        return result.trim();
    }

    public static void sortParagraphs_ByCountSentences(String line) {

        String[] paragraphs = line.split("\n");
        Arrays.sort(paragraphs, new Comparator<String>() {

                    @Override
                    public int compare(String s1, String s2) {

                        int sentencesOneCount = s1.split("[.?!]").length;
                        int sentencesTwoCount = s2.split("[.?!]").length;
                        return sentencesOneCount > sentencesTwoCount ? +1 : sentencesOneCount < sentencesTwoCount ? -1 : 0;
                    }
                }
        );

        System.out.println("Отсортированные абзацы  по  количеству  предложений:");
        for (int i = 0; i < paragraphs.length; i++) {
            System.out.println(paragraphs[i]);
        }
    }

    public static void sortsWordsBylength(String line) {

        String replace = line.replaceAll("\n", "");
        String[] sentences = replace.split("[.?!]");

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("[\\s]");

            Arrays.sort(words, new Comparator<String>() {

                        @Override
                        public int compare(String s1, String s2) {

                            return s1.length() > s2.length() ? +1 : s1.length() < s2.length() ? -1 : 0;
                        }
                    }
            );
            sentences[i] = String.join(" ", words);
        }

        System.out.println("В  каждом  предложении  отсортировать  слова  по  длине:");
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }

    public static void sortTokens(String line) {

        System.out.println("Введите символ: ");
        Scanner reader = new Scanner(System.in);
        String symbol = reader.nextLine();

        String replace = line.replaceAll("\n", "");
        String[] sentences = replace.split("[.?!]");

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("[\\s]");

            Arrays.sort(words, new Comparator<String>() {

                        @Override
                        public int compare(String s1, String s2) {

                            int stringOneLetterCount = s1.replaceAll("[^" + symbol + "]", "").length();
                            int stringTwoLetterCount = s2.replaceAll("[^" + symbol + "]", "").length();
                            return stringOneLetterCount > stringTwoLetterCount ? -1 : stringOneLetterCount < stringTwoLetterCount ? +1 : 0;
                        }
                    }
            );
            sentences[i] = String.join(" ", words);
        }

        System.out.print("Слова отсортированы по вхождению буквы: " + symbol);
        System.out.println();
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }

    public static void main(String[] args) {

        String line = userInput();

        sortParagraphs_ByCountSentences(line);

        System.out.println();
        sortsWordsBylength(line);

        System.out.println();
        sortTokens(line);
    }
}
