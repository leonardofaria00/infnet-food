package br.infnet.infnetfood.domain.data.model.refeicao.petisco;

public enum TipoPetisco {

    CAMARAO("CAMARÃO"), CARNE("CARNE"), PEIXE("PEIXE");

    private final String type;

    TipoPetisco(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
