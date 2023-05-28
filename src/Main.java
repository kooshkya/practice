import view.LoginView;
import view.ViewRunner;

public class Main {
    static ViewRunner runner = ViewRunner.getViewRunner();

    public static void main(String[] args) {
        runner.setNextView(LoginView.getLoginView());
        runner.execute();
    }
}
