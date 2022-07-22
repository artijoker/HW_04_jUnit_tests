package Tests;

import Money.Money;
import Product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductTest {

    private Product _smartphone;

    @BeforeEach
    void setup(){
        _smartphone = new Product(
                "Google Pixel 5a",
                new Money(650, 0),
                20
        );
    }

    @Test
    void After_setting_a_discount_of_40_percent_the_price_of_the_product_changes_from_650_to_390() {
        _smartphone.SetPercentDiscount(40);

        Assertions.assertEquals(new Money(390,0), _smartphone.GetPrice());
    }

    @Test
    void After_raise_the_price_of_product_from_current_price_650_by_100_the_new_price_of_product_will_be_750() {
        _smartphone.RaisePrice(new Money(100,0));
        Assertions.assertEquals(new Money(750,0), _smartphone.GetPrice());
    }

    @Test
    void After_reduce_the_price_of_product_from_current_price_650_by_100_the_new_price_of_product_will_be_550() {
        _smartphone.ReducePrice(new Money(100,0));
        Assertions.assertEquals(new Money(550,0), _smartphone.GetPrice());
    }

    @Test
    void increaseQuantityProduct() {
        _smartphone.IncreaseQuantityProduct(10);
        Assertions.assertEquals(30, _smartphone.GetQuantity());
    }

    @Test
    void reduceQuantityProduct() {
        _smartphone.ReduceQuantityProduct(10);
        Assertions.assertEquals(10, _smartphone.GetQuantity());
    }
}