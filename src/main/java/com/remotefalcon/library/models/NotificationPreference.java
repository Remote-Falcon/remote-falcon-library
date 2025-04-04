package com.remotefalcon.library.models;

import org.eclipse.microprofile.graphql.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationPreference {
    private Boolean enableFppHeartbeat;
    private Boolean fppHeartbeatIfControlEnabled;
    private Integer fppHeartbeatRenotifyAfterMinutes;
}
