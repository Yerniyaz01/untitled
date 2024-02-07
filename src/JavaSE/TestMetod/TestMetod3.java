package JavaSE.TestMetod;

public class TestMetod3 {
    public static int check(String str, char letter) {
        str = str.toLowerCase();
        letter = Character.toLowerCase(letter);
        char[] symbols = str.toCharArray();
        int a = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == letter) {
                a++;
            }
        }
        return a;
    }
}

//Напишите метод, который в аргументы принимает строку и букву. Нужно посчитать сколько раз буква встречается в тексте. (Без учета регистра)
//Ввод:
//Bitlab
//b
//Вывод:
//2
//
//Ввод:
//Java
//a
//Вывод:
//2
