package JavaSE.TestMetod;

public class TestMetod20 {
    public static void main(String[] args) {
        getSeason(2);
    }

    public static String getSeason(int m) {
        if (m == 12 || m == 1 || m == 2) return "Winter";
        if (m == 3 || m == 4 || m == 5) return "Spring";
        if (m == 6 || m == 7 || m == 8) return "Summer";
        if (m == 9 || m == 10 || m == 11) return "Autumn";
        else return "0";
    }
}

//Создайте такой метод, который принимает в аргументы номер месяца и возвращает название сезона. (Winter, Spring, Summer, Autumn)
//Ввод
//3
//Вывод
//Spring
//
//Ввод
//6
//Вывод
//Summer