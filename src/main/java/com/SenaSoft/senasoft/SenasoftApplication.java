package com.SenaSoft.senasoft;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class SenasoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenasoftApplication.class, args);
	}
		//Exportar a formato pdf
		public SenasoftApplication() throws IOException {
			PDDocument documentPdf = new PDDocument();
			PDPage page = new PDPage(PDRectangle.A6);
			documentPdf.addPage(page);

			PDPageContentStream style = new PDPageContentStream(documentPdf,page);

			style.beginText();
			style.setFont(PDType1Font.TIMES_BOLD, 20);
			style.newLineAtOffset(50, page.getMediaBox().getHeight() - 52);
			style.showText("Hello World!");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.HELVETICA, 12);
			style.newLineAtOffset(30, page.getMediaBox().getHeight() - 70);
			style.showText("bvufhvndkfv sdjnskjndvksjndvs dvksjdnvjksd.");
			style.endText();

			style.beginText();
			style.setFont(PDType1Font.HELVETICA, 12);
			style.newLineAtOffset(30, page.getMediaBox().getHeight() - 80);
			style.showText("dvnvnsnrngwe gsegjnsdv sdbsdb sdbsdbsd bbs.");
			style.endText();

			style.close();
			documentPdf.save("C:\\Users\\ADSI 2364426 -PC10\\IdeaProjects\\SenaSoft\\src\\main\\java\\com\\SenaSoft\\senasoft\\pdf\\certificado.pdf");
		}





}
