/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author roger.alves
 */
public class ConnectionPostgres {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String DBURL = "jdbc:postgresql://192.9.200.146/Fenasoja";
    private static final String USER = "postgres";
    private static final String SENHA = "testejava";
    private static Connection conn = null;

    public static Connection createConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DBURL, USER, SENHA);
            System.out.println("Conexão OK!");       

        } catch (ClassNotFoundException ex) {
            System.out.println("Problemas no Driver de Conexão");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return conn;
    }
}
