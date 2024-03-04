package com.example.MeetingManagement2.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter


@Table(name="Meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject")
    private String subject;
    @Column(name="start time")
    private String startTime;
    @Column(name="end time")
    private String endTime;
    @Column(name="meeting link")
    private String meetingLink;
    @Column(name="department")
    private String department;
    @Column(name="description")
    private String description;
    @Column(name="date")
    private Date date;

    // Getters and setter
}

