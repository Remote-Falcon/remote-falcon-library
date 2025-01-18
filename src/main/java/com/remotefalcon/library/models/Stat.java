package com.remotefalcon.library.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.graphql.Type;

import java.time.LocalDateTime;
import java.util.List;

@Type
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stat {
    private List<JukeboxStat> jukeboxStat;
    private List<VotingStat> votingStat;
    private List<VotingWinStat> votingWinStat;
    private List<PageStat> pageStat;

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JukeboxStat {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PageStat {
        private String ip;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VotingStat {
        private String name;
        private LocalDateTime dateTime;
    }

    @Type
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VotingWinStat {
        private String name;
        private Integer total;
        private LocalDateTime dateTime;
    }
}
