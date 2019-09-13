package utils;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DB_Test2 {
@BeforeClass
public static void setup(){
    DBUtility.establishConnection(DBType.ORACLE);

}

    @Test
    public void test1(){


// CHECK the index of row 2 is Asia in the region table
       List<Map<String, Object>> listM=DBUtility.runSQLQuery("SELECT * FROM REGIONS");
        Assert.assertEquals("Asia",listM.get(2).get("REGION_NAME"));
        for (Map<String, Object>Mp:listM) {
            System.out.println(Mp.get("REGION_NAME"));

        }
    }
    @AfterClass
    public static void teardow(){
   DBUtility.closeConnections();
    }
}
