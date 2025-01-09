package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
