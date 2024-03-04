package com.example.MeetingManagement2.Service;




import com.example.MeetingManagement2.Data.Meeting;


import java.util.List;

public interface MeetingService {

    List<Meeting> getTodayMeetings();

    List<Meeting> getPreviousMeetings();

    List<Meeting> getUpcomingMeetings();
}
