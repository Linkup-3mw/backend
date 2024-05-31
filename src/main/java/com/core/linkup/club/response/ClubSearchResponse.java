package com.core.linkup.club.response;

import lombok.Builder;

@Builder
public record ClubSearchResponse(
        Long id,
        Long memberId,
        String memberName,
        String profileImage,
        String title,
        String introduction,
        String clubType,
        Integer recruitCount

        // clubmemeber,
        // clubmeeting
) {
}
