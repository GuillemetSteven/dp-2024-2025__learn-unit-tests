package fr.anthonyquere.TeaShop;

import fr.anthonyquere.teashop.Tea;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TeaTest {

    @Test
    void should_create_tea_with_correct_properties() {
        // Arrange
        String expectedName = "Earl Grey";
        int expectedSteepingTime = 180;
        int expectedTemperature = 95;
        boolean expectedIsLoose = true;

        // Act
        Tea tea = new Tea(expectedName, expectedSteepingTime, expectedTemperature, expectedIsLoose);

        // Assert
        assertThat(tea.getName()).isEqualTo(expectedName);
        assertThat(tea.getSteepingTimeSeconds()).isEqualTo(expectedSteepingTime);
        assertThat(tea.getIdealTemperatureCelsius()).isEqualTo(expectedTemperature);
        assertThat(tea.isLoose()).isEqualTo(expectedIsLoose);
    }

    @Test
    void should_initialize_with_correct_ideal_temperature() {
        // Arrange
        int exceptedIdealTemp = 95;

        // Act
        Tea tea = new Tea("RandomName", 180, exceptedIdealTemp, false);

        // Assert
        assertThat(tea.getIdealTemperatureCelsius()).isEqualTo(exceptedIdealTemp);
    }

    @Test
    void should_set_ideal_temperature_celsius() {
        // Arrange
        Tea tea = new Tea("RandomName", 180, 95, false);
        System.out.println("Initial temp : " + tea.getIdealTemperatureCelsius());
        int newTemperature = 150;

        // Act
        tea.setIdealTemperatureCelsius(newTemperature);
        System.out.println("New temp : " + tea.getIdealTemperatureCelsius());

        // Assert
        assertThat(tea.getIdealTemperatureCelsius()).isEqualTo(newTemperature);
    }

}
