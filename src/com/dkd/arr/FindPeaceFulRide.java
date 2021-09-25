package com.dkd.arr;


import java.util.ArrayList;
import java.util.List;

public class FindPeaceFulRide {
    public static void main(String[] args) {
        List<TimeFrames> timeFrames = new ArrayList<>();
        timeFrames.add(new TimeFrames(5,1));
        timeFrames.add(new TimeFrames(4,2));
        timeFrames.add(new TimeFrames(2,3));
        timeFrames.add(new TimeFrames(3,4));
        timeFrames.add(new TimeFrames(4,5));
        timeFrames.add(new TimeFrames(5,6));

        findMyPeacefulRide(timeFrames);
    }
    private static void findMyPeacefulRide(List<TimeFrames> timeFrames) {
        if(timeFrames.size()==1){
            System.out.println("From Time"+timeFrames.get(0).time +" to "+timeFrames.get(0).time+" you had a peaceful ride");
            return;
        }
        int startTimeIndex=0;
        int endTimeIndex=startTimeIndex;
        int prevEnd=startTimeIndex;
        int prevTimeFrame=startTimeIndex;
        int prevSpeed= timeFrames.get(0).speed;
        int maxDuration=0;
        for(int i = 1; i< timeFrames.size(); i++){
            if(timeFrames.get(i).speed<prevSpeed){
                int currentDuration=timeFrames.get(prevTimeFrame).time-timeFrames.get(prevEnd).time;
                if(currentDuration>maxDuration){
                    maxDuration=currentDuration;
                    startTimeIndex=prevEnd;
                    endTimeIndex=prevTimeFrame;
                }
                prevEnd=prevTimeFrame+1;
            }
            prevTimeFrame= i;
            prevSpeed= timeFrames.get(i).speed;
            //If increasing/Same speed  continues till end
            if(i==timeFrames.size()-1){
                int currentDuration=timeFrames.get(i).time-timeFrames.get(prevEnd).time;
                if(currentDuration>maxDuration){
                    maxDuration=currentDuration;
                    startTimeIndex=prevEnd;
                    endTimeIndex=prevTimeFrame;
                }
            }
        }
        System.out.println("From Time"+timeFrames.get(startTimeIndex).time +" to "+timeFrames.get(endTimeIndex).time+" you had a peaceful ride");
    }
    private static class TimeFrames{
        int speed;
        int time;

        public TimeFrames(int speed, int time) {
            this.speed = speed;
            this.time = time;
        }
    }
}

/*
Test cases Checked
[{"speed":1,"time"1},{"speed":2,"time":2},{"speed":4,"time":3},{"speed":3,"time":4},{"speed":3,"time":"5},{"speed":2,"time"6}]
[{"speed":5,"time"1},{"speed":3,"time":2},{"speed":3,"time":3},{"speed":3,"time":4},{"speed":2,"time":"5},{"speed":2,"time"6}]
[{"speed":5,"time"1},{"speed":3,"time":2},{"speed":3,"time":3},{"speed":3,"time":4},{"speed":3,"time":"5},{"speed":2,"time"6}]
[{"speed":5,"time"1},{"speed":1,"time":2},{"speed":2,"time":3},{"speed":3,"time":4},{"speed":2,"time":"5},{"speed":2,"time"6}]
[{"speed":5,"time"1}]
[{"speed":5,"time"1},{"speed":4,"time":2},{"speed":2,"time":3},{"speed":3,"time":4},{"speed":4,"time":"5},{"speed":5,"time"6}]
 */
