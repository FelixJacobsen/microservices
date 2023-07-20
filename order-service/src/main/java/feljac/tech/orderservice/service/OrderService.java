package feljac.tech.orderservice.service;

import feljac.tech.orderservice.dto.OrderItemsDto;
import feljac.tech.orderservice.dto.OrderRequest;
import feljac.tech.orderservice.model.Order;
import feljac.tech.orderservice.model.OrderedItems;
import feljac.tech.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void createOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderedItems> orderedItems = orderRequest.getOrderItemsDtoList()
                .stream()
                .map(this::mapToDto).toList();

        order.setOrderedItemsList(orderedItems);
    }

    private OrderedItems mapToDto(OrderItemsDto orderItemsDto) {
        OrderedItems orderedItems = new OrderedItems();
        orderedItems.setPrice(orderedItems.getPrice());
        orderedItems.setId(orderedItems.getId());
        orderedItems.setSkuCode(orderedItems.getSkuCode());
        return orderedItems;
    }
}
