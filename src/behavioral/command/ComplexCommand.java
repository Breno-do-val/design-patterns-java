package behavioral.command;

public class ComplexCommand implements Command {
    private Receiver receiver;
    private String a;
    private String b;

    public ComplexCommand(Receiver receiver, String a, String b) {
        this.receiver = receiver;
        this.a = a;
        this.b = b;
    }

    @Override public void execute() {
        System.out.println("ComplexCommand: Complex stuff should be done by a receiver object.");
        this.receiver.doSomething(this.a);
        this.receiver.doSomethingElse(this.b);
    }
}
