package com.company.ejercicio5;

public class hour {
    private int hour;
    private int minute;
    private int second;

    public hour(){
    }

    public hour(int hour, int minute, int second){
        this.hour= (hour>=0 && hour<24)?hour:0;
        this.minute= (minute>=0 && minute<60)?minute:0;
        this.second= (second>=0 && second<60)?second:0;
    }

    //Inciso 2
    private void addHour(){
        if(hour==23)
            this.hour= 0;
        else
            this.hour++;
    }

    private void addMinute(){
        if(minute==59) {
            this.minute = 0;
            addHour();
        }
        else
            this.minute++;
    }

    public void addSecond(){
        if(second==59) {
            this.second = 0;
            addMinute();
        }
        else
            this.second++;
    }

    //Inciso 3
    private void backHour(){
        if(hour==0)
            this.hour= 23;
        else
            this.hour--;
    }

    private void backMinute(){
        if(minute==0) {
            this.minute = 59;
            backHour();
        }
        else
            this.minute--;
    }

    public void backSecond(){
        if(second==0) {
            this.second = 59;
            backMinute();
        }
        else
            this.second--;
    }

    public String toString(){
        String hh= String.format("%02d", hour);
        String mm= String.format("%02d", minute);
        String ss= String.format("%02d", second);
        return hh + ":" + mm + ":" + ss;
    }
}
