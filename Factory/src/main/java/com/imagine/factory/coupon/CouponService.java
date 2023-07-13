package com.imagine.factory.coupon;

/**
 * @description 模拟优惠券服务
 * @date 2022/3/12
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
