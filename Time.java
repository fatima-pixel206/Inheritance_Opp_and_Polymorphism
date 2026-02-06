package OPP;

public class Time {
    private int date;
    private int month;
    private int year;

    public Time(int date,int month,int year ){
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public void setDate(int date){
        this.date=date;
    }
    public int getDate(){
        return date;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }



}
