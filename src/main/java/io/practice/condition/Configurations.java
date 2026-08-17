package io.practice.condition;

public class Configurations {

    /**
     * Валидация конфигурации
     * • Реализуйте «Валидация конфигурации»: оператор !.
     * • String baseUrl, int timeoutSeconds, boolean screenshotsEnabled, String browser
     * • baseUrl начинается с http:// или https://.
     * • timeoutSeconds: 1..120.
     * • browser: chrome, firefox или edge.
     *
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • Для edge screenshotsEnabled должен быть true.
     * • Метод: String validateConfig(String baseUrl, int timeoutSeconds, boolean screenshotsEnabled, String browser).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static String validateConfig(String baseUrl, int timeoutSeconds, boolean screenshotsEnabled, String browser) {
        if (baseUrl.startsWith("http://") || baseUrl.startsWith("https://")) {
            if (timeoutSeconds >= 1 && timeoutSeconds <= 120) {
                if (browser.equals("edge") && screenshotsEnabled) {
                    return "VALID";
                }
                if (browser.equals("chrome") || browser.equals("firefox")) {
                    return "VALID";
                }
                return "SCREENSHOTS_REQUIRED";
            }
            return "INVALID_TIMEOUT";
        }
        return "INVALID_URL";
    }

    static void main() {
        String result = validateConfig("https://stage", 30,false,"edge");
        System.out.println(result);
    }
}
