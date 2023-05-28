package view;

public class ViewRunner {
    private View nextView;

    private static ViewRunner viewRunner = null;
    public static ViewRunner getViewRunner() {
        if (viewRunner == null) {
            viewRunner = new ViewRunner();
        }
        return viewRunner;
    }

    private ViewRunner() {
        nextView = null;
    }

    public void setNextView(View nextView) {
        this.nextView = nextView;
    }

    public void execute() {
        while (nextView != null) {
            nextView.run();
        }
    }
}
