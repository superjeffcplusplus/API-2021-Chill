package ch.heigvd.res.chill.domain.Webblitchy;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class BFM implements IProduct {

    public final static String NAME = "BFM";
    public final static BigDecimal PRICE = new BigDecimal(4.8);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
