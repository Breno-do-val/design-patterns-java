package structural.adapter;

import structural.adapter.adaptee.SQLClient;
import structural.adapter.adapters.SQLClientAdapter;
import structural.adapter.interfaces.ITarget;

public class Client {
    public static void main(String[] args) {
        ITarget sqlAdapter = new SQLClientAdapter(new SQLClient());

        sqlAdapter.insert();
        sqlAdapter.update();
        sqlAdapter.delete();
    }
}
