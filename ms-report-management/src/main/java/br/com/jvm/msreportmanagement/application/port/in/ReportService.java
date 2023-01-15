package br.com.jvm.msreportmanagement.application.port.in;

import br.com.jvm.msreportmanagement.domain.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    List<Order> getOrderList();

}
