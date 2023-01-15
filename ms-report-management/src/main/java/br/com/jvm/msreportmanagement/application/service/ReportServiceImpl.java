package br.com.jvm.msreportmanagement.application.service;

import br.com.jvm.msreportmanagement.application.port.in.ReportService;
import br.com.jvm.msreportmanagement.application.port.out.ReportRepository;
import br.com.jvm.msreportmanagement.domain.Report;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    @Override
    public void addOrder(Report order) {
        reportRepository.save(order);
    }

    @Override
    public List<Report> getOrderList() {
        return reportRepository.findAll();
    }
}
