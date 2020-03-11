package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    private String currentConditions;
    private ReceivingDevice receivingDevice;

    public WeatherTracker(ReceivingDevice receivingDevice) {
        this.receivingDevice = receivingDevice;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        receivingDevice.generateWeatherAlert(currentConditions);
    }
}
