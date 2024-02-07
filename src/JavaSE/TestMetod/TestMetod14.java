package JavaSE.TestMetod;

public class TestMetod14 {
    public static void main(String[] args) {

    }

    public static int count(int[] array){
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) a++;
        }
        return a;
    }
}

//Напишите метод, который принимает в аргументы массив целостных чисел и возвращает количество элементов, не равных 0.
//Ввод
//5
//1 2 3 4 5
//Вывод
//5
//
//Ввод
//6
//1 0 4 5 0 7
//Вывод
//4