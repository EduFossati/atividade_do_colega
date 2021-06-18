/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DaoFactory;
import dao.PacienteDao;
import java.sql.SQLException;
import modelo.Paciente;

/**
 *
 * @author Legnus
 */
public class PacienteServicos {
    public void cadastrarPaciente(Paciente p) throws SQLException {
        PacienteDao pDao = DaoFactory.getPacienteDAO();
        pDao.cadastrarPaciente(p);
    }
}
