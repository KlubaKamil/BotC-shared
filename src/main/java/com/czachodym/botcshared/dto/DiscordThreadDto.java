package com.czachodym.botcshared.dto;

import lombok.Builder;

@Builder(toBuilder = true)
public record DiscordThreadDto(
        String discordThreadId,
        String name,
        boolean allowed
){}
