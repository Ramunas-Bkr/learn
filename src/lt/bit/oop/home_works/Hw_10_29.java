package lt.bit.oop.home_works;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hw_10_29 {
    public static void main(String[] args) {

    int goodsquantity = 86;
    BigDecimal price2 = BigDecimal.valueOf(9.87);
    BigDecimal sum2 = BigDecimal.valueOf(goodsquantity).multiply(price2);
    int scale = 2;

    BigDecimal priceWithoutPVM2 = price2.divide(BigDecimal.valueOf(1.21), scale, RoundingMode.CEILING);
    BigDecimal sumWithoutPVM2 = priceWithoutPVM2.multiply(BigDecimal.valueOf(goodsquantity));
    BigDecimal goodsPVM2 = price2.subtract(priceWithoutPVM2);

    System.out.println("Prekės kaina be PVM: " + priceWithoutPVM2);
    System.out.println("Prekių kiekis: " + goodsquantity);
    System.out.println("Visų prekių kaina be PVM: " + sumWithoutPVM2);
    System.out.println("Visų prekių kaina su PVM: " +sum2);
    System.out.println("Prekės PVM lygus: " + goodsPVM2);
    }
}
