/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.carlos.app;

import com.carlos.model.Aluno;
import com.carlos.model.Desempenho;
import com.carlos.model.Disciplina;
import com.carlos.model.Turma;
import com.carlos.repository.AlunoDao;
import com.carlos.repository.Conexao;
import com.carlos.repository.DesempenhoDao;
import com.carlos.repository.DisciplinaDao;
import com.carlos.repository.TurmaDao;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class Main {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            try{

                //Cadastrar Aluno
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno: ");
                aluno.setNome(input.nextLine());

                AlunoDao alunoDao = new AlunoDao();
                alunoDao.create(aluno);

                //Cadastrar Disciplina
                Disciplina disciplina = new Disciplina();
                System.out.println("Digite o nome da disciplina: ");
                disciplina.setNome(input.nextLine());

                DisciplinaDao disciplinaDao = new DisciplinaDao();
                disciplinaDao.create(disciplina);

                //Cadastrar Turma
                Turma turma = new Turma();
                System.out.println("Digite a sala da turma: ");
                turma.setSala(input.nextLine());
                System.out.println("Digite o horario de inicio da aulas dessa turma: ");
                turma.setHorarioInicio(LocalTime.parse(input.nextLine()));
                System.out.println("Digite o horario de fim da aulas dessa turma: ");
                turma.setHorarioFim(LocalTime.parse(input.nextLine()));

                turma.setDisciplina(disciplina);
                TurmaDao turmaDao = new TurmaDao();
                turmaDao.create(turma);

                //Cadastrar Desempenho
                Desempenho desempenho = new Desempenho();
                System.out.println("Digite a nota do "+aluno.getNome()+" na turma de sala "+turma.getSala()+" e que possui a disciplina "+disciplina.getNome());
                desempenho.setNota(input.nextDouble());
                System.out.println("Digite o numero de faltas: ");
                desempenho.setFaltas(input.nextInt());

                desempenho.setAluno(aluno);
                desempenho.setTurma(turma);
                DesempenhoDao desempenhoDao = new DesempenhoDao();
                desempenhoDao.create(desempenho);
            }
            finally{
                input.close();
            }
        } finally {
            
            Conexao.getConexao().close();
        }

    }
}
