package br.felipesilva.dadosjson;

import java.io.Serializable;

/**
 * Created by Felipe on 20/11/2015.
 */
public class People implements Serializable {

    private static final long serialVersion = 1L;
    private String Nome;
    private String Sobrenome;
    private String Idade;
    private String Id;
    private String PhoneNumber;
    private String Imagem;

    public void setImagem(String I){
        this.Imagem = I;
    }

    public String getImagem(){
        return Imagem;
    }

    public void setNome(String n){
        this.Nome = n;
    }

    public String getNome(){
        return (this.Nome);
    }

    public void setSobrenome(String n){
        this.Sobrenome = n;
    }

    public String getSobrenome(){
        return (this.Sobrenome);
    }

    public void setIdade(String id){
        Idade = id;
    }

    public String getIdade(){
        return Idade;
    }

    public void setId(String Id){
        this.Id = Id;
    }

    public String getId(){
        return Id;
    }

    public void setPhoneNumber(String Phone) {
        PhoneNumber = Phone;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }

    public String toSting(){
        return Nome;
    }

}
