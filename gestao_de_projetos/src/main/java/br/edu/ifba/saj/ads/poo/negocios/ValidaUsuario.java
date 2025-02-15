package br.edu.ifba.saj.ads.poo.negocios;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.saj.ads.poo.exception.ErroLogin;
import br.edu.ifba.saj.ads.poo.model.Usuario;

public class ValidaUsuario {

    static List<Usuario> listaUsuarios = new ArrayList<>();

    static{
        listaUsuarios.add(new Usuario(1, "admin", "admin", "admin@gmail.com"));
    }

    public Usuario validaLogin(String login, String senha) throws ErroLogin{
        
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getLogin().equals(login)&&usuario.getSenha().equals(senha)){
                return usuario;
            }
        }

        throw new ErroLogin("Não foi possível localizar o usuario "+login+", ou a senha esta errada");

    }
    
}