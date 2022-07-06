import java.util.*;

public class Main {
    public static void main(String[] args) {
        Alunos aluno = new Alunos();
        Materia materia = new Materia();
        aluno.setName();
        ArrayList<Integer> peso = aluno.generatePesos();
        double notaPeso = 0;
        double notaFinal = 0;

        System.out.println("\nOlá, a quantidade de Notas da Matéria de " + materia.getNomeMateria() + " no semestre foi de: " + materia.getQtdNotas() + " Notas.\n");

        for (int o = 0; o <= 2; o++) {
            ArrayList<Integer> nota = aluno.generateNotas();
            ArrayList<String> alunos = aluno.setName();
            notaFinal = 0.0;
            System.out.println("=================================================================");
            System.out.println("As notas do " + alunos.get(o) + " são:");
            for (int i = 0; i <= 4; i++) {
                int fakeI = i + 1;
                System.out.println(".................................................................");
                System.out.println("Nota " + fakeI + ": " + nota.get(i));
                System.out.println("Peso da Nota " + fakeI + ": " + peso.get(i));
                notaPeso = nota.get(i) * peso.get(i) / 10.0;
                notaFinal = notaFinal + notaPeso;
                System.out.println("Nota pelo Peso " + fakeI + ": " + notaPeso);
            }
            System.out.println("\nLogo, a nota final do " + alunos.get(o) + " é de: " + notaFinal + "\n");
        }
    }
}