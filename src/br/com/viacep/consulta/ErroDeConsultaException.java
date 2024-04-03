package br.com.viacep.consulta;

public class ErroDeConsultaException extends RuntimeException {
    private String mensagem;
    public ErroDeConsultaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
