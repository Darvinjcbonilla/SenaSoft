package com.SenaSoft.senasoft;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class SenasoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenasoftApplication.class, args);
	}
	Ciudadano ciud = new Ciudadano();


		//Exportar a formato pdf
		public SenasoftApplication() throws IOException {
			ciud.setNombres("Darvin Jhoel");
			ciud.setApellidos("Cuta Bonilla");
			ciud.setTipoDoc("C.C");
			ciud.setNumDoc("1127340933");

			PDDocument documentPdf = new PDDocument();
			PDPage page = new PDPage(PDRectangle.A6);
			documentPdf.addPage(page);

			PDPageContentStream style = new PDPageContentStream(documentPdf,page);

			style.beginText();
			style.setFont(PDType1Font.TIMES_BOLD, 20);
			style.newLineAtOffset(30, page.getMediaBox().getHeight() - 52);
			style.showText("Cerificado de Participación");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.HELVETICA, 10);
			style.newLineAtOffset(60, page.getMediaBox().getHeight() - 90);
			style.showText("Por medio del presente, se confirma que: " );
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.TIMES_ITALIC, 20);
			style.newLineAtOffset(100, page.getMediaBox().getHeight() - 130);
			style.showText(ciud.getNombres()+ " ");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.TIMES_ITALIC, 20);
			style.newLineAtOffset(100, page.getMediaBox().getHeight() - 150);
			style.showText(ciud.getApellidos() +".");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.HELVETICA, 10);
			style.newLineAtOffset(75, page.getMediaBox().getHeight() - 190);
			style.showText("Identificado con " + ciud.getTipoDoc() + " " + ciud.getNumDoc());
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.HELVETICA, 10);
			style.newLineAtOffset(68, page.getMediaBox().getHeight() - 210);
			style.showText("Participó en el desarrollo del sondeo");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.TIMES_BOLD, 15);
			style.newLineAtOffset(70, page.getMediaBox().getHeight() - 250);
			style.showText("NOMBRE DEL SONDEO");
			style.endText();

			style.close();
			documentPdf.save("C:\\Users\\ADSI 2364426 -PC10\\IdeaProjects\\SenaSoft\\src\\main\\java\\com\\SenaSoft\\senasoft\\pdf\\certificado.pdf");
		}

		//Exportar a formato Excel

		private static void writeExcel() throws Exception {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet();
			workbook.setSheetName(0, "Hoja excel");

			String[] headers = new String[]{
					"Ciudadanos partícipes",
					"Precio",
					"Enlace"
			};

			CellStyle headerStyle = workbook.createCellStyle();
			Font font = workbook.createFont();
			font.setBold(true);
			headerStyle.setFont(font);

			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			HSSFRow headerRow = sheet.createRow(0);
			for (int i = 0; i < headers.length; ++i) {
				String header = headers[i];
				HSSFCell cell = headerRow.createCell(i);
				cell.setCellStyle(headerStyle);
				cell.setCellValue(header);
			}

			for (int i = 0; i < 5; ++i) {


			}

			HSSFRow dataRow = sheet.createRow(6);
			HSSFCell total = dataRow.createCell(1);
			total.setCellType(CellType.FORMULA);
			total.setCellStyle(style);
			total.setCellFormula(String.format("SUM(B2:B%d)",5));

			FileOutputStream file = new FileOutputStream("data.xls");
			workbook.write(file);
			file.close();
		}





}
