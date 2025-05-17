package com.czachodym.botcshared.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record DiscordGuild(
        String id,
        String name,
        List<DiscordChannel> channels
){}
