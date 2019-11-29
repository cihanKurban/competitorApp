package util;

import bean.User;
import config.Config;
import java.util.Scanner;

public class UserUtil {

    private static User login(String username, String password) {
        if ("Cihan".equals(username) && "123456".equals(password)) {
            System.out.println("Successful");
            User user = new User(username, password);
            return user;
        }
        throw new IllegalArgumentException("Username or password is incorrect");

    }

    public static User requireInputsAndLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type your username?");
        String username = sc.nextLine();

        System.out.println("Please type your password");
        String password = sc.nextLine();

        User user = UserUtil.login(username, password);
        Config.setUser(user);
        return user;
    }

    public static User requireInputsAndLogin(int tryCount, boolean throwException) {
        for (int i = 0; i < tryCount; i++) {
            try {
                User user = requireInputsAndLogin();
                return user;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Try again");
            }
        }
        if(throwException) {
            throw new IllegalArgumentException("You have banned!");
        }
        return null;  
    }
}
