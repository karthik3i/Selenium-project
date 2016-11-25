package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("/home/likewise-open/HTCINDIA/mkarthik/workspace/testproject/testdata/testdata.xls");
		
		FileInputStream fis = new FileInputStream(src);
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wb.getSheetAt(0);
		
	//String	data = sheet1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);
		
		int getrow =sheet1.getLastRowNum();
		
		System.out.println(getrow);
		
		for(int i=0; i < getrow; i=i+1)
		{
			String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1);
			System.out.println(data2);
		}
		
		wb.close();

	}

}
