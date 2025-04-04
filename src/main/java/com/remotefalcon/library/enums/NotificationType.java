package com.remotefalcon.library.enums;

import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

@Type
@RequiredArgsConstructor
public enum NotificationType {
    ADMIN("ADMIN"),
    USER("USER"),
    FPP_HEALTH("FPP_HEALTH");

    @SuppressWarnings("unused")
    private final String notificationType;
}
