/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

public class Time {
private String nome;
private int qtdVitorias;
private int qtdEmpates;
private int qtdDerrotas;
private int qtdPontos;
 

public Time() {
}

public void listar()
{

System.out.println("Time : "+ nome);
System.out.println("Vitorias(V): "+ qtdVitorias);
System.out.println("Empates(E): "+ qtdEmpates);
System.out.println("Derrotas(D): " + qtdDerrotas);
System.out.println("Pontos(Pts): " + qtdPontos);
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getQtdVitorias() {
	return qtdVitorias;
}
public void setQtdVitorias(int qtdVitorias) {
	this.qtdVitorias += qtdVitorias;
}
public int getQtdEmpates() {
	return qtdEmpates;
}
public void setQtdEmpates(int qtdEmpates) {
	this.qtdEmpates += qtdEmpates;
}
public int getQtdDerrotas() {
	return qtdDerrotas;
}
public void setQtdDerrotas(int qtdDerrotas) {
	this.qtdDerrotas += qtdDerrotas;
}

public int getQtdPontos() {
	return qtdPontos;
}

public void setQtdPontos(int qtdPontos) {
	this.qtdPontos += qtdPontos;
}



}