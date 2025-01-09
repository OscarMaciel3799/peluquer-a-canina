package logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;


public class ControladoraLogica {
     ControladoraPersistencia controlPersis=new ControladoraPersistencia();

    public void guardarDatos(String nombreMasco, String raza, String color, 
            String alergia, String atenEsp, String nombreDueño, String celDueño, 
            String observaciones) {
        
        //Creamos el dueño y asignamos sus valores
        Dueño dueño=new Dueño();
        dueño.setNombre(nombreDueño);
        dueño.setCelDueño(celDueño);
        
        //Creamos la mascota y asignamos sus valores
        Mascota mascota=new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setAlergico(alergia);
        mascota.setAtenEsp(atenEsp);
        mascota.setObservaciones(observaciones);
        mascota.setUnDueño(dueño);
        
        
        //Los guardamos en la base de datos
        controlPersis.guardar(dueño,mascota);
    }

   
     
     
}
