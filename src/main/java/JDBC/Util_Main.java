package JDBC;

import utils.DBType;
import utils.DBUtility;

import java.util.List;
import java.util.Map;

public class Util_Main {

    public static void main(String[] args) {

        DBUtility.establishConnection(DBType.ORACLE);

        System.out.println(DBUtility.getRowsCount("select * from employees"));

        List<Map<String, Object>> rsLst = DBUtility.runSQLQuery("select * from employees");

        // PRINT OUT ALL THE EMPLOYEE NAME AND SALARY , JUST BY PASSING "select * from employees"
        // TO THE UTILITY
        // NAME IS  BLA BLA , SALARY IS 6 DIGIT

<<<<<<< HEAD:src/main/java/Util_Main.java
//        for ( Map<String,Object> rowMap   :  rsLst  ) {
//            System.out.println("Name: "+ rowMap.get("FIRST_NAME")+" | "
//                              +"Salary: "+rowMap.get("SALARY"));
//        }
        for (Map<String,Object>Mp:rsLst) {
            System.out.println("Names is:-> "+Mp.get("FIRST_NAME")+ "Salary is:-> "+Mp.get("SALARY"));


=======
        for (Map<String, Object> rowMap : rsLst) {
            System.out.println("Name: " + rowMap.get("FIRST_NAME") + " | "
                    + "Salary: " + rowMap.get("SALARY"));
>>>>>>> d56997fa5102e882ca2f578e91230f631e24bcc4:src/main/java/JDBC/Util_Main.java
        }


        DBUtility.closeConnections();


    }


}
