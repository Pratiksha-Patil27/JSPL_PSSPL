package com.jspl.utilities;



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class ExcelDataUtil {
	
	@DataProvider(name="hashDataProvider")
	public static Object[][] getTestData(MyXLSReader xls_received, String testName, String sheetName) throws Exception{
		
		MyXLSReader xls = xls_received;
	
		String testCaseName = testName;
		
		String testDataSheet = sheetName;
		
		int testStartRowNumber=1;		
		
		while(!(xls.getCellData(testDataSheet, 1, testStartRowNumber).equals(testCaseName))){
			
			testStartRowNumber++;
			
		}
		
		int columnStartRowNumber = testStartRowNumber+1;
		int dataStartRowNumber = testStartRowNumber+2;
		
		int rows=0;
		while(!(xls.getCellData(testDataSheet, 1, dataStartRowNumber+rows).equals(""))){
			
			rows++;
			
		}
		
		//Total number of columns in the required test
		int columns=1;
		
		while(!(xls.getCellData(testDataSheet, columns, columnStartRowNumber).equals(""))){
			
			columns++;
			
		}
		
		Object[][] obj = new Object[rows][1];
		
		HashMap<String,String> map = null;
		
		//Reading the data in the test
		for(int i=0,row=dataStartRowNumber;row<dataStartRowNumber+rows;row++,i++){
			
			map = new HashMap<String,String>();
			
			for(int j=0,column=1;column<columns;column++,j++){
				
				String key=xls.getCellData(testDataSheet, column, columnStartRowNumber);
				
				String value=xls.getCellData(testDataSheet, column, row);
				
				map.put(key,value);
				
			}
			
			obj[i][0]=map;
		
		}	
		
		return obj;
	
	}
	
	public static boolean isRunnable(MyXLSReader xls_received, String tName, String sheet){
		
		String sheetName = sheet;

		MyXLSReader xls = xls_received;
		
		int rows = xls.getRowCount(sheetName);
		
		for(int r=2;r<=rows;r++){
			
			String testName = xls.getCellData(sheetName, 1, r);
			
			if(testName.equals(tName)){
				
				String runmode = xls.getCellData(sheetName, "Runmode", r);
				
				if(runmode.equals("Y"))					
					return true;
				else
					return false;
				
			}
			
		}
		
		return false;
		
	}
	
	 public static void writeDataInExcel(List<String[]> data, String filePath,String sheetName) throws IOException {
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet;
	        File file = new File(filePath);
	        if (file.exists() && file.length() > 0) {
	            // If the file already exists, open it
	            workbook = new XSSFWorkbook(new FileInputStream(file));
	            sheet = workbook.getSheetAt(0);
	        } else {
	            // Otherwise, create a new workbook and sheet
	            workbook = new XSSFWorkbook();
	            sheet = workbook.createSheet(sheetName);
	        }
	         

	        // Create header style
	        XSSFCellStyle styleTopRow = workbook.createCellStyle();
	        XSSFFont font = workbook.createFont();
	        font.setBold(true);
	        font.setColor(IndexedColors.WHITE.getIndex());
	        styleTopRow.setFont(font);
	        styleTopRow.setFillForegroundColor(IndexedColors.BLUE.getIndex());
	        styleTopRow.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	        styleTopRow.setBorderLeft(BorderStyle.THIN);
	        styleTopRow.setBorderRight(BorderStyle.THIN);
	        styleTopRow.setBorderTop(BorderStyle.THIN);
	        styleTopRow.setBorderBottom(BorderStyle.THIN);

	        // Create row style
	        XSSFCellStyle styleRow = workbook.createCellStyle();
	        styleRow.setBorderLeft(BorderStyle.THIN);
	        styleRow.setBorderRight(BorderStyle.THIN);
	        styleRow.setBorderTop(BorderStyle.THIN);
	        styleRow.setBorderBottom(BorderStyle.THIN);

	        // Write data to sheet
	        for (int r = 0; r < data.size(); r++) {
	            XSSFRow row = sheet.createRow(r);
	            String[] rowData = data.get(r);

	            for (int c = 0; c < rowData.length; c++) {
	                XSSFCell cell = row.createCell(c);
	                cell.setCellValue(rowData[c]);

	                if (r == 0) {
	                    cell.setCellStyle(styleTopRow);
	                } else {
	                    cell.setCellStyle(styleRow);
	                }
	            }
	        }

	        // file = new File(filePath);
	        try (FileOutputStream fos = new FileOutputStream(file)) {
	            workbook.write(fos);
	        }
	        workbook.close();
	    }

	
}