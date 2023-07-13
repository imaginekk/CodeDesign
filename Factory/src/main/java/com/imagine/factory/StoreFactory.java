package com.imagine.factory;

import com.imagine.factory.service.ICommodity;
import com.imagine.factory.service.serviceImpl.CardCommodityService;
import com.imagine.factory.service.serviceImpl.CouponCommodityService;
import com.imagine.factory.service.serviceImpl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }

}