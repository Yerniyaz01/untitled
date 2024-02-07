package JavaSE.TestAbstract;

public class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    public void addUser(User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printTeacher() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printStudent() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printUser(int index) {
        int a = 0;
        for (int i = 0; i < sizeOfUsers; i++) {
            if (i == index) {
                System.out.println(memory[i].getUserData());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("No such user in this index");
        }
    }
}
