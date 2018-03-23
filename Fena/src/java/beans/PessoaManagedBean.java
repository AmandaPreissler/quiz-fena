/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.PessoaDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Pessoa;

/**
 *
 * @author roger.alves
 */
@ManagedBean(name = "PessoaMB")
@RequestScoped
public class PessoaManagedBean implements Serializable {
    private final PessoaDAO pDAO = new PessoaDAO();
    private Pessoa pessoa = new Pessoa();
    
    public String enviaCadastro(){
      Pessoa novaPessoa = new Pessoa(pessoa.getNome(), pessoa.getEmail(), pessoa.getDataNasc(), pessoa.getTelefone(), pessoa.getCidade(), pessoa.isCliente());
      pDAO.add(novaPessoa);
      return "/questioIntro";
    }
    
    public Pessoa getPessoa() {               
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {           
        this.pessoa = pessoa;
    }
}
