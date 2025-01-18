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
public class ApiAccess {
    private Boolean apiAccessActive;
    private String apiAccessToken;
    private String apiAccessSecret;
}
