package com.example.MeetingManagement2.Service;

import com.example.MeetingManagement2.Data.Meeting;
import com.example.MeetingManagement2.Repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class MeetingServiceimpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Override
    public List<Meeting> getTodayMeetings() {
        Date today = new Date();
        return meetingRepository.findByDateEquals(today);
    }

    @Override
    public List<Meeting> getPreviousMeetings() {
        Date today = new Date();
        return meetingRepository.findByDateLessThanOrderByDateDesc(today);
    }

    @Override
    public List<Meeting> getUpcomingMeetings() {
        Date today = new Date();
        return meetingRepository.findByDateGreaterThanOrderByDateAsc(today);
    }
}
