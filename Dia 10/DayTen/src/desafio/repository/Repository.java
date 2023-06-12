/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.repository;

import java.util.List;

/**
 *
 * @author ficdev
 */
public interface Repository<T> {
    
    public void create(T objeto);
    
    public List<T> read();
    
    public void update(T objeto);
    
    public void delete(T objeto);
}
