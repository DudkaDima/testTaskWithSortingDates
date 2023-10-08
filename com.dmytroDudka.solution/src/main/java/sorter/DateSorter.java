package sorter;

import java.time.LocalDate;
import java.util.*;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 package sample;

 import java.time.LocalDate;
 import java.util.Collection;
 import java.util.List;

 /**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less important.
 * Implement in single class. Don't change constructor and method signature.
 */
public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public static Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        
                List<LocalDate> datesWithR = new ArrayList<>();
                List<LocalDate> datesWithoutR = new ArrayList<>();

                for (LocalDate date : unsortedDates) {
                    String month = date.getMonth().toString().toLowerCase();
                    if (month.contains("r")) {
                        datesWithR.add(date);
                    } else {
                        datesWithoutR.add(date);
                    }
                }

                // Sort datesWithR ascending and datesWithoutR descending
                datesWithR.sort(Comparator.naturalOrder());
                datesWithoutR.sort(Comparator.reverseOrder());

                // Combine the sorted lists
                datesWithR.addAll(datesWithoutR);

                return datesWithR;
            }

            public static void main(String[] args) {
                List<LocalDate> unsortedDates = Arrays.asList(
                        LocalDate.parse("2004-07-01"),
                        LocalDate.parse("2005-01-02"),
                        LocalDate.parse("2007-01-01"),
                        LocalDate.parse("2032-05-06"),
                        LocalDate.parse("2032-05-03")
                );

                Collection<LocalDate> sortedDates = sortDates(unsortedDates);
                System.out.println(sortedDates);
            }


    }
