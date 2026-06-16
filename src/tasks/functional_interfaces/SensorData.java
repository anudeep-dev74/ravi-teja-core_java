package tasks.functional_interfaces;

import java.util.function.Function;

@FunctionalInterface
interface TemperatureExtractor{
    double extract(SensorData data);
}

@FunctionalInterface
interface TemperatureChecker{
    boolean check(Double temperature);
}

public class SensorData {
    double temperature;
    double humidity;

    SensorData(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public static void main(String[] args) {
        SensorData sd = new SensorData(35.0, 60.0);
        TemperatureExtractor extractor = new TemperatureExtractor() {
            @Override
            public double extract(SensorData data) {
                return data.getTemperature();
            }
        };
        double temperature = extractor.extract(sd);
        System.out.println("Temperature is : " + temperature);
        double threshold = 25.0;
        TemperatureChecker tc = new TemperatureChecker() {
            @Override
            public boolean check(Double temperature) {
                return temperature > threshold;
            }
        };
        boolean result = tc.check(temperature);
        System.out.println("Temperature above threshold: " + result);
    }
}
