package com.rest.peace.db.dao;

import java.io.Serializable;
import java.util.List;

import com.rest.peace.db.model.DomainObject;

/**
 * @author sknabil
 * @version 1.0.0
 *
 */
public interface GenericDao <T extends DomainObject, ID extends Serializable> {

	public T findById(ID id) throws RuntimeException;
	
	public List<T> findAll() throws RuntimeException;
	
	public void save(T object) throws RuntimeException;
	
	public void update(T object)throws RuntimeException;

    public void updateNative ( String sql );
	
	public void delete(T object) throws RuntimeException;

	public void deleteById(ID id) throws RuntimeException;
	
}
