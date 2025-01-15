package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Type;

@Type
@Data
@Builder
@Getter
@Setter
public class UserProfile {
    private String firstName;
    private String lastName;
    private String facebookUrl;
    private String youtubeUrl;
}
