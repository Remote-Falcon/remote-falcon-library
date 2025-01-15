package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;

@Type
@Data
@Builder
public class PsaSequence {
    private String name;
    private Integer order;
    private LocalDateTime lastPlayed;
}
