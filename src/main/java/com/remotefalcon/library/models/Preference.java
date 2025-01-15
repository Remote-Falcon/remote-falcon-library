package com.remotefalcon.library.models;

import com.remotefalcon.library.enums.LocationCheckMethod;
import com.remotefalcon.library.enums.ViewerControlMode;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Type;

import java.util.Set;

@Type
@Data
@Builder
@Getter
@Setter
public class Preference {
    private Boolean viewerControlEnabled;
    private ViewerControlMode viewerControlMode;
    private Boolean resetVotes;
    private Integer jukeboxDepth;
    private LocationCheckMethod locationCheckMethod;
    private Float showLatitude;
    private Float showLongitude;
    private Float allowedRadius;
    private Boolean checkIfVoted;
    private Boolean checkIfRequested;
    private Boolean psaEnabled;
    private Integer psaFrequency;
    private Integer jukeboxRequestLimit;
    private Integer locationCode;
    private Integer hideSequenceCount;
    private Boolean makeItSnow;
    private Boolean managePsa;
    private Integer sequencesPlayed;
    private String pageTitle;
    private String pageIconUrl;
    private Boolean showOnMap;
    private String selfHostedRedirectUrl;
    private Set<String> blockedViewerIps;
}
