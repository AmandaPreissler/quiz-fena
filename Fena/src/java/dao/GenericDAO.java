/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author roger.alves
 */
public interface GenericDAO<T> {
    public void add(T t);
    public void edit(T t);
    public void delete(T t);
    public T getById(int id);
    public ArrayList<T> getAll();
}
