package com.imagine.factory.goods;

import com.alibaba.fastjson.JSON;

/**
 * @description 模拟实物商品服务
 * @date 2022/3/12
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
