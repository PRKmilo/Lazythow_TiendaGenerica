package co.edu.unbosque.model;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;


import co.edu.unbosque.model.persistance.VentasFile;

import java.io.*; 


public class crearpdf {

	
	public void createPDF(File pdfNewFile) {
	VentasFile VentasFile=new VentasFile();
		// We create the document and set the file name.        
		// Creamos el documento e indicamos el nombre del fichero.
		try {
			Document document = new Document();
			try {

				PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));

			} catch (FileNotFoundException fileNotFoundException) {
				System.out.println("No such file was found to generate the PDF "
						+ "(No se encontró el fichero para generar el pdf)" + fileNotFoundException);
			}
			document.open();
			Paragraph paragraph2 = new Paragraph("Hola");
			paragraph2.setAlignment(1);
			document.add(paragraph2);
			
		
			Paragraph paragraph3 = new Paragraph("mario jdbvjkadbkfbhaskjfdasbjkasbkhfbakjfbkj");
			document.add(paragraph3);
			
			PdfPTable tabla =new PdfPTable(3);
			tabla.setWidthPercentage(100);
			PdfPCell cliente =new PdfPCell(new Phrase("Clientes "));
			cliente.setBackgroundColor(BaseColor.YELLOW);
			PdfPCell total =new PdfPCell(new Phrase("Total de ventas"));
		    total.setBackgroundColor(BaseColor.YELLOW);
			PdfPCell producto =new PdfPCell(new Phrase("Detalles"));
			producto.setBackgroundColor(BaseColor.YELLOW);
			
			
			
			tabla.addCell(cliente);
			tabla.addCell(total);
			tabla.addCell(producto);
			
			document.add(Chunk.NEWLINE);
	
			for (int x=0;x<VentasFile.leerArchivocliente().size();x++) {
				tabla.addCell(VentasFile.leerArchivocliente().get(x).getNombre());
				tabla.addCell(VentasFile.leerArchivocliente().get(x).getCorreo());
				tabla.addCell(VentasFile.leerArchivocliente().get(x).getDireccion());
				
			}
			document.add(tabla);
			document.add(Chunk.NEWLINE);
			   
			document.close();
 
			
	
			System.out.println("Your PDF file has been generated!(¡Se ha generado tu hoja PDF!");
		} catch (DocumentException documentException) {
			System.out.println("The file not exists (Se ha producido un error al generar un documento): " + documentException);
		}
	}
	
	
}
