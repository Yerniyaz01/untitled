package JavaSE.TestMetod;

public class TestMetod4 {

    public static String palindrome(String str){
        char[] symbols = str.toCharArray();
        String outside = "";
        for (int i = symbols.length-1; i >= 0; i--) {
            outside = outside + symbols[i];
        }
        if (outside.equals(str)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

//Напишите метод, который в аргументы принимает строку. Нужно определить, является ли наша строка палиндромом или нет. Палиндром - это когда текст читается так же одинаково, если его читать в обратном порядке.
//Ввод
//kazak
//Вывод
//YES
//
//Ввод
//bitlab
//Вывод
//NO