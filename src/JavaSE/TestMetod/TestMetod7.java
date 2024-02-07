package JavaSE.TestMetod;

public class TestMetod7 {
    public static void main(String[] args) {
        int array[] = {123,24,0,987,34};
        System.out.println(getAverage(array));
    }

    public static double getAverage(int array[]) {
        double sum = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                sum = sum + array[i];
                a++;
            }
        }
        sum = sum / a;
        return sum;
    }

}

//Создайте такой метод, который принимает в аргументы массив целостных чисел. Программа должна вывести среднее арифметическое всех четных элементов массива.
//Ввод
//6
//1 3 12 56 34 98
//Вывод
//50.0
//
//Ввод
//5
//123 24 0 987 34
//Вывод
//19.333333333333332
