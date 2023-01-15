package br.com.jvm.msreportmanagement.application.port.out;

import br.com.jvm.msreportmanagement.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {}
