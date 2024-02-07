package JavaSE.TestMetod;

public class TestMetod9 {
    public static void main(String[] args) {

    }

    public static void show(int array[]){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 23) break;
            if (array[i]%2!=0) {
                System.out.println(array[i]);
            }
        }
    }
}

//Создайте такой метод, который принимает в аргументы массив из целых чисел. Программа должна выводить нечетные числа из массива и остановиться, если встретит число 23.
//Ввод
//6
//45 67 12 23 47 98
//Вывод
//45
//67
//
//Ввод
//8
//4 1 56 34 23 78 96 -6
//Вывод
//1
