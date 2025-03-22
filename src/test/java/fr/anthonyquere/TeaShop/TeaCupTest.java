package fr.anthonyquere.TeaShop;
import fr.anthonyquere.teashop.Tea;
import fr.anthonyquere.teashop.TeaCup;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TeaCupTest {

    @Test
    void should_be_able_to_add_tea_to_new_cup() {
        // Arrange
        TeaCup cup = new TeaCup();
        Tea tea = new Tea("RandomName", 180, 95, false);

        // Act & Assert
        assertDoesNotThrow(() -> cup.addTea(tea));
    }

    @Test
    void should_not_be_ready_to_drink_when_just_prepared() {
        // Arrange
        TeaCup cup = new TeaCup();
        Tea tea = new Tea("RandomName", 180, 95, false);

        // Act
        cup.addWater(80);
        cup.addTea(tea);

        // Assert
        assertThat(cup.isReadyToDrink()).isFalse();
    }


    @Test
    void should_not_be_ready_to_drink_when_temperature_is_not_ideal() {
        // Arrange
        TeaCup cup = new TeaCup();
        Tea tea = new Tea("RandomName", 180, 95, false);

        // Act
        cup.addWater(60);
        cup.addTea(tea);

        // Assert
        assertThat(cup.isReadyToDrink()).isFalse();
    }

    @Test
    void  should_not_be_ready_to_drink_when_no_tea_added() {
        // Arrange
        TeaCup cup = new TeaCup();

        // Act
        cup.addWater(200);

        // Assert
        assertThat(cup.isReadyToDrink()).isFalse();
    }

    @Test
    void  should_not_be_ready_to_drink_when_tea_temp_is_negative() {
        // Arrange
        TeaCup cup = new TeaCup();
        Tea tea = new Tea("RandomName", 180, 95, false);

        // Act
        cup.addWater(-200);
        cup.addTea(tea);

        // Assert
        assertThat(cup.isReadyToDrink()).isFalse();
    }
}
