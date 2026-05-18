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

    public void confereSeusDados() {}
    public void atualizaEmail() {}
}
