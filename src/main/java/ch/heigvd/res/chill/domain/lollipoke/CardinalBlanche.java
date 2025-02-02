package ch.heigvd.res.chill.domain.lollipoke;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class CardinalBlanche implements IProduct {

  public final static String NAME = "Cardinal blanche";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
