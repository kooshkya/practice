package view;

import controller.LoginController;
import util.MyScanner;
import java.util.Scanner;
import java.util.regex.Matcher;

import enums.LoginViewCommands;

public class LoginView implements View {
    private static LoginView loginView;
    public static LoginView getLoginView() {
        if (loginView == null) {
            loginView = new LoginView();
        }
        return loginView;
    }

    private Scanner scanner;
    private LoginController controller;
    public void run() {
        System.out.println("Login Menu");
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = null;
            if ((matcher = LoginViewCommands.ListCommands.getMatcher(input)).matches()) {

            } else if ((matcher = LoginViewCommands.RegisterAsStudent.getMatcher(input)).matches()) {
                System.out.println(matcher.group("password"));
                System.out.println(matcher.group("username"));
            } else if ((matcher = LoginViewCommands.Quit.getMatcher(input)).matches()) {
                ViewRunner.getViewRunner().setNextView(null);
                break;
            }
        }
    }

    private LoginView() {
        scanner = MyScanner.getScanner();
        controller = LoginController.getLoginController();
    }
}
