/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author user
 */
public class DaoFactory {
    private static UsuarioDao usuarioDAO = new UsuarioDao();
    private static PacienteDao pacienteDAO = new PacienteDao();

    public static UsuarioDao getUsuarioDAO() {
        return usuarioDAO;
    }

    public static PacienteDao getPacienteDAO() {
        return pacienteDAO;
    }
    
   
   
    
    
}
