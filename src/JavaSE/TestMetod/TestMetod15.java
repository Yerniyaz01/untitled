package JavaSE.TestMetod;

public class TestMetod15 {
    public static void main(String[] args) {
        int[] array = {5,4,0,8,0,0,0,0,0,0,0};
        printUniqueElements(array);
    }

    public static void printUniqueElements(int[] array) {
        int check = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) check++;
            }
            if (check == 0) System.out.print(array[i] + " ");
            check = -1;
        }
    }
}

//Создайте такой метод, который принимает в аргументы массив целостных чисел. Метод должен вывести на экран уникальные элементы массива.
//Ввод
//5
//1 2 3 4 5
//Вывод
//1 2 3 4 5
//
//Ввод
//8
//1 0 4 5 0 7 5 7
//Вывод
//1 4
