package com.dkd.dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConferenceSchedule {
    public static void main(String[] args) {
        int [] start={1, 2, 0, 6, 9, 10 };
        int [] end={ 3, 5, 7, 8, 11, 12};
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meetings.add(new Meeting(start[i],end[i],i));
        }
        int count=findNumberOfMeetings(meetings);
        System.out.print("Number of possible conference== "+ count);
    }
    private static int findNumberOfMeetings(List<Meeting> meetings) {
        int c=1;
        Collections.sort(meetings);
        int prev_end=meetings.get(0).end;
        for(int i=1;i<meetings.size();i++){
            if(meetings.get(i).start>=prev_end){
                prev_end=meetings.get(i).end;
                c++;
            }
        }
        return c;
    }
    private static class Meeting implements Comparable<Meeting>
    {
        int start;
        int end;
        int pos;

        Meeting(int start, int end, int pos)
        {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }

        @Override
        public int compareTo(Meeting o) {
            return this.end-o.end;
        }
    }
}
