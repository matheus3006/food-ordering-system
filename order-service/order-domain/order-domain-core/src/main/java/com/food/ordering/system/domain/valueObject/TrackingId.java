package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class TrackingId extends BaseId<UUID>{
    public TrackingId(UUID value) {
        super(value);
    }
}
