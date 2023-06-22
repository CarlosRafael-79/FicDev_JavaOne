/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import java.util.List;

/**
 *
 * @author ficdev
 * @param <T>
 */
public interface Dao<T> {
    
    public void create(T objeto);
    public T read(int id);
    public void update(T objeto);
    public void delete (T objeto);
    
    public List<T> readAll();

}
