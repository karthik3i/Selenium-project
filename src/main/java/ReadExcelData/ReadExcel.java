package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		File src = new File("/home/likewise-open/HTCINDIA/mkarthik/workspace/testproject/testdata/testdata.xls");
		
		FileInputStream fis=new FileInputStream(src);
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		
	String	data0 = sheet.getRow(0).getCell(1).getStringCellValue();
	 
	System.out.println(data0);
	wb.close();
}

}
