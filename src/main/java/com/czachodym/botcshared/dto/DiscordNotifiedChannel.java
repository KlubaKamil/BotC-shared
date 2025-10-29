package com.czachodym.botcshared.dto;

import lombok.Builder;
import net.dv8tion.jda.api.entities.channel.ChannelType;

@Builder
public record DiscordNotifiedChannel(
        String id,
        ChannelType channelType)
{}
