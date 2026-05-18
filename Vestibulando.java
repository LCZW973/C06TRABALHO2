package org.example;
import java.util.Scanner;

public class Vestibulando extends Pessoa {

    private float renda;
    private String escola_origem;


    //ao logar um vestibulando,o vestibulando deve ser capaz de puxar seus dados como "pessoa" do banco e criar o construtor//
    public Vestibulando (String CPF ,String nome , String email , int id )
    {
       super(CPF,nome,email,id);
    }


    //o vestibulando em especifico ao checar seus dados deve ser capaz de puxar do banco seus dados como vestibulando //
    @Override
    public void confereSeusDados()
    {
        System.out.println("Dados do cadastro ");
        System.out.println("CPF : " + CPF);
        System.out.println("Nome : " + nome);
        System.out.println("Renda : " + renda);
        System.out.println("Escola de  origem : " + escola_origem);
        System.out.println("Email : " + email);
        System.out.println("Alocado para a sala " + "acrescentar dps");
    }

    public void confereDadosVestibular()
    {

    }

    //e preciso considerar a possibilidade do aluno checar a nota antes do supervisor a postar
    public void pesquisaNota()
    {
        //nota precisa ser um wrapper para receber null //
        if(getResultado.nota == null)
           System.out.println("A nota ainda nao foi postada ");
        else
           System.out.println("Nota "+getResultado.nota);
    }

    //adicionar a modificacao no bd dps
    @Override
    public void atualizaEmail()
    {
        System.out.println("Novo email : ");
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
    }
}
