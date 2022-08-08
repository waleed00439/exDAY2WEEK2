public class MyTime {
    private  int hour;
    private  int minute;
    private int second;


    long HH = second / 3600;
    long MM = (second % 3600) / 60;
    long SS = second % 60;

    public void setTime(int hour , int minute , int second){
        setHour(hour);
        setSecond(second);
        setMinute(minute);
    }
    public MyTime(){

    }
    public MyTime(int hour , int minute , int second){
        setHour(hour);
        setSecond(second);
        setMinute(minute);
    }
    public MyTime(int second){
        this.second=second;
    }
    @Override
    public String toString() {
        String timeInHHMMSS = String.format("%02d:%02d:%02d", HH, MM, SS);
        return timeInHHMMSS;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour <= 23 && hour >=0 ){
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Please enter Hour between 0 to 23");
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (hour <= 59 && hour >= 0) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Please enter second between 0 to 59.");
        }
    }

    public int getMinute() {
        return minute;
    }
    public int nextSecond(){
        int newSecond=0;
        if (second<= 59 && second >=0){
            second = newSecond+1;
            System.out.println("next second"+second);
        }
        else {
            newSecond= 0;
            second=newSecond;
            System.out.println("because the u r enter above range");
        }


        return second;
    }

    public int nextHour(){
        int newHour=0;
        if (second<= 23 && second >=0){
            second = newHour+1;
            System.out.println("next second"+second);
        }
        else {
            newHour= 0;
            second=newHour;
            System.out.println("because the u r enter above range");
        }


        return hour;
    }

    public int nextminute(){
        int newmin=0;
        if (second<= 23 && second >=0){
            second = newmin+1;
            System.out.println("next second"+second);
        }
        else {
            newmin= 0;
            second=newmin;
            System.out.println("because the u r enter above range");
        }


        return minute;
    }

//previousSecond

    // nextHour
    public MyTime previousHour(){
        MyTime Hour1 = new MyTime(getSecond());
        int newSec=0;
        if (getSecond()<= 23 && getSecond() >=0){
            hour = newSec-1;
            System.out.println("next second"+hour);
        }
        else {
            newSec= 0;
            hour=newSec;
            System.out.println("because the u r enter above range");
        }


        return Hour1;
    }

    public MyTime previousMinute(){
        MyTime min = new MyTime(getMinute());
        int newSec=0;
        if (getSecond()<= 23 && getSecond() >=0){
            minute = newSec-1;
            System.out.println("next second"+minute);
        }
        else {
            newSec= 0;
            minute=newSec;
            System.out.println("because the u r enter above range");
        }


        return min;
    }








    public MyTime previousSecond(){
        MyTime second1 = new MyTime(getSecond());
        int newSec=0;
        if (getSecond()<= 23 && getSecond() >=0){
            hour = newSec-1;
            System.out.println("next second"+hour);
        }
        else {
            newSec= 0;
            hour=newSec;
            System.out.println("because the u r enter above range");
        }


        return second1;
    }
    public void setMinute(int minute) {
        if (hour <= 59 && hour >= 0) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Please enter minute between 0 to 59.");
        }
    }

    public long getMM() {
        return MM;
    }

    public void setMM(long MM) {
        this.MM = MM;
    }
}
