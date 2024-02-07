package JavaSE.TestMetod;

public class TestMetod5 {

    public static void contains(String s1, String s2){
        int a = s1.indexOf(s2);
        if (a == -1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
