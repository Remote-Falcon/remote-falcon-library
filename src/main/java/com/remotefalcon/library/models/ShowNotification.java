package com.remotefalcon.library.models;

import com.remotefalcon.library.documents.Notification;
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
public class ShowNotification {
    private Notification notification;
    private Boolean read;
    private Boolean deleted;
}
