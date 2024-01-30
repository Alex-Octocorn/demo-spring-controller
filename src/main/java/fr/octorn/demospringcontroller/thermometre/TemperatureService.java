package fr.octorn.demospringcontroller.thermometre;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public Thermometre getDefaultTemperature(double temperature) {
        Thermometre thermometre = new Thermometre();
        thermometre.setCelsius(temperature);
        return thermometre;
    }


    public Thermometre getTemperatures(String unit, double value) {
        Thermometre temperature = this.getDefaultTemperature(value);

        if (unit.equals("fahrenheit")) {
            temperature.setFahrenheit(value);
        }

        if (unit.equals("kelvin")) {
            temperature.setKelvin(value);
        }

        return temperature;
    }
}
