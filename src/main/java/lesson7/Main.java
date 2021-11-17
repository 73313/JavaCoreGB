package lesson7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cityCode = RequestHandler.detectCityId("Korolev");
        String forecast= RequestHandler.getForecast(cityCode);
        System.out.println(forecast);

    }

}
