package by.etc.somnum;

/*Дана строка, содержащая следующий текст (xml-документ):
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
*/

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternAndMatcher_exe_2 {

    public static Dictionary<String, String> parceXml(String source) {

        Dictionary<String, String> result = new Hashtable<String, String>();

        Matcher matcher = Pattern.compile("<(tag[13])>(.+?)</tag[13]>").matcher(source);
        while (matcher.find()) {
            System.out.println(matcher.group(1) + " " + matcher.group(2));
        }

        return result;
    }

    public static void main(String[] args) {
        String sourceXml = "\n" +
                "<notes> \n" +
                "   <note id = \"1\"> \n" +
                "       <to>Вася</to> \n" +
                "       <from>Света</from> \n" +
                "       <heading>Напоминание</heading> \n" +
                "       <body>Позвони мне завтра!</body> \n" +
                "   </note> \n" +
                "   <note id = \"2\"> \n" +
                "       <to>Петя</to> \n" +
                "       <from>Маша</from> \n" +
                "       <heading>Важное напоминание</heading> \n" +
                "       <body/> \n" +
                "   </note> \n" +
                "</notes> ";

        parceXml(sourceXml.replaceAll("\n", ""));
    }
}
