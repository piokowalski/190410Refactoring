package com.infoshare.refactoring._2_exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemServiceTest {

    private ItemService testObj;

    private final static String GIVEN_NAME = "Test name";
    private final static int GIVEN_PRICE = 100;
    private final static String GIVEN_DESCRIPTION = "Test description";
    private final static boolean GIVEN_AVAILABILITY = true;

    @BeforeEach
    void setUp() {
        testObj = new ItemService();
        testObj.addItemToStock(GIVEN_NAME, GIVEN_PRICE, GIVEN_DESCRIPTION, GIVEN_AVAILABILITY);
    }

    @Test
    @DisplayName("Should return stock report")
    void returnsStockReport() {
        // when
        String result = testObj.getStockReport();

        // then
        assertThat(result)
                .contains("Name:")
                .contains(GIVEN_NAME)
                .contains("Description:")
                .contains(String.valueOf(GIVEN_PRICE))
                .contains("Price:")
                .contains(GIVEN_DESCRIPTION)
                .contains("Is available:")
                .contains(String.valueOf(GIVEN_AVAILABILITY));
    }

    @Test
    @DisplayName("Should return simple report after user has bought something")
    void returnsSimpleReport() {
        // given
        String secondName = "Second test name";
        int secondPrice = 150;
        String secondDescription = "Second test description";
        boolean secondAvailability = true;

        testObj.addItemToStock(secondName, secondPrice, secondDescription, secondAvailability);
        testObj.buyItem(secondName, false);

        // when
        String result = testObj.buyItem(GIVEN_NAME, false);

        // then
        assertThat(result)
                .startsWith("You bought totally")
                .contains(String.valueOf(2))
                .contains("items for")
                .contains(String.valueOf(250));
    }

    @Test
    @DisplayName("Should return detailed report after user has bought something and requested for detailed report")
    void returnsDeledReport() {
        // given
        String secondName = "Second test name";
        int secondPrice = 150;
        String secondDescription = "Second test description";
        boolean secondAvailability = true;

        testObj.addItemToStock(secondName, secondPrice, secondDescription, secondAvailability);
        testObj.buyItem(secondName, true);

        // when
        String result = testObj.buyItem(GIVEN_NAME, false);

        // then
        assertThat(result)
                .startsWith("You bought totally")
                .contains(String.valueOf(2))
                .contains("items for")
                .contains(String.valueOf(250));
    }

    @Test
    @DisplayName("Should not buy unavailable item")
    void doesNotBuyUnavailable() {
        // given
        String secondName = "Second test name";
        int secondPrice = 150;
        String secondDescription = "Second test description";
        boolean secondAvailability = false;

        testObj.addItemToStock(secondName, secondPrice, secondDescription, secondAvailability);
        testObj.buyItem(secondName, false);

        // when
        String result = testObj.buyItem(GIVEN_NAME, false);

        // then
        assertThat(result)
                .startsWith("You bought totally")
                .contains(String.valueOf(1))
                .contains("items for")
                .contains(String.valueOf(100));
    }
}