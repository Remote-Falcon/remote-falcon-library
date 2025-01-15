package com.remotefalcon.library.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;
import java.util.List;

@Type
@Data
@Builder
@Getter
@Setter
public class Stat {
    private List<Jukebox> jukebox;
    private List<Voting> voting;
    private List<VotingWin> votingWin;
    private List<Page> page;

    @Type
    @Data
    @Builder
    @Getter
    @Setter
    public static class Jukebox {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @Getter
    @Setter
    public static class Page {
        private String ip;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @Getter
    @Setter
    public static class Voting {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @Getter
    @Setter
    public static class VotingWin {
        private String name;
        private Integer total;
        private LocalDateTime dateTime;
    }
}
