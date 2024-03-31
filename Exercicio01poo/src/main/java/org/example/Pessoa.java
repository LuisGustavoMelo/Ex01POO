package org.example;

public class Pessoa {
    private String profissao;
    private int anosDeExperiencia;
    private String especializacao;

    public Pessoa() {
    }

    public Pessoa(String profissao, int anosDeExperiencia, String especializacao) {
        this.profissao = profissao;
        this.anosDeExperiencia = anosDeExperiencia;
        this.especializacao = especializacao;
    }

    public void exibirInformacoes() {
        System.out.println("profissao: " + profissao);
        System.out.println("anosDeExperiencia: " + anosDeExperiencia);
        System.out.println("especialização: " + especializacao);
    }

    public void apresentar() {
        System.out.println("Sou " + profissao + " tenho " + anosDeExperiencia + " anos de Experiência na área e " + " minha especialização é: " + especializacao);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Médico", 10, "Cariologista");
        Pessoa pessoa2 = new Pessoa("Programador", 25, "FrontEnd");

        pessoa1.exibirInformacoes();
        pessoa1.apresentar();

        System.out.println();

        pessoa2.exibirInformacoes();
        pessoa2.apresentar();
    }
}