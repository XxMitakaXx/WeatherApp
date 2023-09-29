import javax.swing.*;

public class AppRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGui().setVisible(true);

//                System.out.println(WeatherApi.getLocationData("Tokyo"));

//                System.out.println(WeatherApi.getCurrentTime());
            }
        });
    }
}
