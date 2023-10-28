package test.mysql;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class main {
    public static void main (String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String sqlCommand = "INSERT Products(ProductName, Price) VALUES ('iPhone X' , 7600)," +
                    "('Galaxy S9',45000), ('Nokia 9', 36000)";
            statement.executeUpdate(sqlCommand);
            connection.close();
        } catch (Exception ex){
            System.out.print("Connection failed...");
            System.out.print(ex);
        }
    }
    public static Connection getConnection() throws SQLException, IOException{
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("C:\\Users\\papla\\IdeaProjects\\hackatone\\backend\\src\\test\\mysql\\database.properties"))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        return DriverManager.getConnection(url,username,password);
    }
}
