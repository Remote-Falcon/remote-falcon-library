package com.remotefalcon.library.quarkus.entity;

import com.remotefalcon.library.enums.NotificationType;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@Type
@Description("Top level Notification details")
@MongoEntity(collection = "notification")
@NoArgsConstructor
@AllArgsConstructor
public class Notification extends PanacheMongoEntity {
    private String uuid;
    private LocalDateTime createdDate;
    private NotificationType type;
    private String preview;
    private String subject;
    private String message;
}
