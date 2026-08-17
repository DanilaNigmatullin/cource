package io.practice.condition;

public class Http {

    /**
     * Классификатор HTTP-ответов
     * Реализуйте «Классификатор HTTP-ответов»: if без else.
     * int statusCode, int responseTimeMs, boolean bodyPresent
     * Коды 200..299 считаются успешными.
     * responseTimeMs должен быть <= 2000.
     * Для кода 204 тело может отсутствовать; для остальных 2xx bodyPresent=true
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * Коды 400..499 классифицировать как CLIENT_ERROR, 500..599 как SERVER_ERROR.
     * Метод: String classifyResponse(int statusCode, int responseTimeMs, boolean bodyPresent).
     * Main только собирает данные и вызывает методы
     * Имена отражают бизнес-смысл
     * Результат должен быть воспроизводимым
     */

    public static String isValidStatus(int code) {
        if (code >= 200 && code <= 299) {
            return "PASSED";
        }
        if (code >= 400 && code <= 499) {
            return "CLIENT_ERROR";
        }
        if (code >= 500 && code <= 599) {
            return "SERVER_ERROR";
        }
        return "INCORRECT_STATUS";
    }

    public static String isTimeMsValid(int responseTime) {
        if (responseTime <= 2000) {
            return "PASSED";
        }
        return "SLOW_RESPONSE";
    }

    public static String isBodyValid(int statusCode, boolean body) {
        if (body || statusCode == 204) {
            return "PASSED";
        }
        return "INCORRECT_BODY";
    }

    public static String classifyResponse(int statusCode, int responseTimeMs, boolean bodyPresent) {
        String validateResult = isValidStatus(statusCode);
        if ("PASSED".equals(validateResult)) {
            validateResult = isTimeMsValid(responseTimeMs);
            if ("PASSED".equals(validateResult)) {
                return isBodyValid(statusCode, bodyPresent);
            } else {
                return validateResult;
            }
        } else {
            return validateResult;
        }
    }

    static void main() {
        String test = classifyResponse(204, 1000, false);
        System.out.println(test);
    }
}
