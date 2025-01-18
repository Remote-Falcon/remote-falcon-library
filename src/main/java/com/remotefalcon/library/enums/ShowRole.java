package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

@Type
@RequiredArgsConstructor
public enum ShowRole {
    USER("user"),
    ADMIN("admin");

    @SuppressWarnings("unused")
    private final String userRole;
}
