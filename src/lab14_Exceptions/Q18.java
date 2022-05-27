package lab14_Exceptions;

import java.sql.Connection;
import java.sql.SQLException;

public class Q18 {
    public static void main(String[] args) {
        Connection con=null;
        try {
            con.commit();
        }
        catch (SQLException | NullPointerException e)
        {
            System.out.println("SQLException caught");
        }
    }
}
