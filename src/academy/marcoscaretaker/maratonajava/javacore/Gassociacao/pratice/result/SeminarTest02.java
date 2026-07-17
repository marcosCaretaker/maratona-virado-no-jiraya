package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Local;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Seminar;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Student;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.pratice.main.Teacher;

public class SeminarTest02 {
    public static void main(String[] args) {
        // ================= INSTANCIAÇÃO =================
        Local localA = new Local("Auditório Principal");
        Local localB = new Local("Laboratório de Ciências");

        Teacher teacherMestre = new Teacher("Jiraiya", "Ninjutsu");
        Teacher teacherEspecialista = new Teacher("Tsunade", "Ninjutsu Médico");

        Student student1 = new Student("Naruto Uzumaki", 16);
        Student student2 = new Student("Sasuke Uchiha", 16);
        Student student3 = new Student("Sakura Haruno", 16);
        Student studentIsolado = new Student("Gaara", 16);

        Seminar seminarHerois = new Seminar("Como salvar a vila", localA);
        Seminar seminarMedicos = new Seminar("Primeiros Socorros em Batalha", localB);

        System.out.println("=========================================================================");
        System.out.println("TESTE 1: IMPRIMINDO OBJETOS RECÉM-CRIADOS (SEM RELAÇÃO NENHUMA AINDA)");
        System.out.println("Objetivo: Ver se o print de aluno/seminário/professor sem associação não quebra (NullPointerException).");
        System.out.println("=========================================================================");
        student1.print();
        seminarHerois.print();
        teacherMestre.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 2: SEMINÁRIO COM LOCAL E PROFESSOR, MAS **SEM ALUNOS**");
        System.out.println("Objetivo: Testar a regra 'Um seminário poderá ter nenhum aluno'.");
        System.out.println("=========================================================================");
        seminarHerois.setTeachers(new Teacher[]{teacherMestre});
        teacherMestre.setSeminars(new Seminar[]{seminarHerois});
        seminarHerois.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 3: PROFESSOR COM **VÁRIOS** SEMINÁRIOS");
        System.out.println("Objetivo: Testar a regra 'Um professor poderá ter vários seminários'.");
        System.out.println("=========================================================================");
        teacherEspecialista.setSeminars(new Seminar[]{seminarHerois, seminarMedicos});
        teacherEspecialista.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 4: INSERINDO VÁRIOS ALUNOS NO SEMINÁRIO");
        System.out.println("Objetivo: Adicionar Naruto e Sasuke no seminário de Heróis.");
        System.out.println("=========================================================================");
        Student[] alunosHerois = {student1, student2};
        seminarHerois.setStudents(alunosHerois);
        seminarHerois.print();

        // Vamos checar se o aluno reconhece que está no seminário após ser adicionado a ele
        System.out.println("\n--> Imprimindo o aluno Naruto após o seminário receber o array de alunos:");
        System.out.println("O print do aluno mostra qual é o seminário dele? (Isso depende de como você fez o 'set' na sua classe)");
        student1.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 5: O PROBLEMA DO ARRAY BRUTO (SOBRESCREVENDO ALUNOS)");
        System.out.println("Objetivo: Adicionar a Sakura no seminário que já tinha o Naruto e Sasuke.");
        System.out.println("O que deve acontecer: Como usamos setStudents(novoArray), o Naruto e Sasuke vão SUMIR do seminário.");
        System.out.println("=========================================================================");
        seminarHerois.setStudents(new Student[]{student3});
        seminarHerois.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 6: QUEBRA DA REGRA DO EXERCÍCIO (ALUNO EM MAIS DE UM SEMINÁRIO)");
        System.out.println("Objetivo: O exercício diz 'Um aluno poderá estar em apenas um seminário'.");
        System.out.println("Vamos tentar forçar a Sakura a estar no seminário de Heróis E no de Médicos.");
        System.out.println("=========================================================================");
        // Sakura já foi adicionada no seminarHerois no Teste 5. Agora vamos colocar no seminarMedicos.
        seminarMedicos.setStudents(new Student[]{student3});

        System.out.println("\n--> Imprimindo Seminário de Heróis (Sakura ainda tá lá?):");
        seminarHerois.print();

        System.out.println("\n--> Imprimindo Seminário de Médicos (Sakura tá aqui também?):");
        seminarMedicos.print();

        System.out.println("\n--> Imprimindo a Sakura (Qual seminário ela diz que está?):");
        student3.print();

        System.out.println("\n=========================================================================");
        System.out.println("TESTE 7: TESTANDO CONSTRUTOR CHEIO (LOCAL, ALUNOS E PROFESSORES)");
        System.out.println("Objetivo: Verificar se as associações feitas pelo construtor funcionam perfeitamente.");
        System.out.println("=========================================================================");
        Seminar seminarSurpresa = new Seminar(
                "Treinamento Secreto",
                new Local("Caverna Oculta"),
                new Student[]{studentIsolado},
                new Teacher[]{teacherMestre, teacherEspecialista}
        );
        seminarSurpresa.print();

        System.out.println("\n================ FIM DOS TESTES ================");
    }
}
