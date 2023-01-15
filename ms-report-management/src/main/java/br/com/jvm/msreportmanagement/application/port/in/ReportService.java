package br.com.jvm.msreportmanagement.application.port.in;

import br.com.jvm.msreportmanagement.domain.Report;
import java.util.List;

public interface ReportService {
    void addOrder(Report order);

    List<Report> getOrderList();
}
