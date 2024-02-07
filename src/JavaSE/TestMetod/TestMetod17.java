package JavaSE.TestMetod;

public class TestMetod17 {
    public static void main(String[] args) {
        System.out.println(operate(5,5,'/'));
    }

    public static double operate(int a, int b, char c) {
        if (c == '+') return (double) a + b;
        if (c == '-') return (double) a - b;
        if (c == '*') return (double) a * b;
        if (c == '/') return (double) a / b;
        else return 0;
    }
}

//Создайте такой метод, который принимает в аргументы 2 целостных числа a и b и знак оператора. Программа должна вывести результат, исходя от арифметического оператора.
//Ввод
//6
//8
//+
//Вывод
//14.0
//
//Ввод
//10
//5
//-
//Вывод
//5.0
