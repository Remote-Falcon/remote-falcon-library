package com.remotefalcon.library.quarkus.entity;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

@Data
@Builder
@Type
@Description("Top level Show details")
@MongoEntity(collection = "show")
@NoArgsConstructor
@AllArgsConstructor
public class Wattson {
    private String responseId;
    private String showSubdomain;
    private String feedback;
}
