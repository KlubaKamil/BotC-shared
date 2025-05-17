package com.czachodym.botcshared.dto;

import lombok.Builder;
import net.dv8tion.jda.api.entities.channel.ChannelType;

import java.util.List;

@Builder
public record DiscordChannel(
        String id,
        String name,
        ChannelType channelType,
        List<DiscordThread> threads
){}
