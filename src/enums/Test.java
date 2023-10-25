package enums;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
//        try {
//            DayOfWeekClass.valueOf("asdas");
//        } catch (IllegalArgumentException ex) {
//            //log msg
//        }
        DayOfWeekClass monday = DayOfWeekClass.valueOf("monday");
        System.out.println("monday = " + monday);

        DayOfWeekEnum monday1 = DayOfWeekEnum.valueOf("MONDAY1");
        System.out.println("monday1 = " + monday1);
        DayOfWeekEnum[] values = DayOfWeekEnum.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        System.out.println("monday1.isWorkingDay() = " + monday1.isWorkingDay());
        System.out.println("monday1.name() = " + monday1.name());

        System.out.println("DayOfWeekEnum.SUNDAY.ordinal() = " + DayOfWeekEnum.SUNDAY.ordinal());
        System.out.println("DayOfWeekEnum.SATURDAY.ordinal() = " + DayOfWeekEnum.SATURDAY.ordinal());
    }

}
