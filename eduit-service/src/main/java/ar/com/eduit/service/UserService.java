package ar.com.eduit.service;

import ar.com.eduit.domain.User;

public interface UserService {

	public User obtenerUsuario(String username) throws Exception;
}
