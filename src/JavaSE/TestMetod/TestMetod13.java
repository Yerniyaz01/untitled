package JavaSE.TestMetod;

public class TestMetod13 {
    public static void main(String[] args) {

    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        char[] sym = {'a', 'e', 'i', 'o', 'u'};
        char[] text = str.toCharArray();
        int a = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < sym.length; j++) {
                if (sym[j] == text[i]) {
                    a++;
                }
            }
        }
        return a;
    }
}

//Напишите метод, который в аргументы принимает строку. Нужно посчитать количество гласных букв в строке. (Гласные буквы: a, e, i, o, u)
//Ввод
//apple
//Вывод
//2
//
//Ввод
//google
//Вывод
//3