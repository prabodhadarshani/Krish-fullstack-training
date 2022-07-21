package com.prabodha.singletondesignpattern;

import java.sql.Connection;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        long start;
        long end;

        DBManager dbManager=DBManager.getDbManager();


        System.out.println(dbManager);

         start =System.currentTimeMillis();

            Connection connection = dbManager.getConnection();
            end =System.currentTimeMillis();

     System.out.println(end-start);

      //  DBManager dbManager1 = DBManager.getDbManager();
        DBManager dbManager1=DBManager.getDbManager();
        Connection connection1 = dbManager1.getConnection();
        start =System.currentTimeMillis();
        System.out.println(dbManager1);
        end =System.currentTimeMillis();

        System.out.println(end-start);
    }
}
