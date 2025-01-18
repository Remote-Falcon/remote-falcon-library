package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

@Type
@RequiredArgsConstructor
public enum LocationCheckMethod {
    GEO("GEO"),
    CODE("CODE"),
    NONE("NONE");

    @SuppressWarnings("unused")
    private final String locationCheckMethod;
}
