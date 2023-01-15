package br.com.jvm.msreportmanagement.framework.helper;

import br.com.jvm.msreportmanagement.domain.Report;
import com.lowagie.text.DocumentException;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PDFGenerate {

    public void generate(List<Report> reportList, HttpServletResponse response) throws DocumentException, IOException {}
}
