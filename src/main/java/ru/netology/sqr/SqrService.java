package ru.netology.sqr;

public class SqrService {

    public int calcSqr(int start, int finish) {

        int count = 0;
        for (int i = 10; i < 100; i++) {

            if (finish >= (i * i) && (i * i) >= start) {
                count++;
            }

        }
        return count;
    }

}
