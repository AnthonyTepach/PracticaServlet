/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anthonytepach
 */
public class GestionAlumno extends Conexion {

    public GestionAlumno() {
        Conectar();
    }

    public void callInsAlumno(int matricula, String nombre, String apat, String amat,
            int cel, int fijo, String email, String carrera, String cuatri, String turno) {
        try {
            CallableStatement cs = Conectar().prepareCall("{call sp_ins_alumno(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, matricula);
            cs.setString(2, nombre);
            cs.setString(3, apat);
            cs.setString(4, amat);
            cs.setInt(5, cel);
            cs.setInt(6, fijo);
            cs.setString(7, email);
            cs.setString(8, carrera);
            cs.setString(9, cuatri);
            cs.setString(10, turno);
            cs.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        GestionAlumno objGA = new GestionAlumno();
//        objGA.callInsAlumno(22,"Anthony","tepach","reyes",2,2,"anthony.tepach@gmail.com","TIC","Quinto","Matutino");
//    }
}
