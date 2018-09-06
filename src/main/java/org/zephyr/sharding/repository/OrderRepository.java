package org.zephyr.sharding.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.zephyr.sharding.entity.Order;

import java.util.List;

/**
 * Created by zephyr on 2018/9/4.
 */
@Repository
public interface OrderRepository {

    void insert(Order order);

    List<Order> selectFirstPage();

    Order selectById(@Param("orderId") Long orderId);

    void deleteById(@Param("orderId") Long orderId);

    void updateById(@Param("orderId") Long orderId, @Param("newId") Long newId);
}
