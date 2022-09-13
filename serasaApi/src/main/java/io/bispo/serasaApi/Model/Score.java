package io.bispo.serasaApi.Model;

import org.springframework.data.annotation.Id;

public class Score {

    @Id
    private int id;

    private String scoreDescricao;

    private String sinicial;

    private String sfinal;

    public Score(String scoreDescricao, String sinicial, String sfinal) {
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

    public String getSinicial() {
        return sinicial;
    }

    public void setSinicial(String sinicial) {
        this.sinicial = sinicial;
    }

    public String getSfinal() {
        return sfinal;
    }

    public void setSfinal(String sfinal) {
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
