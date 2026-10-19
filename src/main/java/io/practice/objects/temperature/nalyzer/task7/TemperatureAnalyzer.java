package io.practice.objects.temperature.nalyzer.task7;

public class TemperatureAnalyzer {

    double[] temperatures; //массив температур

    TemperatureAnalyzer(double[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            throw new RuntimeException("Ошибка: массив температур не может быть пустым");
        }
        this.temperatures = temperatures;
    }

    double calculateAverage() {            //возвращает среднюю температуру

        double sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        return sum / temperatures.length;
    }

    double findMinimum() {                 //возвращает минимальную температуру

        double min = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
        }
        return min;
    }

    double findMaximum() {                 //возвращает максимальную температуру

        double max = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        return max;
    }

    int countDaysAboveAverage() {          //считает дни с температурой выше средней

        int count = 0;
        double average = calculateAverage();

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
        return count;
    }

    int findFirstFreezingDay() {           //возвращает индекс первого дня с температурой ниже 0

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < 0) {
                return i + 1;
            }
        }
        return -1;
    }

    void printReport() {                   //выводит полный отчёт
        System.out.println("Средняя температура: " + calculateAverage());
        System.out.println("Минимальная температура: " + findMinimum());
        System.out.println("Максимальная температура: " + findMaximum());
        System.out.println("Дней выше средней: " + countDaysAboveAverage());
        System.out.println("Первый день с отрицательной температурой: " + findFirstFreezingDay());
    }
}
