package ar.com.eduit.domain.dao;

import ar.com.eduit.domain.User;

public interface UserDAO {

	public User findByUsername(String username) throws Exception;
}
