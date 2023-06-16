/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.Aluno;

/**
 *
 * @author ficdev
 */
public class AlunoDAO  implements DAO<Aluno>{
    
    @Override
    public void create(Aluno objeto){
        int id = objeto.getId();
        if(id != 0) objeto.setId(0);
        Conexao.getConexao().persist(objeto);
        objeto.setId(id);
    }
    @Override
    public Aluno read(long id){
        return null;
    }
    @Override
    public void update(Aluno objeto){
        
    }
    @Override
    public void delete (Aluno objeto){
        
    }
    @Override
    public List<Aluno> readAll(){
        return null;
    }
}
