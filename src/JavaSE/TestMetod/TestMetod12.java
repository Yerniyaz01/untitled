package JavaSE.TestMetod;

public class TestMetod12 {
    public static void main(String[] args) {

    }

    public static void redouble(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

//Напишите метод, который в аргументы принимает строку и продублирует все её символы.
//Ввод
//Bitlab
//Вывод
//BBiittllaabb
//
//Ввод
//Java
//Вывод
//JJaavvaa