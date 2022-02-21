package behavioral.command;

public class SimpleCommand implements Command {
    private String payload;

    SimpleCommand(String payload) {
        this.payload = payload;
    }

    @Override public void execute() {
        System.out.println(String.format("SimpleCommand: See, I can do simple things like printing %s", payload));
    }
}
