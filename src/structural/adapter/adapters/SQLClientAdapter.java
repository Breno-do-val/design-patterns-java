package structural.adapter.adapters;

import structural.adapter.adaptee.SQLClient;
import structural.adapter.interfaces.ITarget;

public class SQLClientAdapter implements ITarget {
    private SQLClient sqlClient;

    public SQLClientAdapter(SQLClient sqlClient) {
        this.sqlClient = sqlClient;
    }

    @Override
    public void insert() {
        this.sqlClient.insertDB();
    }

    @Override
    public void update() {
        this.sqlClient.updateDB();
    }

    @Override
    public void delete() {
        this.sqlClient.deleteDB();
    }
}
