package ar.com.eduit.service;

import java.util.Collection;

import ar.com.eduit.service.exceptions.ServiceException;

import ar.com.eduit.domain.Producto;

public interface ProductoService {
	
	public Producto obtenerProducto(Long id) throws ServiceException;
	
	public Collection<Producto> obtenerTodos() throws ServiceException;

	public Producto eliminarProducto(String codigo) throws ServiceException;

	public Producto eliminarProducto(Long id) throws ServiceException;

	public Producto crearProducto(Producto nuevoProducto)throws ServiceException;

}
