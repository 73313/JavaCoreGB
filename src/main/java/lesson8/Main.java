package lesson8;

import java.io.IOException;
import java.sql.SQLException;

public class Main {



    public static void main(String[] args) throws IOException, SQLException {
        // System.out.println( RequestHandler.detectCityId("Korolev"));
        String cityCode = RequestHandler.detectCityId("Korolev");
        String forecast= RequestHandler.getForecast(cityCode);
        System.out.println(forecast);

//////////////
        DbHandler dbHandler =new DbHandler();
        ForecasCon forecasCon=new ForecasCon();
        forecasCon.Date= "2021-11-14T13:00:00+03:00";
        forecasCon.Maximum= (float) -4.6;
        forecasCon.Minimum= (float) -5.6;
        forecasCon.Date= forecasCon.getDate();

        System.out.println();
        dbHandler.addForecast(forecasCon);
        System.out.println(dbHandler.findAllForecast());

    }
}
