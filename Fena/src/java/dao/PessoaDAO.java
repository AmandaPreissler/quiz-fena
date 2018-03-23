/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;
import utils.ConnectionPostgres;

/**
 *
 * @author roger.alves
 */
public class PessoaDAO implements GenericDAO<Pessoa> {
    ArrayList<Pessoa> aUsu = new ArrayList<>();
    private Connection conn;

    public PessoaDAO() {
        try {
            this.conn = ConnectionPostgres.createConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void add(Pessoa p) {        
        try {          
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa (autoid, nome, email, datanascimento, telefone, cidade, cliente) "
                    + "VALUES ((select nextval('pes_seq')), ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getDataNasc());
            stmt.setString(4, p.getTelefone());
            stmt.setString(5, p.getCidade());
            stmt.setBoolean(6, p.isCliente());
            
            stmt.execute();
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void edit(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pessoa> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
