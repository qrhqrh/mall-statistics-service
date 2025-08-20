package com.mall.statistics.domain.model.orders;

import com.mall.statistics.common.exception.BusinessException;

/**
 * @author qiu
 * @date 2025/8/20
 * @description
 */
public record Address (
        String province,
        String city,
        String district,
        String streetAddress,
        String receiverName,
        String receiverPhone
){
    public Address{
        if(province == null || province.isEmpty()) {
            throw new BusinessException("省份不能为空");
        }
        if(city == null || city.isEmpty()) {
            throw new BusinessException("城市不能为空");
        }
        if(district == null || district.isEmpty()) {
            throw new BusinessException("区域不能为空");
        }
        if(streetAddress == null || streetAddress.isEmpty()) {
            throw new BusinessException("街道地址不能为空");
        }
        if(receiverName == null || receiverName.isEmpty()) {
            throw new BusinessException("收货人姓名不能为空");
        }
        if(receiverPhone == null || receiverPhone.isEmpty()) {
            throw new BusinessException("收货人手机号不能为空");
        }
    }

    /**
     * 创建一个新的收货地址
     * @param province
     * @param city
     * @param district
     * @param streetAddress
     * @param receiverName
     * @param receiverPhone
     * @return
     */
    public Address newAddress(String province, String city, String district, String streetAddress, String receiverName, String receiverPhone) {
        return new Address(province, city, district, streetAddress, receiverName, receiverPhone);
    }
}
