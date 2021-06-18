/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Paciente;
import persistencia.Conexao;

/**
 *
 * @author user
 */
public class PacienteDao {
    public void cadastrarPaciente(Paciente p) throws SQLException{
        Connection con = Conexao.getConexao();
        
        Statement stat  = con.createStatement();
        
        try{
          String sql;
          sql="insert into paciente(cod_paciente,nome,inicio_isolamento,medicacao,cod_usuario,febre,tosse_seca,dor_de_cabeca,cansaco,dif_respirar,sem_sintomas)" 
                  +"values(null,'"+p.getNome()+"','"+p.getInicioIsolamento()+"','"+p.getMedicacao()+"',"+p.getCod_usuario()+","+p.getFebre()+","+p.getTosse()+","
                  +p.getDorDeCabeca()+","+p.getCansaco()+","+p.getDifRespirar()+","+p.getSemSintomas()+")";
                 
                  
                  stat.execute(sql);
          
        }
        catch(SQLException e){
            throw new SQLException("Erro ao inserir Paciente"+e.getMessage());
        }finally{
            //Serve para fechar as conexões
            stat.close();
            con.close();
        }
}
    
    public ResultSet buscarResponsavel() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        String sql = "SELECT * from usuario ORDER BY nome";
        
        try{
           return stat.executeQuery(sql);
        }
        catch (SQLException e){
            throw new SQLException("Erro ao inserir Usuário"+e.getMessage());
        }
    }
}
