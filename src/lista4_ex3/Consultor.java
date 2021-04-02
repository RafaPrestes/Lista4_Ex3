/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4_ex3;

/**
 *
 * @author Usuário
 */
public class Consultor extends Funcionario{

    public Consultor(String matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "\nNome: " + getNome() + "\nSalário: " + getSalario();
    }

    @Override
    public void setSalario(float salario) {
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getSalario() {
        return super.getSalario() + super.getSalario() * 10/100;
    }
    
    public float getSalario(float percentual){
        return getSalario(percentual);
    }
  
    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMatricula() {
        return super.getMatricula(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
}
