package Events;

public class Date {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public Date() {
    }

    public Date(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public void printDate() {
        System.out.println(month + "월 " + day + "일 " + hour + ":" + minute);
    }


}
