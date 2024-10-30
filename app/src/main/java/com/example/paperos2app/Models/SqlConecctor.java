package com.example.paperos2app.Models;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SqlConecctor {

    String classes = "net.sourceforge.jtds.jdbc.Driver";

    protected static String ip = "sql9001.site4now.net";
    protected static String port = "1433";
    protected static String db = "db_aaec8e_paperosbd001";
    protected static String un = "db_aaec8e_paperosbd001_admin";
    protected static String password = "paperosbd001";

    public Connection CONN() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        try {
            Class.forName(classes);
            // La URL de conexión con cifrado obligatorio
            String conUrl = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";databaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            conn = DriverManager.getConnection(conUrl, un, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }


    }






























