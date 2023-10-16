package com.example.wantedpreonboardingbackend.UserHistory;

import com.example.wantedpreonboardingbackend.JobPosting.JobPosting;
import com.example.wantedpreonboardingbackend.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserHistory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private JobPosting jobPosting;


}
