/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author roger.alves
 */
@ManagedBean(name = "RedirMB")
@RequestScoped
public class RedirecionamentoMB {
    
    public String iniciaQuiz(){
        return "/quest01";
    }
    
    public String quest02(){
        return "/quest02";
    }
    
    public String quest03(){
        return "/quest03";
    }
    
    public String quest04(){
        return "/quest04";
    }
    
    public String quest05(){
        return "/quest05";
    }
    
    public String resultado(){
        return "/resultado";
    }
        public String respquest2() {
        return "/respostas/quest02_res";
    }
    public String respquest1() {
        return "/respostas/quest01_res";
    }
    public String respquest3() {
        return "/respostas/quest03_res";
    }
    public String respquest4() {
        return "/respostas/quest04_res";
    }
    public String respquest5() {
        return "/respostas/quest05_res";
    }
}
