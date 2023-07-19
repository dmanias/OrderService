package gr.dmanias.OrderService.service;

import gr.dmanias.OrderService.model.OrderRequest;
import gr.dmanias.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
