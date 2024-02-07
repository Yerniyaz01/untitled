package JavaSE.TestMetod;

public class TestMetod18 {
    public static void main(String[] args) {
        int[][] array = {{3, -8, 4, 12},{5, 56, 3, 5}};
        printMax(array);
    }

    public static void printMax(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) max = array[i][j];
            }
            System.out.println(max);
            max = Integer.MIN_VALUE;
        }
    }
}

//Создайте такой метод, который принимает в аргументы двумерный массив размера NxM. Программа должна вывести максимальный элемент в каждой строке.
//Ввод
//2 4
//3 -8 4 12
//5 56 3 5
//Вывод
//12
//56
//
//Ввод
//2 3
//12 34 -5
//-5 3 -56
//Вывод
//34
//3
