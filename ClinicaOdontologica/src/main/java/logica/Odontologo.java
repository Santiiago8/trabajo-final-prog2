package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Odontologo extends Persona implements Serializable{
    
    //private int id_odontologo;
    private String especialidad;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;
    
   
    public Odontologo() {
    }

    public Odontologo(String especialidad, Usuario unUsuario, Horario unHorario, int id, String dni, String nombre, String apellido, String telefono, String direccion) {
        super(id, dni, nombre, apellido, telefono, direccion);
        this.especialidad = especialidad;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }


//    public int getId_odontologo() {
//        return id_odontologo;
//    }

//    public void setId_odontologo(int id_odontologo) {
//        this.id_odontologo = id_odontologo;
//    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
}
