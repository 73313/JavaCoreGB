package lesson8;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {

    public final String PATH_DB =
            "jdbc:sqlite:C:\\Users\\михо\\IdeaProjects\\JavaCore1\\src\\main\\resources\\Weahter3.db" +"";
    Connection connection;

    public DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        connection= DriverManager.getConnection(PATH_DB);
    }
    public void addForecast( ForecasCon forecasCon) throws SQLException {
        try(PreparedStatement statement=connection.prepareStatement(
                "INSERT INTO FORECAST('Date','Maximum','Minimum')"+ "VALUES(?,?,?)")) {
            statement.setObject(1, forecasCon.Date);
            statement.setObject(2,forecasCon.Maximum);
            statement.setObject(3, forecasCon.Minimum);
            statement.execute();
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    public List<ForecasCon> findAllForecast() throws SQLException {
        List<ForecasCon>forecasCons= new ArrayList<>();
        try(Statement statement= connection.createStatement()) {
            ResultSet resultSet=statement.executeQuery("SELECT * FROM FORECAST");
            while (resultSet.next()){
                ForecasCon forecasCon=new ForecasCon();
                forecasCon.Date= resultSet.getString("Date");
                forecasCon.Maximum= resultSet.getInt("Maximum");
                forecasCon.Minimum= resultSet.getInt("Minimum");
                forecasCons.add(forecasCon);
            }
        }catch (Exception ignored){}
        return forecasCons;
    }
    public void deleteForecast(String Date) throws SQLException {
        try(PreparedStatement statement=connection.prepareStatement(
                "DELETE FROM  FORECAST WHERE Date=?")) {
            statement.setObject(1,Date);
            statement.execute();

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
