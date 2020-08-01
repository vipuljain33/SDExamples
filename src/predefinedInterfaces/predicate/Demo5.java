package predefinedInterfaces.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo5 {

    public static void main(String[] args)
    {

        Predicate<User> p = user -> user.usename.equals("admin")&& user.password.equals("admin@123");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        User user = new User(username, password);
        if(p.test(user))
        {
            System.out.println("Login credentials are valid");
        }else
        {
            System.out.println("Login credentials are not valid");
        }

    }
}


class User{

    String usename;
    String password;


    public User(String usename, String password) {
        this.usename = usename;
        this.password = password;
    }
}
