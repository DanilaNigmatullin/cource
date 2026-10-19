package io.practice.objects.number.array.task8;

public class Main {

    static void main() {

        int[] number =  {4, -3, 7, 8, -2, 5};

        NumberArray numberArray = new NumberArray(number);

        numberArray.printArray();
        numberArray.contains(7);
        numberArray.replaceNegativeWithZero();
        numberArray.countEven();
        numberArray.reverse();
    }
}
