package com.example.recyclertviewcountdowntimersupport;

import in.xiandan.countdowntimer.TimerState;

public class TimeInfo {
    private long duration;
    private long remainingTime;
    private TimerState state;

//    public TimeInfo(long duration, long remainingTime, TimerState state) {
//        this.duration = duration;
//        this.remainingTime = remainingTime;
//        this.state = state;
//    }

    public TimeInfo(String s, String s1, TimerState start) {
        this.duration = duration;
        this.remainingTime = remainingTime;
        this.state = state;
    }



    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(long remainingTime) {
        this.remainingTime = remainingTime;
    }

    public TimerState getState() {
        return state;
    }

    public void setState(TimerState state) {
        this.state = state;
    }
}
