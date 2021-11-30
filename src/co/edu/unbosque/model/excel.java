package co.edu.unbosque.model;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;   
import org.apache.poi.ss.usermodel.Workbook;   
import co.edu.unbosque.model.persistance.VentasFile;
import co.edu.unbosque.model.VentasDAO;
import co.edu.unbosque.model.ClienteDAO;
public class excel {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		VentasFile archivo = new VentasFile();
		try   
		{ 
		//creating an instance of Workbook class    
		//creates an excel file at the specified location  
		String filename = ("./Data/ExcelProyecto.xlsx");   
		//creating an instance of HSSFWorkbook class  
		HSSFWorkbook workbook = new HSSFWorkbook();  
		//invoking creatSheet() method and passing the name of the sheet to be created   
		HSSFSheet sheet = workbook.createSheet("hoja 1");
		
		for (int i =0; i< archivo.leerArchivocliente().size();i++) {
			
			String indice = String.valueOf(i);
			HSSFRow rowhead = sheet.createRow((short)0);
		}
		//creating the 0th row using the createRow() method  
		 
		
		HSSFRow rowhead = sheet.createRow((short)0);  
		//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
		rowhead.createCell(0).setCellValue("prueba");  
		rowhead.createCell(1).setCellValue("nobres");  
		rowhead.createCell(2).setCellValue("Account Number");  
		rowhead.createCell(3).setCellValue("e-mail");  
		rowhead.createCell(4).setCellValue("Balance");  
		//creating the 1st row
		
	
		HSSFRow row = sheet.createRow((short)1);  
		//inserting data in the first row  
		row.createCell(0).setCellValue("1");  
		row.createCell(1).setCellValue("John William");  
		row.createCell(2).setCellValue("9999999");  
		row.createCell(3).setCellValue("william.john@gmail.com");  
		row.createCell(4).setCellValue("700000.00");  
		//creating the 2nd row  
		HSSFRow row1 = sheet.createRow((short)2);  
		//inserting data in the second row  
		row1.createCell(0).setCellValue("2");  
		row1.createCell(1).setCellValue("Mathew Parker");  
		row1.createCell(2).setCellValue("22222222");  
		row1.createCell(3).setCellValue("parker.mathew@gmail.com");  
		row1.createCell(4).setCellValue("200000.00");  
		FileOutputStream fileOut = new FileOutputStream(filename);  
		workbook.write(fileOut);  
		//closing the Stream  
		fileOut.close();  
		//closing the workbook  
		workbook.close();  
		//prints the message on the console  
		System.out.println("Excel file has been generated successfully.");  
		}   
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  
		}     
	}
	
