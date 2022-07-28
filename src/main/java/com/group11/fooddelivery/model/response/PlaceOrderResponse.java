package com.group11.fooddelivery.model.response;

import com.group11.fooddelivery.model.PlaceOrderResponseItems;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlaceOrderResponse extends Response {
    private List<PlaceOrderResponseItems> selectedItems;
    private List<String> acceptableMethods;
    private int totalPrice;
}
