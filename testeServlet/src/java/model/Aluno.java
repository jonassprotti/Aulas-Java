package model;
    
public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private float media;
    private String situacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getMedia() {
        return media;
    }
    
    public void calcMedia() {
        calcMedia(this.nota1, this.nota2);
    }
    public void calcMedia(float nota1, float nota2){
        this.media = (this.nota1 + this.nota2) / 2;
        this.situacao = (this.media < 6) ? "Reprovado" : "Aprovado";
    }

    public String getSituacao() {
        return situacao;
    }
}
