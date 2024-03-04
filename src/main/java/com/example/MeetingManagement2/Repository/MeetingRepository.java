package com.example.MeetingManagement2.Repository;

import com.example.MeetingManagement2.Data.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;




    public interface MeetingRepository extends JpaRepository<Meeting, Long> {

        List<Meeting> findByDateOrderByStartTimeAsc(Date date);

        List<Meeting> findByDateEquals(Date date);

        List<Meeting> findByDateGreaterThanOrderByDateAsc(Date date);

        List<Meeting> findByDateLessThanOrderByDateDesc(Date date);
    }
