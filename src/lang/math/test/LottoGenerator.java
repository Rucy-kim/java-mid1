package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final int[] numbers = new int[6];


    public LottoGenerator getLottoNumbers() {
        for (int i = 0; i < 6; i++) {
            numbers[i] = generator();
        }

        return this;
    }

    private int generator() {
        Random random = new Random();

        while (true){
            int num = random.nextInt(45) + 1;

            for (int number : numbers) {
                if (number != num) {
                    return num;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(" ").append(number);
        }

        return sb.toString();
    }
}
