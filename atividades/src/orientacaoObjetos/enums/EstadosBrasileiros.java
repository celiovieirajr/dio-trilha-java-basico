package orientacaoObjetos.enums;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "PIAUÍ", 13),
    MARANHAO ("MA", "Maranhão", 14),
    CEARA ("CE", "Ceará", 14);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
