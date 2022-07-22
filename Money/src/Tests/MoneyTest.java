package Tests;

import Money.Money;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest {

    private Money _money;

    @BeforeEach
    void setup() {
        _money = new Money(10, 50);
    }

    @Test
    void addMoney() {
        var money = _money.AddMoney(new Money(99));

        Assertions.assertEquals(11, money.GetFloor());
        Assertions.assertEquals(49, money.GetPennies());
    }

    @Test
    void subtractMoney() {
        var money = _money.SubtractMoney(new Money(10, 0));

        Assertions.assertEquals(0, money.GetFloor());
        Assertions.assertEquals(50, money.GetPennies());
    }

    @Test
    void equals() {
        Assertions.assertEquals(new Money(10, 99), new Money(10, 99));
    }
}