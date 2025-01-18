package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueObject.OrderId;

public class Order extends AggregateRoot<OrderId> {
    private final CustumerId custumerId;

}
