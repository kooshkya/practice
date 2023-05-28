package controller;

import view.ViewRunner;

public class LoginController {
    private static LoginController loginController;
    private LoginController() {}
    public static LoginController getLoginController() {
        if (loginController == null) {
            loginController = new LoginController();
        }
        return loginController;
    }

    public void goToStudentPage() {
        ViewRunner.getViewRunner().setNextView();
    }
}
