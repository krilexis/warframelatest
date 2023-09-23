package com.github.krilexis.warframelatest.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.krilexis.warframelatest.dto.RewardDto;
import com.github.krilexis.warframelatest.model.CountedItem;
import com.github.krilexis.warframelatest.model.Reward;

public class RewardMapper {
    
    public static List<RewardDto> mapToDto(Reward reward) {
        List<RewardDto> rewardDtos = new ArrayList<>();
        // Credits
        if(reward.getCredits() != 0) {
            RewardDto credits = new RewardDto();
            credits.setName("credits");
            credits.setQuantity(reward.getCredits());
            rewardDtos.add(credits);
        }

        // Items
        for(String item: reward.getItems()) {
            RewardDto rewardDto = new RewardDto();
            rewardDto.setName(item);
            rewardDto.setQuantity(1);
            rewardDtos.add(rewardDto);
        }

        // Other currency
        for(CountedItem countedItem: reward.getCountedItems()) {
            RewardDto rewardDto = new RewardDto();
            rewardDto.setName(countedItem.getKey());
            rewardDto.setQuantity(countedItem.getCount());
            rewardDtos.add(rewardDto);
        }

        return rewardDtos;
    }
}
