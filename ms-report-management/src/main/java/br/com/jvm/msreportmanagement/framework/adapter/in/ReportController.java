package br.com.jvm.msreportmanagement.framework.adapter;

import br.com.jvm.msreportmanagement.application.port.in.ReportService;
import com.lowagie.text.DocumentException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Slf4j
@Tag(name = "Report")
@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:8889")
public class ReportController {

    private final ReportService service;

    @GetMapping("/export-to-pdf")
    private void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
    }

}
