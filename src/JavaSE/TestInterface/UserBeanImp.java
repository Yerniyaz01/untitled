package JavaSE.TestInterface;

public class UserBeanImp extends User implements UserBean{
    User[] users;

    public UserBeanImp() {
    }

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].getName()+" ");
            System.out.println(users[i].getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName()==name) {
                System.out.print(users[i].getName()+" ");
                System.out.println(users[i].getSurname());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname()==surname) {
                System.out.print(users[i].getName()+" ");
                System.out.println(users[i].getSurname());
            }
        }
    }
}
