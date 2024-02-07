package JavaSE.TestMetod;

public class TestMetod2 {

    public static String triangle(int a, int b, int c) {
        int sum = a + b;
        int sum2 = b + c;
        int sum3 = a + c;
        if (sum > c && sum2 > a && sum3 > b) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

//Напишите метод, который в аргументы принимает три натуральных числа a, b, c. Определите, существует ли треугольник с такими сторонами.
//Если треугольник существует, то метод возвращает строку "YES", иначе возвращает строку "NO".
//Ввод:
//4
//6
//9
//Вывод:
//YES
//
//Ввод:
//3
//6
//2
//Вывод:
//NO