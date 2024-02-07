package JavaSE.TestMetod;

public class TestMetod19 {
    public static void main(String[] args) {

    }

    public static void check(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

//Создайте такой метод, который принимает в аргументы массив из целых чисел. Необходимо вывести элементы, которые одновременно меньше 50 и делятся на 5 без остатка.
//Ввод
//6
//45 67 12 23 47 98
//Вывод
//45
//
//Ввод
//8
//23 35 45 12 67 90 6 2
//Вывод
//35
//45
