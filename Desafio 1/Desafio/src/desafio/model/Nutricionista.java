
package desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author ficdev
 */
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"crn"})})
public class Nutricionista {
    @Id
    @Column (columnDefinition = "TEXT")
    private String nome;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String crn;
    @Column( nullable = false, columnDefinition= "TEXT" )
    private String uf;
    
    public Nutricionista(){
        
    }
    
    public Nutricionista(String nome, String crn, String uf){
        this.nome = nome;
        this.crn = crn;
        this.uf = uf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the crn
     */
    public String getCrn() {
        return crn;
    }

    /**
     * @param crn the crn to set
     */
    public void setCrn(String crn) {
        this.crn = crn;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
}
