package JavaSE.TestMetod;

public class TestMetod16 {
    public static void main(String[] args) {

    }

    public static void printMinAndMax(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}

//Создайте такой метод, который принимает в аргументы массив целостных чисел. Выведите минимальный и максимальный элементы массива.
//Ввод
//6
//1 3 12 56 34 98
//Вывод
//1
//98
//
//Ввод
//5
//123 -9 0 987 34
//Вывод
//-9
//987
