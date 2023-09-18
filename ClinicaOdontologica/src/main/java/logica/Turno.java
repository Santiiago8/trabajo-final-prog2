package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turno;
    private String fecha_turno;
    private String hora_turno;
    private String Tipoconsulta;
 
    
    public Turno() {
    }

    public Turno(int id_turno, String fecha_turno, String hora_turno, String Tipoconsulta) {
        this.id_turno = id_turno;
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.Tipoconsulta = Tipoconsulta;
        
        
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public String getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(String fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(String hora_turno) {
        this.hora_turno = hora_turno;
    }

    public String getTipoconsulta() {
        return Tipoconsulta;
    }

    public void setTipoconsulta(String Tipoconsulta) {
        this.Tipoconsulta = Tipoconsulta;
    }    
    
}
