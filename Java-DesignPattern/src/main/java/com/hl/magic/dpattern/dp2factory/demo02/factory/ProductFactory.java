package com.hl.magic.dpattern.dp2factory.demo02.factory;

import com.hl.magic.dpattern.dp2factory.demo02.IProduct;
import com.hl.magic.dpattern.dp2factory.demo02.entity.Product1;

/**
 * 产品制造工厂
 *
 * @author hl
 * @date 2021/3/26 15:26
 */
public class ProductFactory {

    public static IProduct createProduct(String productNo) {
        switch (productNo) {
            case "1":
                return new Product1();
            case "2":
                return new Product1();
            default:

        }


        return null;
    }
}
