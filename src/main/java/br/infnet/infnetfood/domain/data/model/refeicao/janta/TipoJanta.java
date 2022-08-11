package br.infnet.infnetfood.domain.data.model.refeicao.janta;

public enum TipoJanta {

    NEGOCIOS("Business"), ROMANTICO("Romantic"), LAZER("Leisure");

    private final String type;

    TipoJanta(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
