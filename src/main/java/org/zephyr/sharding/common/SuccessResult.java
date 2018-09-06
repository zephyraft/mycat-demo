package org.zephyr.sharding.common;

/**
 * Created by zephyr on 2018/9/5.
 */
public class SuccessResult extends DataResult {
    public SuccessResult() {
        super(200, "成功");
    }

    public SuccessResult(Object object) {
        super(200, "成功", object);
    }
}
