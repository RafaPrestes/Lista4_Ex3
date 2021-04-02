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
public class Funcionario {
    private String matricula;
    private String nome;
    private float salario;

    public Funcionario(String matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "\nNome: " + getNome() + "\nSalário: " + getSalario();
    }
  

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
