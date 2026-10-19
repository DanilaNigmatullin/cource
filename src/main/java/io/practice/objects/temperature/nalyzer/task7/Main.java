package io.practice.objects.temperature.nalyzer.task7;

public class Main {

    static void main() {

        double[] temperatures = {3.5, 5.0, -2.0, 7.5, 1.0};

        TemperatureAnalyzer temperatureAnalyzer = new TemperatureAnalyzer(temperatures);

        temperatureAnalyzer.printReport();
    }
}
