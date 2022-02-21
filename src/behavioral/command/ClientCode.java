package behavioral.command;

public class ClientCode {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setOnStart(new SimpleCommand("Say hi"));

        Receiver receiver = new Receiver();
        invoker.setOnFinish(new ComplexCommand(receiver, "Send email", "Save report"));

        invoker.doSomethingImportant();
    }
}
