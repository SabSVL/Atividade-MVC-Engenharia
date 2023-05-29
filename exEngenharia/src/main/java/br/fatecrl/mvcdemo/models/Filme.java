package br.fatecrl.mvcdemo.models;

public class Filme {
    private String nome;
    private String imagem;

    public Filme(String nome, String imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


