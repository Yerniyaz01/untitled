package JavaSE.TestMetod;

public class TestMetod10 {
    public static void main(String[] args) {
        int[] array = {12, 5, 95, 68, 123};
        System.out.println(getSum(array));
    }

    public static int getSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}

//Создайте такой метод, который принимает в аргументы массив из целых чисел. Необходимо просуммировать элементы массива, не учитывая элементы, которые делятся на 5 без остатка.
//Ввод
//5
//12 5 95 68 123
//Вывод
//203
//
//Ввод
//6
//12 45 115 678 46 34
//Вывод
//770