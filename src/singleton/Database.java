package singleton;

import java.sql.*;

public class Database {
    private static Database instance;
    private static Connection connection;

    private Database(){
        String postgresUrl = "jdbc:postgresql://localhost:5432/database";
        String userName = "postgres";
        String password = "postgres";
        try {
            connection = DriverManager.getConnection(postgresUrl,userName,password);
        }
        catch (Exception e) {
            System.out.println("Couldn't connect to the Database.");
        }
    }

    public static Database getInstance(){
        if(Database.instance == null)
            instance = new Database();

        return Database.instance;
    }

    public void query(String sql){
        Statement statement;
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println(metaData.getTableName(1) + "\n------------------");
            while(resultSet.next()){
                for(int i = 1; i <= columnCount; i++){
                    Object object = resultSet.getObject(i);
                    System.out.printf(object == null ? "NULL" : object.toString() + ", ");
                }
                System.out.println("\n------------------");
            }

        } catch (Exception ex){
            System.out.println("Query was unsuccessfull.");
        }
    }
}
