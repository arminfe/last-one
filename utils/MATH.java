package utils;

public class MATH {

    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        else return x * factorial(x-1);

    }

    public static int factorialLoop(int y) {
        int storage=1;
        for (int w = 0; w < y; w=w+1) {
            return storage= y * factorialLoop(y - 1
            );
        }

        return storage;
    }


}