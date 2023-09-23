package com.github.krilexis.warframelatest.model;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
    String id;
    String description;
    String affiliatedWith;
    LocalDateTime expiry;
    boolean active;
    String faction;
    String node;
    List<InterimStep> interimSteps;
    List<Reward> rewards;
    String tooltip;

    public Event() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getAffiliatedWith() {
        return affiliatedWith;
    }

    public void setAffiliatedWith(String affiliatedWith) {
        this.affiliatedWith = affiliatedWith;
    }

    public List<InterimStep> getInterimSteps() {
        return interimSteps;
    }

    public void setInterimSteps(List<InterimStep> interimSteps) {
        this.interimSteps = interimSteps;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
