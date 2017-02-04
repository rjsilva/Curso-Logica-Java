package br.com.estudos;

import java.io.Serializable;

public class Pessoa implements Serializable{

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private int idade;
	private String nome;
}
