package xyz.equipo5.proyectoaulachido;

public class Usuarios {
    String id,nombre,correo,matricula,telefono,grupo,result;

    public Usuarios() {
    }

    public Usuarios(String id, String nombre, String correo, String matricula, String telefono, String grupo, String result) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.matricula = matricula;
        this.telefono = telefono;
        this.grupo = grupo;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
