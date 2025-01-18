package com.remotefalcon.library.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PsaSequence {
    private String name;
    private Integer order;
    private LocalDateTime lastPlayed;
}
