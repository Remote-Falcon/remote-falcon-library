package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import org.eclipse.microprofile.graphql.Type;

@Type
@Data
@Builder
public class Request {
    private Sequence sequence;
    private Integer position;
    private String viewerRequested;
    private Boolean ownerRequested;
}
