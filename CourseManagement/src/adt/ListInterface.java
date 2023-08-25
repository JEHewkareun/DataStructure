/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author kaon
 */
public interface ListInterface<T> {

  public void add(T newEntry);

  public T remove(int givenPosition);

  public boolean replace(int givenPosition, T newEntry);

  public T getEntry(T obj);
  
  public T getEntry(int givenPosition);

  public int getNumberOfEntries();

  public boolean isEmpty();

  public boolean isFull();
  
}
