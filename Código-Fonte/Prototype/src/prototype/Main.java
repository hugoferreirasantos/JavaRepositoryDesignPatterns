package prototype;

import Publicacao.Livro;
import Publicacao.Publicacao;

public class Main {

    public static void main(String[] args) {

        Livro livroUm = new Livro();
            livroUm.setNome("Pedra Filosofal");
            livroUm.setAutor("J.K. Rowling");
            livroUm.setPaginas(223);

        Livro livroDois =  livroUm.clone();
            livroDois.setNome("Câmara Secreta");
            livroDois.setPaginas(252);

        Livro livroTres = livroDois.clone();
            livroTres.setNome("Prisioneiro de Askaban");
            livroTres.setPaginas(318);

        Livro livroQuatro = livroTres.clone();
            livroQuatro.setNome("Cálice de Fogo");
            livroQuatro.setPaginas(535);

        Livro livroCinco = livroQuatro.clone();
            livroCinco.setNome("Ordem da Fênix");
            livroCinco.setPaginas(703);

        Livro livroSeis = livroCinco.clone();
            livroSeis.setNome("Enigma do Príncipe");
            livroSeis.setPaginas(471);

        Livro livroSete = livroSeis.clone();
            livroSete.setNome("Relíquias da Morte");
            livroSete.setPaginas(549);

        /*-------------------------------------------------------*/

        Publicacao artigo = new Publicacao();
            artigo.setAno(2022);
            artigo.setAutor("Rodrigo Santos");
            artigo.setNome("Publica 2023");






        System.out.println(livroUm);
        System.out.println(livroDois);
        System.out.println(livroTres);
        System.out.println(livroQuatro);
        System.out.println(livroCinco);
        System.out.println(livroSeis);
        System.out.println(livroSete);
        System.out.println(artigo);
    }
}
