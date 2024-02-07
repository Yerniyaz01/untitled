package JavaSE.TestMetod;

public class TestMetod6 {
    public static void main(String[] args) {

    }

    public static String check(String login, String password){
        boolean check = false;
        if (login.equals("admin")&&password.equals("qwerty")){
            check = true;
        }
        if (check) {
            return "Authentication completed";
        } else {
            return "Invalid login or password";
        }
    }
}

//Создайте такой метод, который принимает в аргументы логин и пароль. И если данные были введены верно, то метод возвращает Authentication completed, иначе Invalid login or password. (Логин должен быть - admin, пароль - qwerty)
//Ввод
//admin
//qwerty
//Вывод
//Authentication completed
//
//Ввод
//user
//123456
//Вывод
//Invalid login or password
