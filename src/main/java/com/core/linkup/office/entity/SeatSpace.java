package com.core.linkup.office.entity;

import com.core.linkup.common.entity.BaseEntity;
import com.core.linkup.office.entity.enums.SeatSpaceType;
import com.core.linkup.reservation.reservation.entity.Reservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "seat_space")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SeatSpace extends BaseEntity {

//    @ManyToOne
//    @JoinColumn(name = "office_building_id", nullable = false)
    private Long officeBuildingId;

    @Enumerated(EnumType.STRING)
    private SeatSpaceType type;
    private String code;

//    public String getLocation() {
//        return officeBuilding != null ? officeBuilding.getLocation() : null;
//    }
}
