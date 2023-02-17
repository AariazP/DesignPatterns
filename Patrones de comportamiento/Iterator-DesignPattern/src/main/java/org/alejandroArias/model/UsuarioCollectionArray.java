package org.alejandroArias.model;

public class UsuarioCollectionArray implements  Iterator<Usuario>{

    /*
         Esta clase es un iterador de usuarios
         que recorre un array de usuarios

     */
    private Usuario[] usuarios;
    private int position;

    public UsuarioCollectionArray(Usuario[] usuarios){
        this.usuarios = usuarios;
        this.position = 0;
    }

    public UsuarioCollectionArray(){
        this.usuarios = new Usuario[0];
        this.position = 0;
    }

    public void add(Usuario usuario){
        Usuario[] newUsuarios = new Usuario[this.usuarios.length + 1];
        System.arraycopy(this.usuarios, 0, newUsuarios, 0, this.usuarios.length);
        newUsuarios[this.usuarios.length] = usuario;
        this.usuarios = newUsuarios;
    }

    public void remove(Usuario usuario){
        Usuario[] newUsuarios = new Usuario[this.usuarios.length - 1];
        int j = 0;
        for (Usuario value : this.usuarios) {
            if (value != usuario) {
                newUsuarios[j] = value;
                j++;
            }
        }
        this.usuarios = newUsuarios;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    @Override
    public boolean hasNext() {
        return this.position < this.usuarios.length && this.usuarios[this.position] != null;
    }

    @Override
    public Usuario next() {
        Usuario usuario = this.usuarios[this.position];
        this.position++;
        return usuario;
    }
}
