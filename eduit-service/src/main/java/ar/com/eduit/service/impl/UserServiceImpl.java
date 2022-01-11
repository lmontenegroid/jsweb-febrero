package ar.com.eduit.service.impl;

import ar.com.eduit.domain.User;
import ar.com.eduit.domain.dao.UserDAO;
import ar.com.eduit.domain.dao.exceptions.GenericException;
import ar.com.eduit.domain.dao.impl.UserDAOImpl;
import ar.com.eduit.service.UserService;
import ar.com.eduit.service.exceptions.ServiceException;

public class UserServiceImpl implements UserService {

	private UserDAO userDao;
	
	public UserServiceImpl() {
		this.userDao = new UserDAOImpl();
	}
	
	@Override
	public User obtenerUsuario(String username) throws Exception {
		
		try {
			return this.userDao.findByUsername(username);
		} catch (GenericException e) {
			throw new ServiceException("Error obteniendo el usuario: " + username, e);
		}
		
	}

}
