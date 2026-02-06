package OPP;

public class Date {
    private int date;
    private int month;
    private int year;
    Date(int date, int month ,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public void setDate(int date){

    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
