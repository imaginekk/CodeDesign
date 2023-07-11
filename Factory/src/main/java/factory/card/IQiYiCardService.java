package factory.card;

/**
 * @description 模拟爱奇艺会员卡服务
 * @date 2022/3/12
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
