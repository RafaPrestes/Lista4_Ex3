/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4_ex3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Main {

    public static void main(String[] args) {
        int opc = 0, tipo;
        String matricula,nome;
        float salario, percentual;
        
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Funcionário \n2 - Mostrar Funcionários \n3 - Sair"));
            
            switch(opc){
                case 1: 
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Funcionario ou Consultor? \n1 - Funcionario \n2 - Consultor"));
                    if(tipo == 1){
                    nome = JOptionPane.showInputDialog("Nome: ");
                    matricula = JOptionPane.showInputDialog("Matricula: ");
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                    listFuncionario.add(new Funcionario(matricula, nome, salario));
                    continue;
                    }
                    
                    nome = JOptionPane.showInputDialog("Nome: ");
                    matricula = JOptionPane.showInputDialog("Matricula: ");
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
                    percentual = Float.parseFloat(JOptionPane.showInputDialog("Percentual acrescido: "));
                    listFuncionario.add(new Consultor(matricula, nome, salario));
                    break;
                case 2:
                    String msg = "";
                    for(Funcionario f : listFuncionario){
                        msg += f + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3: break;
                
            }
        }
    }
    
}
