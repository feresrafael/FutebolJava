/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

/**
 *
 * @author feres
 */
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Partida implements IPartida {
private Time timeLocal;
private Time timeVisitante;
private int scoreVisitante;
private int scoreLocal;
private Date dataPartida;

public Partida() {
	
}

public Partida(Time timeLocal, Time timeVisitante) {
	Random r = new Random();
	this.timeLocal = timeLocal;
	this.timeVisitante = timeVisitante;
	this.scoreLocal = r.nextInt(11);
	this.scoreVisitante = r.nextInt(11);
	if(scoreLocal>scoreVisitante) {
		this.timeLocal.setQtdVitorias(1);
		this.timeLocal.setQtdPontos(3);
		this.timeVisitante.setQtdDerrotas(1);
	}
	if(scoreLocal==scoreVisitante) {
		this.timeLocal.setQtdEmpates(1);
		this.timeVisitante.setQtdEmpates(1);
		this.timeLocal.setQtdPontos(1);
		this.timeVisitante.setQtdPontos(1);
	}
	if(scoreLocal<scoreVisitante) {
		this.timeLocal.setQtdDerrotas(1);
		this.timeVisitante.setQtdPontos(3);
		this.timeVisitante.setQtdVitorias(1);
	}
    
}

public void iniciarPartida() {
		System.out.println("Partida Iniciando !!");
		scoreVisitante = Random_Placar(0,10);
		scoreLocal = Random_Placar(0,10);
}

public void mostrarResultado() {
		System.out.println(timeLocal.getNome()+" "+scoreLocal+ " X "+scoreVisitante+" "+timeVisitante.getNome());
	}


public Time getTimeLocal() {
	return timeLocal;
}

public void setTimeLocal(Time timeLocal) {
	this.timeLocal = timeLocal;
}

public Time getTimeVisitante() {
	return timeVisitante;
}

public void setTimeVisitante(Time timeVisitante) {
	this.timeVisitante = timeVisitante;
}

public int getScoreVisitante() {
	return scoreVisitante;
}

public void setScoreVisitante(int scoreVisitante) {
	this.scoreVisitante = scoreVisitante;
}

public int getScoreLocal() {
	return scoreLocal;
}

public void setScoreLocal(int scoreLocal) {
	this.scoreLocal = scoreLocal;
}

public Date getDataPartida() {
	return dataPartida;
}

public void setDataPartida(Date dataPartida) {
	this.dataPartida = dataPartida;
}

public void finalizarPartida() {
if(scoreLocal > scoreVisitante)
{
// Caso a vitoria tenha sido do time local
timeLocal.setQtdVitorias(timeLocal.getQtdVitorias() + 1);
timeLocal.setQtdPontos(timeLocal.getQtdPontos() + 3);

// Caso a derrota tenha sido do time visitante
timeVisitante.setQtdDerrotas(timeVisitante.getQtdDerrotas() + 1);
}
else if (scoreLocal == scoreVisitante)
{ // Empate do time Local
timeLocal.setQtdEmpates(timeLocal.getQtdEmpates()+1);
timeLocal.setQtdPontos(timeLocal.getQtdPontos()+1);

// Empate do time Visitante
timeVisitante.setQtdEmpates(timeVisitante.getQtdEmpates()+1);
timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+1);
}
else
{
// Caso a vitoria tenha sido do time Visitante
timeVisitante.setQtdVitorias(timeVisitante.getQtdVitorias() + 1);
timeVisitante.setQtdPontos(timeVisitante.getQtdPontos() +3);

// Caso a derrota tenha sido do time Local
timeLocal.setQtdDerrotas(timeLocal.getQtdDerrotas() + 1);
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
Time t1 = new Time();
Time t2 = new Time();
Scanner input = new Scanner(System.in);
System.out.println("Entre com o time local:");
t1.setNome(input.nextLine());
System.out.println("Entre com o time visitante:");
t2.setNome(input.nextLine());
Partida p = new Partida(t1,t2);
System.out.printf("%s \nVitorias:%d,Empates:%d,Derrotas:%d,Pontos:%d",t1.getNome(),t1.getQtdVitorias(),t1.getQtdEmpates(),t1.getQtdDerrotas(),t1.getQtdPontos());
System.out.printf("\n%s \nVitorias:%d,Empates:%d,Derrotas:%d,Pontos:%d",t2.getNome(),t2.getQtdVitorias(),t2.getQtdEmpates(),t2.getQtdDerrotas(),t2.getQtdPontos());
}
}
