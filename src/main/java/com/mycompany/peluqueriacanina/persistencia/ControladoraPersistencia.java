package com.mycompany.peluqueriacanina.persistencia;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Dueño;
import logica.Mascota;


public class ControladoraPersistencia {
    DueñoJpaController dueñoJpa=new DueñoJpaController();
    MascotaJpaController mascotaJpa=new MascotaJpaController();

    public void guardar(Dueño dueño, Mascota mascota) {
        //Insertamos el dueño en la base de datos
        dueñoJpa.create(dueño);
        
        //Insertamos la mascota en la base de datos
        mascotaJpa.create(mascota);
        
        //Creamos un JOptionPane para mostrar un mensaje de exito
        JOptionPane optionPane=new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog=optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }
    
    
}
