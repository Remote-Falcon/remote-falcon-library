package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;
import java.util.List;

@Type
@Data
@Builder
@Getter
@Setter
public class Vote {
    private Sequence sequence;
    private SequenceGroup sequenceGroup;
    private Integer votes;
    private List<String> viewersVoted;
    private LocalDateTime lastVoteTime;
    private Boolean ownerVoted;
}
