package JavaSE.TestMetod;

public class TestMetod1 {

    public static int getMax(int a, int b, int c) {
        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}

//Напишите метод, который в аргументы принимает 3 значения целостных чисел и возвращает самое максимальное из них.
//Ввод:
//3
//6
//9
//Вывод:
//9
//
//Ввод:
//-4
//29
//17
//Вывод:
//29