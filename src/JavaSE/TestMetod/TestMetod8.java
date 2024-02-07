package JavaSE.TestMetod;

public class TestMetod8 {
    public static void main(String[] args) {

    }

    public static void replace(int array[][]){
        int[][] nums = new int[1][array.length];
        for (int i = array.length-1; i > array.length-2; i--) {
            for (int j = 0; j < array.length; j++) {
                nums[0][j] = array[0][j];
                array[0][j] = array[i][j];
                array[i][j] = nums[0][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Создайте такой метод, который принимает в аргументы двумерный массив размера NxN. Программа должна заменить первую (нулевую по индексу) строку массива на последнюю строку массива.
//Ввод
//4
//1 2 3 4
//5 6 7 8
//4 3 2 1
//8 7 6 5
//Вывод
//8 7 6 5
//5 6 7 8
//4 3 2 1
//1 2 3 4
//
//Ввод
//3
//12 34 56
//78 90 45
//67 23 38
//Вывод
//67 23 38
//78 90 45
//12 34 56
