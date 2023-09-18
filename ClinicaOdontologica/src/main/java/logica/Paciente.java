package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Paciente extends Persona implements Serializable{
    
    //private int id_paciente;

    
    
    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion) {
        super(id, dni, nombre, apellido, telefono, direccion);
    }


    

    

    

    
    
}
