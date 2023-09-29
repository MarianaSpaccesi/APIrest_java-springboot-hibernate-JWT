package com.fullstack.curso.controllers;


import com.fullstack.curso.dao.UsuarioDao;
import com.fullstack.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario (@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Mariana");
        usuario.setApellido("Spaccesi");
        usuario.setEmail("mari@gmail.com");
        usuario.setTelefono("3123234");
        usuario.setPassword("14345kldfsg");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios (){
        return usuarioDao.getUsuarios();
    }


}
