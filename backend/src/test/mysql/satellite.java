package test.mysql;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class satellite {
    public static class sattelite{
        private Connection connection() throws SQLException, IOException{
            Properties props = new Properties();
            try (InputStream in = Files.newInputStream(Paths.get("C:\\Users\\papla\\IdeaProjects\\hackatone\\backend\\src\\test\\mysql\\database.properties"))){
                props.load(in);
            }
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");
            return DriverManager.getConnection(url,username,password);
        }
        Connection connection;
        private  void disconnect() throws SQLException{
            connection.close();
        }
        public void updateDatabase() throws SQLException{
            Statement statement = connection.createStatement();
            String sqlStatement = "UPDATE satellite SET" +

        }

    }

}
