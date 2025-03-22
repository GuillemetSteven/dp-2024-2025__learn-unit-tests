package fr.anthonyquere.TeaShop;
import fr.anthonyquere.teashop.Tea;
import fr.anthonyquere.teashop.TeaCup;
import fr.anthonyquere.teashop.TeaShop;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TeaShopTest {

    @Test
    void should_create_teashop_with_default_temperature() {
        // Arrange & Act
        TeaShop teaShop = new TeaShop(90);

        // Assert
        assertNotNull(teaShop);
    }

    @Test
    void should_add_tea_successfully() {
        // Arrange
        TeaShop teaShop = new TeaShop(95);
        Tea randomTea = new Tea("RandomName", 180, 95, false);

        // Act
        teaShop.addTea(randomTea);

        // Assert
        assertDoesNotThrow(() -> teaShop.prepareTea("RandomName"));
    }

    @Test
    void should_add_tea_and_prepare_it_correctly() {
        // Arrange
        TeaShop teaShop = new TeaShop(95);
        Tea randomTea = new Tea("RandomName", 180, 95, false);

        // Act
        teaShop.addTea(randomTea);
        TeaCup cup = teaShop.prepareTea("RandomName");

        // Assert
        assertDoesNotThrow(cup::isReadyToDrink);
    }

    @Test
    void should_accept_valid_water_temperatures() {
        // Arrange
        TeaShop teaShop = new TeaShop(95);

        // Assert
        assertDoesNotThrow(() -> teaShop.setWaterTemperature(0));
        assertDoesNotThrow(() -> teaShop.setWaterTemperature(100));
        assertDoesNotThrow(() -> teaShop.setWaterTemperature(50));
    }

    @Test
    void should_throw_exception_when_setting_invalid_water_temperature() {
        // Arrange
        TeaShop teaShop = new TeaShop(90);

        // Act
        Exception exceptionHigh = assertThrows(IllegalArgumentException.class, () -> {
            teaShop.setWaterTemperature(101);
        });

        // Act
        Exception exceptionLow = assertThrows(IllegalArgumentException.class, () -> {
            teaShop.setWaterTemperature(-1);
        });

        // Assert
        assertTrue(exceptionHigh.getMessage().contains("between 0 and 100"));
        assertTrue(exceptionLow.getMessage().contains("between 0 and 100"));
    }
}
