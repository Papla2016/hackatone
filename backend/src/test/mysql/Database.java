package test.mysql;

import com.mysql.cj.xdevapi.JsonValue;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/satellites";
    private static String password = "smuzi";
    private static String username = "root";

    private Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, username, password);
    }

    private void close(Connection connect) throws SQLException {
        connect.close();
    }

    public void saveInDatabase(Satellite satellite) throws ClassNotFoundException {
        try {
            Connection connection = connect();
            String sqlState = "INSERT INTO satellite VALUES(" + String.valueOf(satellite.getId()) + "," +
                    satellite.getStatus() + "," + String.valueOf(satellite.getSpeed()) + "," + satellite.getOrbit() +
                    ");";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlState);
            close(connection);
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public Satellite selectFromDatabase(int id) throws ClassNotFoundException {
        try {
            Connection connection = connect();
            String sqlState = "SELECT * FROM satellite WHERE id = " + String.valueOf(id) + ";";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlState);
            resultSet.next();
            Satellite satellite = null;//new Satellite(resultSet.getInt("ID"),resultSet.getInt("SPEED"),resultSet.getString("STATUS"));
            close(connection);
            return satellite;
        } catch (Exception e) {
            System.out.print(e);
            return null;
        }

    }
    public int updateDatabase(int id,int speed)throws ClassNotFoundException{
        try {
            Connection connection = connect();
            String sqlState = "UPDATE satellite SET SPEED =" + String.valueOf(speed)+";";
            Statement statement = connection.createStatement();
            return statement.executeUpdate(sqlState);

        } catch (Exception e){
            return -1;
        }
    }
    public int updateDatabase(int id,String status)throws ClassNotFoundException{
        try {
            Connection connection = connect();
            String sqlState = "UPDATE satellite SET STATUS =" + status +";";
            Statement statement = connection.createStatement();
            return statement.executeUpdate(sqlState);

        } catch (Exception e){
            return -1;
        }
    }
    public int updateDatabase(int id, JsonValue orbit)throws ClassNotFoundException{
        try {
            Connection connection = connect();
            String sqlState = "UPDATE satellite SET ORBIT =" + String.valueOf(orbit)+";";
            Statement statement = connection.createStatement();
            return statement.executeUpdate(sqlState);

        } catch (Exception e){
            return -1;
        }
    }

}

