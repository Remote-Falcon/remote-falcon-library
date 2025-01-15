package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;

@Type
@Data
@Builder
@Getter
@Setter
public class PsaSequence {
    private String name;
    private Integer order;
    private LocalDateTime lastPlayed;
}
