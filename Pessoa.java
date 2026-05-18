package org.example;

public abstract class Pessoa {

    protected String CPF;
    protected String nome;
    protected int id;
    protected String email;

    public Pessoa (String CPF ,String nome , String email , int id )
    {
        this.CPF = CPF;
        this.nome = nome ;
        this.email = email ;
        this.id = id ;
    }

    public void confereSeusDadosComoPessoa()
    {
        System.out.println("Dados do cadastro ");
        System.out.println("Nome : " + nome);
        System.out.println("CPF : " + CPF);
        System.out.println("Email : " + email);
        confereSeusDadosEspecificos();
    }

    public abstract void confereSeusDadosEspecificos();
    public void atualizaEmail() {}
}
