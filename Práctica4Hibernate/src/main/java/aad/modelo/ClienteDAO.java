package aad.modelo;

public interface ClienteDAO {
	public Cliente altaCliente(String nombreUsuario, String direccion, String password);
	public Cliente obtenerCliente (long idCliente);
	public Cliente editarCliente(Cliente cliente);
	public boolean eliminarCliente (long idCliente);
	public Cliente logIn(String nombreUsuario, String direccion, String password);
	public boolean logOut(Cliente cliente);
}
