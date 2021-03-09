package singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM table_1");

        Database bar = Database.getInstance();
        bar.query("SELECT name FROM table_1");
    }
}
