package tsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlcon {
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    //    static final String DB_URL="jdbc:mysql://localhost:3306/tjava?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String DB_URL="jdbc:mysql://localhost:3306/tjava";
    static final String USER="root";
    static final String pass="root1314";

    public static void main(String[] args){

        try {
            Connection con=null;
            Statement statement=null;
            Class.forName(JDBC_DRIVER);
            con= DriverManager.getConnection(DB_URL,USER,pass);
            if (!con.isClosed())
                System.out.println("连接成功");
            statement=con.createStatement();
            String sql="select * from zhang";
            ResultSet rs=statement.executeQuery(sql);

            while (rs.next()){
                String name=rs.getString("pname");
                System.out.println(name);

            }
            rs.close();
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
