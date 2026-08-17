package io.practice.condition;

public class PasportV2 {

    /**
     * Допуск к вождению
     * Входные данные: возраст (int), есть ли действующая медсправка (boolean), категория прав нужна ("B" или "A")
     * Правила:
     * Возраст ≥ 18 И медсправка действует → базовая проверка пройдена
     * Категория "A" (мотоцикл) → дополнительно нужен возраст ≥ 20
     * Категория "B" → без доп. условий
     * Иначе — отказ с объяснением причины
     * Методы: isAgeValid, hasMedicalCert, isMotorcycleAgeOk, canDrive
     */

    public static boolean isAgeValid(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static boolean hasMedicalCert(boolean med) {
        if (med) {
            return true;
        }
        return false;
    }

    public static boolean isMotorcycleAgeOk(String category, int age) {
        if (age >= 20 && "A".equals(category)) {
            return true;
        }
        return false;
    }

    public static String canDrive(int age, boolean med, String category) {
        if (isAgeValid(age)) {
            if (hasMedicalCert(med)) {
                if ("B".equals(category)){
                    return "Права выданы";
                } else if (isMotorcycleAgeOk(category,age)){
                    return "Права выданы";
                } else {
                    return "Условия не соблюдены";
                }
            } else {
                return "Базовая проверка не пройдена";
            }
        } else {
            return "Базовая проверка не пройдена";
        }
    }

    static void main() {
        int age = 19;
        boolean med = true;
        String category = "A";
        String finalScore = canDrive(age, med, category);
        System.out.println("Ваш возраст: " + age + "; " + "Медкомиссия: " + med + "; " + "Категория: " + category + "; " + finalScore);
    }
}
