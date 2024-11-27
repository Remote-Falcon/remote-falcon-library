package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LocationCheckMethod {
    GEO("GEO"),
    CODE("CODE"),
    NONE("NONE");

    @SuppressWarnings("unused")
    private final String locationCheckMethod;
}
