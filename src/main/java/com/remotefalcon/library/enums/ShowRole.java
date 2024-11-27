package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ShowRole {
    USER("user"),
    ADMIN("admin");

    @SuppressWarnings("unused")
    private final String userRole;
}
