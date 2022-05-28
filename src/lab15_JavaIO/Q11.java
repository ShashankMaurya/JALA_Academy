package lab15_JavaIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q11 {
    public static void main(String[] args) throws Exception
    {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Student Data");
        XSSFRow row;
        Map<String, Object[]> sdata=new TreeMap<String,Object[]>();
        sdata.put("1", new Object[] {"Roll", "Name", "Year"});
        sdata.put("2", new Object[] {"1928259", "Sharon", "2nd"});
        sdata.put("3", new Object[] {"1928260", "Steve", "4th"});
        sdata.put("4", new Object[] {"1928267", "Bruce", "3rd"});
        sdata.put("5", new Object[] {"1928012", "Reed", "4th"});
        sdata.put("6", new Object[] {"1928013", "Charles", "6th"});

        Set<String> keyid=sdata.keySet();
        int rowid=0;

        for(String key: keyid)
        {
            row=spreadsheet.createRow(rowid++);
            Object[] obj=sdata.get(key);
            int cellid=0;

            for(Object o: obj)
            {
                Cell cell=row.createCell(cellid++);
                cell.setCellValue((String) o);
            }
        }
        try {
            File f = new File("src\\lab15_JavaIO\\files\\student_data.xlsx");
            FileOutputStream fos = new FileOutputStream(f);
            workbook.write(fos);
            System.out.println("Data written in file successfully");
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
