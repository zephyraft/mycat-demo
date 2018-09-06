package org.zephyr.sharding.repository;

import org.springframework.stereotype.Repository;
import org.zephyr.sharding.entity.Order;
import org.zephyr.sharding.entity.OrderItem;

import java.util.List;

/**
 * Created by zephyr on 2018/9/4.
 */
@Repository
public interface OrderItemRepository {

    Long insert(OrderItem model);

    void delete(Long orderItemId);

    List<Order> selectAll();
}
