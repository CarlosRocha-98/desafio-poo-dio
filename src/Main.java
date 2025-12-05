import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos cursos1 = new Cursos();
        cursos1.setTitulo("curso java");
        cursos1.setDescricao("descrição curso java");
        cursos1.setCargaHoraria(8);

        Cursos cursos2 = new Cursos();
        cursos2.setTitulo("curso js");
        cursos2.setDescricao("descrição curso js");
        cursos2.setCargaHoraria(4);

        Conteudo conteudo = new Cursos();
        Conteudo conteudo1 = new Mentorias();

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("mentoria de java");
        mentorias.setDescricao("descrição mentoria java");
        mentorias.setData(LocalDate.now());

//        System.out.println(cursos1);
//        System.out.println(cursos2);
//        System.out.println(mentorias);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursos1);
        bootcamp.getConteudos().add(cursos2);
        bootcamp.getConteudos().add(mentorias);

        Devs devCarlos = new Devs();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        System.out.println("---------");

        Devs devDany = new Devs();
        devDany.setNome("Dany");
        devDany.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Dany:" + devDany.getConteudosInscritos());
        devDany.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Dany:" + devDany.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos Dany:" + devDany.getConteudosConcluidos());
        System.out.println("XP:" + devDany.calcularTotalXp());

    }
}