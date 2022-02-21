package behavioral.command;

public class Receiver {
    public void doSomething(String a) {
        System.out.println(String.format("Receiver: working on (%s)", a));
    }

    public void doSomethingElse(String b) {
        System.out.println(String.format("Receiver: working on (%s)", b));
    }
}
