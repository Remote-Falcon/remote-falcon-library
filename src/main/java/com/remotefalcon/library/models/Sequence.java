package com.remotefalcon.library.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sequence {
    private String name;
    private String displayName;
    private Integer duration;
    private Boolean visible;
    private Integer index;
    private Integer order;
    private String imageUrl;
    private Boolean active;
    private Integer visibilityCount;
    private String type;
    private String group;
    private String category;
    private String artist;
}
