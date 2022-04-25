package br.com.dio;

import br.com.dio.model1.Gato;

public class PrimeiroINtelJ {

    public static <Livro1> void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Object livro1 = new livro1( "O problema dos três corpos", 300);
        System.out.println(livro1);
    }
}
class livro1 {
    private String nome;
    private String numPaginas;

    public livro1(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = String.valueOf(numPaginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro1{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}


