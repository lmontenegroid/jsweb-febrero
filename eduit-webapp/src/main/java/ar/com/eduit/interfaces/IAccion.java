package ar.com.eduit.interfaces;

import ar.com.eduit.service.exceptions.ServiceException;

public interface IAccion {

	public void execute() throws ServiceException;

}
