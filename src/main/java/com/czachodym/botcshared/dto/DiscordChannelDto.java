package com.czachodym.botcshared.dto;

import lombok.Builder;
import net.dv8tion.jda.api.entities.channel.ChannelType;

import java.util.List;

@Builder(toBuilder = true)
public record DiscordChannelDto(
        String discordChannelId,
        String name,
        ChannelType channelType,
        boolean allowed,
        List<DiscordThreadDto> threads
){}
