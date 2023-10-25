package enums;

public class DayOfWeekClass {

    public static final DayOfWeekClass SUNDAY = new DayOfWeekClass("sunday", 0, false);
    public static final DayOfWeekClass MONDAY = new DayOfWeekClass("monday", 1, true);
    public static final DayOfWeekClass THURSDAY = new DayOfWeekClass("tusday", 2, true);

    private String value;
    private int dayIndex;
    private boolean isWorkingDay;

    private DayOfWeekClass(String value, int dayIndex, boolean isWorkingDay) {
        this.value = value;
        this.dayIndex = dayIndex;
        this.isWorkingDay = isWorkingDay;
    }

    public static DayOfWeekClass valueOf(String value) {
        if (value.equals(SUNDAY.value)) {
            return SUNDAY;
        }
        if (value.equals(MONDAY.value)) {
            return MONDAY;
        }
        if (value.equals(THURSDAY.value)) {
            return THURSDAY;
        }
        throw new IllegalArgumentException("You had pass incorrect day of week name");
    }

    @Override
    public String toString() {
        return "DayOfWeekClass{" +
                "value='" + value + '\'' +
                ", dayIndex=" + dayIndex +
                '}';
    }
}
