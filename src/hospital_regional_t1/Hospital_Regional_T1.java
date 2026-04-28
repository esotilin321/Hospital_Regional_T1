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
                System.out.println("Ingresa tipo de Doc: CE / DNI");
                String tipo_documento = scan.nextLine();
                
                System.out.println("Ingresa número de documento");
                String nro_documento = scan.nextLine();
                       
                
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
                
                System.out.println("Ingrese edad");
                int edad = scan.nextInt();
                
                pac.setTipo_documento(tipo_documento);
                pac.setNro_documento(nro_documento);
                pac.setApellido(aellido);
                pac.setNombre(nombre);
                pac.setTelefono(telefono);
                pac.setCorreo(correo);
                pac.setTipo_sangre(nombre);
                pac.setAlergias(alergia);
                pac.setEdad(edad);
                
                
                crl.Agregar_Paciente(pac);
                
                
                System.out.println("Desea ingresar otro personaje? S/N");
                rspa = respuesta.nextLine();
                if (rspa.equals("N")){
                crl.Listar_Paciente();
                }
        }
                
    }
    
}
