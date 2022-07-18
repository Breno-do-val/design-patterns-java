package structural.adapter.adaptee;

public class SQLClient {
    public void insertDB() {
        System.out.println("SQL ::: Inserting data");
    }

    public void updateDB() {
        System.out.println("SQL ::: Updating data");
    }

    public void deleteDB() {
        System.out.println("SQL ::: Deleting data");
    }
}
