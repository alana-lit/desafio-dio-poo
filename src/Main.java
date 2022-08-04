import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descricao mentoria");
        mentoriaJava.setData(LocalDate.now());

//        System.out.println(cursoJava.toString());
//        System.out.println(cursoJS);
//        System.out.println(mentoriaJava);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Developer");
        bootcampJava.setDescricao("Bootcamp de Java");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devAlana = new Dev();
        devAlana.setNome("Alana");
        devAlana.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos de "+devAlana.getNome()+": "+devAlana.getConteudosInscritos());
        devAlana.progredir();
        devAlana.progredir();
        System.out.println("-----------------------");
        System.out.println("Conteúdos Concluidos de "+devAlana.getNome()+": "+devAlana.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos de "+devAlana.getNome()+": "+devAlana.getConteudosInscritos());
        System.out.println("XP: "+devAlana.calcularTotalXP());


    }
}
