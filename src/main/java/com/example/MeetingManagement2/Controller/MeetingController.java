package com.example.MeetingManagement2.Controller;




import com.example.MeetingManagement2.Data.Meeting;
import com.example.MeetingManagement2.Service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/meetings")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @GetMapping("/today")
    public List<Meeting> getTodayMeetings() {
        return meetingService.getTodayMeetings();
    }

    @GetMapping("/previous")
    public List<Meeting> getPreviousMeetings() {
        return meetingService.getPreviousMeetings();
    }

    @GetMapping("/upcoming")
    public List<Meeting> getUpcomingMeetings() {
        return meetingService.getUpcomingMeetings();
    }
}
