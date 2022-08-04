import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descricaso curso java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Descricaso curso JavaScript");
        cursoJS.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoJava.toString());
        System.out.println(cursoJS);
        System.out.println(mentoria);
    }
}
