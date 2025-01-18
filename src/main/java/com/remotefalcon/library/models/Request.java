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
public class Request {
    private Sequence sequence;
    private Integer position;
    private String viewerRequested;
    private Boolean ownerRequested;
}
