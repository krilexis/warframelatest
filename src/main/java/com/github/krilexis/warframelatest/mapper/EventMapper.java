package com.github.krilexis.warframelatest.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.krilexis.warframelatest.dto.EventDto;
import com.github.krilexis.warframelatest.dto.RewardDto;
import com.github.krilexis.warframelatest.model.Event;
import com.github.krilexis.warframelatest.model.InterimStep;
import com.github.krilexis.warframelatest.model.Reward;

public class EventMapper {
    
    public static EventDto mapToDto(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setDescription(event.getDescription());
        eventDto.setExpiry(event.getExpiry());
        eventDto.setNode(event.getNode());
        List<RewardDto> rewardsDto = new ArrayList<>();
        for(InterimStep step : event.getInterimSteps()) {
            List<RewardDto> interimRewards = RewardMapper.mapToDto(step.getReward());
            rewardsDto.addAll(interimRewards);
        }

        for(Reward reward : event.getRewards()) {
            List<RewardDto> rewards = RewardMapper.mapToDto(reward);
            rewardsDto.addAll(rewards);
        }
        eventDto.setRewards(rewardsDto);

        return eventDto;
    }
}
