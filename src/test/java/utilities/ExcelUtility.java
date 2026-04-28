package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		try (FileInputStream fi = new FileInputStream(xlfile);
		     XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			XSSFSheet ws = wb.getSheet(xlsheet);
			if (ws == null) return 0;
			return ws.getLastRowNum();
		}
	}
	
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		try (FileInputStream fi = new FileInputStream(xlfile);
		     XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			XSSFSheet ws = wb.getSheet(xlsheet);
			if (ws == null) return 0;
			XSSFRow row = ws.getRow(rownum);
			if (row == null) return 0;
			return row.getLastCellNum();
		}
	}
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		try (FileInputStream fi = new FileInputStream(xlfile);
		     XSSFWorkbook wb = new XSSFWorkbook(fi)) {
			XSSFSheet ws = wb.getSheet(xlsheet);
			if (ws == null) return "";
			XSSFRow row = ws.getRow(rownum);
			if (row == null) return "";
			XSSFCell cell = row.getCell(colnum);
			DataFormatter formatter = new DataFormatter();
			return formatter.formatCellValue(cell);
		}
	}

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		try (FileInputStream fi = new FileInputStream(xlfile);
		     XSSFWorkbook wb = new XSSFWorkbook(fi);
		     FileOutputStream fo = new FileOutputStream(xlfile)) {
			XSSFSheet ws = wb.getSheet(xlsheet);
			if (ws == null) {
				ws = wb.createSheet(xlsheet);
			}
			XSSFRow row = ws.getRow(rownum);
			if (row == null) {
				row = ws.createRow(rownum);
			}
			XSSFCell cell = row.getCell(colnum);
			if (cell == null) {
				cell = row.createCell(colnum);
			}
			cell.setCellValue(data);
			wb.write(fo);
		}
	}
	
}
