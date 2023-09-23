package com.github.krilexis.warframelatest.dto;

import java.time.LocalDateTime;
import java.util.List;

public class EventDto {
    private String description;
    private LocalDateTime expiry;
    private String node;
    private List<RewardDto> rewards;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getExpiry() {
        return expiry;
    }
    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
    public String getNode() {
        return node;
    }
    public void setNode(String node) {
        this.node = node;
    }
    public List<RewardDto> getRewards() {
        return rewards;
    }
    public void setRewards(List<RewardDto> rewards) {
        this.rewards = rewards;
    }
}
