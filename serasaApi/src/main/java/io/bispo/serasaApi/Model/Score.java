package io.bispo.serasaApi.Model;

import org.springframework.data.annotation.Id;

public class Score {

    @Id
    private int id;

    private String scoreDescricao;

    private int sinicial;

    private int sfinal;

    public Score(String scoreDescricao, int sinicial, int sfinal) {
        this.scoreDescricao = scoreDescricao;
        this.sinicial = sinicial;
        this.sfinal = sfinal;
    }

    public String getScoreDescricao() {
        return scoreDescricao;
    }

    public void setScoreDescricao(String scoreDescricao) {
        this.scoreDescricao = scoreDescricao;
    }

    public int getSinicial() {
        return sinicial;
    }

    public void setSinicial(int sinicial) {
        this.sinicial = sinicial;
    }

    public int getSfinal() {
        return sfinal;
    }

    public void setSfinal(int sfinal) {
        this.sfinal = sfinal;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", scoreDescricao='" + scoreDescricao + '\'' +
                ", sinicial='" + sinicial + '\'' +
                ", sfinal='" + sfinal + '\'' +
                '}';
    }
}
