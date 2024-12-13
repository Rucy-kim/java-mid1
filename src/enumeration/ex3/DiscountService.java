package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discountPrice = 0;

        if (classGrade == BASIC) {
            discountPrice = 10;
        } else if (classGrade == GOLD) {
            discountPrice = 20;
        } else if (classGrade == DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPrice / 100;
    }
}
