package com.czachodym.botcshared.dto;

import lombok.Builder;

import java.util.List;

@Builder(toBuilder = true)
public record DiscordRootDto(
        List<DiscordGuildDto> servers
){}
