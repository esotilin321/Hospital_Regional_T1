/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital_regional_t1;

import java.util.Scanner;

/**
 *
 * @author Jean Purizaga
 */
public class Hospital_Regional_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);
        Paciente pac = new Paciente();
        ControladorPaciente crl = new ControladorPaciente();
        System.out.println("Desea ingresar un paciente? S/N");
        String rspa = respuesta.nextLine();
        while(rspa.equalsIgnoreCase("S")){
        boolean DocValido = false;
            String nro_documento = " ";
                System.out.println("Ingresa tipo de Doc: CE / DNI");
                String tipo_documento = scan.nextLine();
                while(!DocValido) {
                    System.out.println("Ingresa número de documento");
                    nro_documento = scan.nextLine();
                    if (tipo_documento.equals("DNI")&& nro_documento.length() != 8) {
                    System.out.println("El DNI debe tener 8 dígitos.");
                    }if (tipo_documento.equals("CE") && nro_documento.length() != 9) {
                    System.out.println("El Carnet de Extranjería debe tener 9 dígitos.");
                    }else {
                        DocValido = true;
                        System.out.println("Validado ");
                    }    
                }
                System.out.println("Ingresa apellidos");
                String aellido = scan.nextLine();
                
                System.out.println("Ingresa nombres");
                String nombre = scan.nextLine();
                
                System.out.println("Ingresa numero telefono");
                String telefono = scan.nextLine();
                
                System.out.println("Ingresa correo");
                String correo = scan.nextLine();
                
                System.out.println("Ingrese si presenta alergias");
                String alergia =scan.nextLine();
                
                
                pac.setTipo_documento(tipo_documento);
                pac.setNro_documento(nro_documento);
                pac.setApellido(aellido);
                pac.setNombre(nombre);
                pac.setTelefono(telefono);
                pac.setCorreo(correo);
                pac.setTipo_sangre(nombre);
                pac.setAlergias(alergia);
                pac.setEdad(0);
                
                
                crl.Agregar_Paciente(pac);
                crl.Listar_Paciente();
                
                System.out.println("Desea ingresar otro personaje? S/N");
                rspa = respuesta.nextLine();
        }
                
    }
    
}
