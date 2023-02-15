package org.alejandroArias.model;

import java.util.LinkedList;
import java.util.List;

public class UsuarioCollectionLinkedList implements Iterator{

    private LinkedList<Usuario> usuarios;


    public UsuarioCollectionLinkedList(){
        this.usuarios = new LinkedList<Usuario>();
    }

    public void add(Usuario usuario){
        this.usuarios.add(usuario);
    }


    public void remove(Usuario usuario){
        this.usuarios.remove(usuario);
    }


    @Override
    public boolean hasNext() {
        return this.usuarios.size() > 0;
    }

    @Override
    public Object next() {
        return this.usuarios.removeFirst();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}
