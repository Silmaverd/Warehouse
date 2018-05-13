package com.blinenterprise.SyropKlonowy.view;

import com.blinenterprise.SyropKlonowy.domain.AmountOfProduct;
import com.blinenterprise.SyropKlonowy.domain.SaleOrder.SaleOrder;
import com.blinenterprise.SyropKlonowy.domain.SaleOrder.SaleOrderStatus;
import com.blinenterprise.SyropKlonowy.web.View;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
public class SaleOrderView implements View {

    private Long id;
    private Long clientId;
    private Date dateOfOrder;
    List<AmountOfProduct> amountsOfProducts;
    private BigDecimal totalPrice;
    private SaleOrderStatus saleOrderStatus;

    private SaleOrderView(Long id, Long clientId, Date dateOfOrder, List<AmountOfProduct> amountsOfProducts, BigDecimal totalPrice, SaleOrderStatus saleOrderStatus) {
        this.id = id;
        this.clientId = clientId;
        this.dateOfOrder = dateOfOrder;
        this.amountsOfProducts = amountsOfProducts;
        this.totalPrice = totalPrice;
        this.saleOrderStatus = saleOrderStatus;
    }

    public static SaleOrderView from(SaleOrder saleOrder) {
        return new SaleOrderView(
                saleOrder.getId(),
                saleOrder.getClientId(),
                saleOrder.getDateOfOrder(),
                saleOrder.getAmountsOfProducts(),
                saleOrder.getTotalPrice(),
                saleOrder.getSaleOrderStatus());
    }
}