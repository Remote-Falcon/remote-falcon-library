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
public class Page {
    private String name;
    private Boolean active;
    private String html;
}
