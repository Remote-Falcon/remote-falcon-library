package com.remotefalcon.library.quarkus.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.remotefalcon.library.enums.ShowRole;
import com.remotefalcon.library.models.*;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Ignore;
import org.eclipse.microprofile.graphql.Type;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Type
@MongoEntity(collection = "show")
@Data
@Builder
public class Show {
    private String showToken;
    private String email;
    @Ignore
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

    @Ignore
    private String serviceToken;
}
