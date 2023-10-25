package enums;

public enum DayOfWeekEnum {

    SUNDAY(false),
    MONDAY1(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private boolean isWorkingDay;

    DayOfWeekEnum(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public static DayOfWeekEnum valueOf(int ordinal) {
        if (ordinal == 1) {
            return MONDAY1;
        }
        return null;
    }
}
