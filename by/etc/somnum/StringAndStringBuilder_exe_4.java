package by.etc.somnum;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class StringAndStringBuilder_exe_4 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("информатика");
        System.out.print("Слово <" + builder.toString() + ">");

        builder.delete(0, 3);
        builder.delete(2, 4);
        builder.delete(3, 6);
        builder.insert(0, "т");

        System.out.println(" превращается в <" + builder.toString() + "> ");
    }
}
