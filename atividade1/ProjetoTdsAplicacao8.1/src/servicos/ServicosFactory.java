/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Legnus
 */
public class ServicosFactory {
    private static UsuarioServicos usuarioServicos = new UsuarioServicos();
    private static PacienteServicos pacienteServicos = new PacienteServicos();
    
    public static UsuarioServicos getUsuarioServicos(){
        return usuarioServicos;
    }

    public static PacienteServicos getPacienteServicos() {
        return pacienteServicos;
    }
}
