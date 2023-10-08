package com.dudka.solution.main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.dudka.solution.sorter.DateSorter;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.parse("2004-07-01"),
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-06"),
                LocalDate.parse("2032-05-03")
        );

        DateSorter dateSorter = new DateSorter();
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);
        System.out.println(sortedDates);
    }
}
