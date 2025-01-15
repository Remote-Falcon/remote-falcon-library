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
public class ApiAccess {
    private Boolean apiAccessActive;
    private String apiAccessToken;
    private String apiAccessSecret;
}
