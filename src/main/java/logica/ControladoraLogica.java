package logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


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
        
        //Creamos un JOptionPane para mostrar un mensaje de exito
        JOptionPane optionPane=new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog=optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    

   
     
     
}
