package com.remotefalcon.library.documents;

import com.remotefalcon.library.enums.NotificationType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document
public class Notification {
    @Id
    private String id;
    private String uuid;
    private LocalDateTime createdDate;
    private NotificationType type;
    private String preview;
    private String subject;
    private String message;
}
