package io.practice.loop;

public class Lesson {

//    static void main() {
//        int max = 40;
//        for (int row = 1; row <= max; row++) {
//            for (int col = 1; col <= max; col++) {
//                System.out.print(row * col + "\t");
//                if (col == 7) {
//                    break;
//                }
//            }
//            System.out.println();  // новая строка
//        }
//
//    }

    static void main() {
        int max = 30;
        for (int row = 1; row <= max; row++) {
            for (int col = 1; col <= max; col++) {
                if (col == 7 || row == 7) {
                    continue;
                }
                System.out.print(row * col + "\t");
            }
            System.out.println();  // новая строка
            row++;
        }

    }
}
