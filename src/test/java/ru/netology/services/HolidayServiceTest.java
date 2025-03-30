package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/Holiday.csv")
    void shouldCalculateHoliday(int income, int expenses, int threshold, int expected) {
        HolidayService service = new HolidayService();
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //void shouldCalculateHolidayTwo() {
    //    HolidayService service = new HolidayService();
    //    int income = 100_000;
    //    int expenses = 60_000;
    //    int threshold = 150_000;
    //    int expected = 2;

    //    int actual = service.calculate(income, expenses, threshold);

    //    Assertions.assertEquals(expected, actual);
    //}


}
