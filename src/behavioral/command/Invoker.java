package behavioral.command;

public class Invoker {
    private Command onStart;
    private Command onFinish;

    public void setOnStart(Command command) {
        this.onStart = command;
    }

    public void setOnFinish(Command command) {
        this.onFinish = command;
    }

    public void doSomethingImportant() {
        this.onStart.execute();
        this.onFinish.execute();
    }
}
