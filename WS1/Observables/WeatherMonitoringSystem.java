package WS1.Observables;

public class WeatherMonitoringSystem {
    public static WeatherMonitoringSystem theInstance()
    {
        WeatherMonitoringSystem ws  = new WeatherMonitoringSystem();
        return ws;
    }

}
