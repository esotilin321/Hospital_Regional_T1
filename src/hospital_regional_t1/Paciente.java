/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_regional_t1;

/**
 *
 * @author Jean Purizaga
 */
public class Paciente {
    private String tipo_documento;
    private String nro_documento;
    private String apellido;
    private String nombre;
    private String telefono;
    private String correo;
    private String tipo_sangre;
    private String alergias;
    private int edad;
    
    //Getters and Setters

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{9}")) {
            this.telefono = telefono;
        } else {
            System.out.println("El teléfono debe tener 9 dígitos");
        }
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.toLowerCase().endsWith(".com")){
        this.correo = correo;
        }else if(correo.toLowerCase().endsWith(".con")){
            System.out.println("agregue bien el .com");
        }
        else{
            System.out.println("Corrija el correo");
        }
    }
    
    public void VerDatos()
    {
        System.out.println("tipo documento: " + this.tipo_documento);
        System.out.println("nro documento: " + this.nro_documento);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
        System.out.println("Tipo" + this.tipo_sangre);
        System.out.println("Alergias: " + this.alergias);
        System.out.println("edad: " + this.edad);
        
    }
    
}
