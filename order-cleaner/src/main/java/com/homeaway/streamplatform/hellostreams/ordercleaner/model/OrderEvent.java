package com.homeaway.streamplatform.hellostreams.ordercleaner.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class OrderEvent extends CommandEvent {
    private String orderId;
}
