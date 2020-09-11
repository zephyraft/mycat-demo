package org.zephyr.sharding.entity;

/**
 * Created by zephyr on 2018/9/4.
 */
public class OrderItem {

    private long orderItemId;

    private long orderId;

    private int userId;

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
