package br.com.jvm.msreportmanagement.framework.helper;

import br.com.jvm.msreportmanagement.domain.Report;
import com.lowagie.text.*;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class PDFGenerator {

    public void generate(List<Report> reportList, HttpServletResponse response) throws DocumentException, IOException {

        // cria o objeto do documento
        var document = new Document(PageSize.A4);

        // Instancia o PdfWriter
        PdfWriter.getInstance(document, response.getOutputStream());

        // abre o documento criado para alerar
        document.open();

        // Criando a fonte do Título
        // Definir o estilo e o tamanho
        Font fontTitle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTitle.setSize(20);

        // Cria parágrafo
        var paragraph = new Paragraph("List of the Orders", fontTitle);
        // Alinhando o parágrafo no documento
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        // Adicionando o parágrafo criado no documento
        document.add(paragraph);

        // Criando uma tabela das 3 colunas
        var table = new PdfPTable(3);

        // Configurando a largura da tabela, suas colunas e espaçamento
        table.setWidthPercentage(100f);
        table.setWidths(new int[]{3, 3, 3, 3});
        table.setSpacingBefore(5);

        // Criar células de tabela para o cabeçalho da tabela
        var cell = new PdfPCell();
        // Definindo a cor de fundo e o preenchimento da célula da tabela
        cell.setBackgroundColor(CMYKColor.BLUE);
        cell.setPadding(5);

        // cria fonte
        // Definir estilo e tamanho da fonte
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font.setColor(CMYKColor.WHITE);

        // Adicionando cabeçalhos na célula ou cabeçalho da tabela criada
        // Adicionando célula à tabela
        cell.setPhrase(new Phrase("ID", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Value", font));
        table.addCell(cell);

        // Iterando a lista de pedidos
        // adicionar atributos
        for (Report report : reportList) {
            table.addCell(String.valueOf(report.getId()));
            table.addCell(String.valueOf(report.getValue()));
        }

        // Adicionando a tabela criada ao documento
        document.add(table);

        // Fechar documento
        document.close();

    }

}
