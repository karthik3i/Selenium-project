/**
 * 
 */
package lip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author mkarthik
 *
 */
public class GetExcelConfig 
{
	HSSFWorkbook wb;
	HSSFSheet sheet1;
		
	//String path =System.getProperty("user.dir");
	File src = new File("./testdata/testdata.xls");
	
	public GetExcelConfig()
	{
		try {
			
			FileInputStream fis = new FileInputStream(src);
			 wb = new HSSFWorkbook(fis);
		     } catch (Exception e) 
		     {
		   System.out.println(e.getMessage());
		     }		
		
	 }
	
	
   public String getData(int sheetName, int row, int column){
	
	 sheet1 = wb.getSheetAt(sheetName);
	 
	 String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
	 return data;
}
   
   public int getRowCount(int sheetIndex){
	  int sheet1=wb.getSheetAt(sheetIndex).getLastRowNum();
	  return sheet1;
   }
   
   public String testingStatus(int SheetIndex, int row, int column, String status){
	   
	   sheet1 = wb.getSheetAt(SheetIndex);
	   sheet1.getRow(row).createCell(column).setCellValue(status);
	   
	   try {
		FileOutputStream writeExcel = new FileOutputStream(src);
		wb.write(writeExcel);
	       } catch (Exception e) {
		// TODO Auto-generated catch block
		     System.out.println(e.getMessage());
	      }
	   
	   return null;
   }
   

}


