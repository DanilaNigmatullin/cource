package io.practice.condition;

public class Pasport {

    /**
     * Допуск к вождению
     * Входные данные: возраст (int), есть ли действующая медсправка (boolean), категория прав нужна ли ("B" или "A")
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

    public static boolean isMotorcycleOk(String category, int age) {
        if (category.equals("B")) {
                return true;
        } else if (category.equals("A")) {
            if (age >= 20) {
                return true;
            }
        }
        return false;
    }

    public static String canDrive(int age, boolean med, String category) {
        if (isAgeValid(age)) {
            if (hasMedicalCert(med)) {
                return "Базовая проверка пройдена";
            }
            return "Недействующая медстраховка";
        }

        if (PasportV2.isMotorcycleAgeOk(category, age)) {
            return "Категория верная";
        }
        return "Категория не верная";
    }

    static void main() {
        int age = 19;
        boolean med = true;
        String category = "A";
        String finalScore = canDrive(age, med, category);
        System.out.println("Ваш возраст: " + age + "; " + "Медкомиссия: " + med + "; " + "Категория: " + category + "; " + finalScore);
    }
}
