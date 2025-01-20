package com.remotefalcon.library.models;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Type;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stat {
    private List<Jukebox> jukebox;
    private List<Voting> voting;
    private List<VotingWin> votingWin;
    private List<Page> page;

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Jukebox {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Page {
        private String ip;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Voting {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VotingWin {
        private String name;
        private Integer total;
        private LocalDateTime dateTime;
    }
}
