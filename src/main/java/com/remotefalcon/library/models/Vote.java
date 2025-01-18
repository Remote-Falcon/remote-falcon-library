package com.remotefalcon.library.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;
import java.util.List;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vote {
    private Sequence sequence;
    private SequenceGroup sequenceGroup;
    private Integer votes;
    private List<String> viewersVoted;
    private LocalDateTime lastVoteTime;
    private Boolean ownerVoted;
}
