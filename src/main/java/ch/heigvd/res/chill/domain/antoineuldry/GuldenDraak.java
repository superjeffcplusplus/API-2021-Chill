package ch.heigvd.res.chill.domain.antoineuldry;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GuldenDraak implements IProduct {
    public final static String NAME = "Gulden Draak";
    public final static BigDecimal PRICE = new BigDecimal(4.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
