package com.core.linkup.club.clubnotice.request;

import com.core.linkup.club.clubnotice.entity.enums.NotificationType;
import lombok.Builder;

@Builder
public record ClubNoticeRequest(
        String title,
        String content,
        NotificationType type

) {
}
