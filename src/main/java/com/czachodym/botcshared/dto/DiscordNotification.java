package com.czachodym.botcshared.dto;

import lombok.Builder;
import org.springframework.core.io.Resource;

import java.util.List;

@Builder(toBuilder = true)
public record DiscordNotification(
        Long id,
        NotificationType notificationType,
        NotificationMode notificationMode,
        DiscordRootDto discordRootDto,
        List<String> channelsToNotify,
        String message)
{}
