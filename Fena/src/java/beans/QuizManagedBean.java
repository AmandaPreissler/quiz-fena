/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author roger.alves
 */
@ManagedBean(name = "QuizMB")
@RequestScoped
public class QuizManagedBean implements Serializable {

    private static int contador;
    public String option;
    public boolean resposta;

    public String enviaQuestao01() {
        return "respostas/quest01_res";
    }

    public String enviaQuestao02() {
        return "respostas/quest02_res";
    }

    public String enviaQuestao03() {
        return "respostas/quest03_res";
    }

    public String enviaQuestao04() {
        return "respostas/quest04_res";
    }

    public String enviaQuestao05() {
        return "respostas/quest05_res";
    }

    public boolean retornaResposta() {
        return resposta;
    }

    public int retornaTotalAcertos() {
        return contador;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
