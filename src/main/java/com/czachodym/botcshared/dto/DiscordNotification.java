package com.czachodym.botcshared.dto;

import lombok.Builder;

import java.util.List;

@Builder(toBuilder = true)
public record DiscordNotification(
        Long id,
        NotificationType notificationType,
        NotificationMode notificationMode,
        List<DiscordNotifiedChannel> channelsToNotify,
        String message)
{}
