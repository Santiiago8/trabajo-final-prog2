package logica;
import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }

    public List <Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }

    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        
        List <Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu : listaUsuarios) {
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    ingreso = true;
                }
                else{
                    ingreso = false;
                }
            }
        }
        return ingreso;
    }

    public void crearOdontologo(String dni, String nombre, String apellido, String telefono, String direccion, String especialidad) {
        Odontologo odo = new Odontologo();
        odo.setDni(dni);
        odo.setNombre(nombre);
        odo.setApellido(apellido);
        odo.setTelefono(telefono);
        odo.setDireccion(direccion);
        odo.setEspecialidad(especialidad);
        
        controlPersis.crearOdontologo(odo);
    }

    public List<Odontologo> getOdontologos() {
        return controlPersis.getOdontologos();
    }

    public void borrarOdontologo(int id) {
        controlPersis.borrarOdontologo(id);
    }

    public void crearPaciente(String nombre, String dni, String apellido, String telefono) {
        Paciente pac = new Paciente();
        
        pac.setNombre(nombre);
        pac.setDni(dni);
        pac.setApellido(apellido);
        pac.setTelefono(telefono);
        
        controlPersis.crearPaciente(pac);
    }

    public List<Paciente> getPaciente() {
        return controlPersis.getPacientes();
    }

    public void borrarPaciente(int id) {
        controlPersis.borrarPaciente(id);
    }

    public void crearTurno(String fecha, String hora, String tipoconsulta) {
        Turno turno = new Turno();
        
        turno.setTipoconsulta(tipoconsulta);
        turno.setHora_turno(hora);
        turno.setFecha_turno(fecha);
        
        controlPersis.crearTurno(turno);
    }

    public List<Turno> getTurnos() {
        return controlPersis.getTurnos();
    }

    
    
}
