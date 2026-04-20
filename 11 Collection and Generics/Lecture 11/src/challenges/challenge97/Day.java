package challenges.challenge97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final Boolean isWeekday;

    Day(Boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "WEEKDAY" : "WEEKEND";
    }

}
