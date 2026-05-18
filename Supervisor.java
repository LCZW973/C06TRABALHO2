package org.example;
import java.util.Scanner;

public class Supervisor extends Pessoa  {

    public Supervisor (String CPF ,String nome , String email , int id )
    {
        super(CPF,nome,email,id);
    }

    //ver
    @Override
    public void confereSeusDadosEspecificos()
    {
        System.out.println(":puxA no bd");
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
