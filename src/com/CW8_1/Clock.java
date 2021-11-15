package com.CW8_1;/*
 * CW1 Week 6, to be used again in Week 7
 * Complete using your codes in Week 6 or the solutions
 *
 */

public class Clock {
    private int hours;
    private int minutes;

    // CW1 6.1
    // Creates a clock whose initial time is h hours and m minutes.

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // CW1 6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        this.hours = Integer.parseInt(s.substring(0, 2));
        this.minutes = Integer.parseInt(s.substring(3, 5));
    }

    // CW1 6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String strHour = null;
        String strMinutes = null;
        if (hours < 10) {
            strHour = "0" + hours;
        } else {
            strHour = String.valueOf(hours);
        }
        if (minutes < 10) {
            strMinutes = "0" + minutes;
        } else {
            strMinutes = String.valueOf(minutes);
        }
        String str = strHour + ":" + strMinutes;
        return str;
    }

    // CW1 6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {

        if (this.hours != that.hours) {
            return this.hours < that.hours;
        } else if (this.minutes != that.minutes) {
            return this.minutes < that.minutes;
        } else {
            return false;
        }
    }

    // CW1 6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if(minutes!=59){
            minutes++;
        }else{
            if (hours==23) {
                hours=0;
            }else{
                hours++;
            }
            minutes = 0;
        }

    }

    // CW1 6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        int addHour;
        int addMinute;
        if (minutes + delta < 60) {
            minutes += delta;
            return;
        }
        addHour = delta / 60;
        addMinute = delta % 60;
        minutes += addMinute;
        if (minutes >= 60) {
            minutes -= 60;
            addHour++;
        }
        hours += addHour;
        if (hours >= 24) {
            while (hours >= 24) {
                hours -= 24;
            }
        }


    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
