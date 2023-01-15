package br.com.jvm.msreportmanagement.application.service;

import br.com.jvm.msreportmanagement.application.port.out.ReportRepository;
import br.com.jvm.msreportmanagement.application.port.in.OrderService;
import br.com.jvm.msreportmanagement.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ReportRepository reportRepository;

    @Override
    public void addOrder(Order order) {
        reportRepository.save(order);
    }

    @Override
    public List<Order> getOrderList() {
        return reportRepository.findAll();
    }
}
