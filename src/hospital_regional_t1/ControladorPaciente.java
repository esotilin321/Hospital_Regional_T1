/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital_regional_t1;

import java.util.ArrayList;

/**
 *
 * @author Jean Purizaga
 */
public class ControladorPaciente {
    ArrayList<Paciente> crlPaciente = new ArrayList<>();
    public void Agregar_Paciente(Paciente e){
    crlPaciente.add(e);
    }
    public void Listar_Paciente(){
        for (int i = 0; i < crlPaciente.size(); i++){
        crlPaciente.get(i).VerDatos();
        }
    }
    
}
