package com.remotefalcon.library.quarkus.entity;

import com.remotefalcon.library.enums.ShowRole;
import com.remotefalcon.library.models.*;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;
import org.springframework.data.annotation.Transient;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@MongoEntity(collection = "show")
public class ShowEntity {
    private String showToken;
    private String email;
    private String password;
    private String showName;
    private String showSubdomain;
    private Boolean emailVerified;
    private LocalDateTime createdDate;
    private LocalDateTime lastLoginDate;
    private LocalDateTime expireDate;
    private String pluginVersion;
    private String fppVersion;
    private String lastLoginIp;
    private ShowRole showRole;
    private String passwordResetLink;
    private LocalDateTime passwordResetExpiry;

    private ApiAccess apiAccess;
    private UserProfile userProfile;
    private Preference preferences;
    private List<Sequence> sequences;
    private List<SequenceGroup> sequenceGroups;
    private List<PsaSequence> psaSequences;
    private List<Page> pages;
    private Stat stats;
    private List<Request> requests;
    private List<Vote> votes;
    private List<ActiveViewer> activeViewers;
    private String playingNow;
    private String playingNext;
    private String playingNextFromSchedule;
    private Sequence playingNowSequence;
    private Sequence playingNextSequence;

    @Transient
    private String serviceToken;
}
