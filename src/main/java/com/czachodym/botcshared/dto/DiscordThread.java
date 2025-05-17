package com.czachodym.botcshared.dto;

import lombok.Builder;
import net.dv8tion.jda.api.entities.channel.ChannelType;

@Builder
public record DiscordThread (
        String id,
        String name,
        ChannelType channelType
){}
