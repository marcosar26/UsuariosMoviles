package es.marcos.login;

public class Usuario {
    private String correo;
    private String password;

    public Usuario(String correo, String password) {
        this.correo = correo.toLowerCase();
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (!correo.equals(usuario.correo)) return false;
        return password.equals(usuario.password);
    }

    @Override
    public int hashCode() {
        int result = correo.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
