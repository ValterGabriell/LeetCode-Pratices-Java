package org.example.youtube.decorator;

public abstract class FormatadorDecorator implements Formatador {
    private final Formatador _formatador;

    public FormatadorDecorator(Formatador formatador) {
        _formatador = formatador;
    }

    @Override
    public String formatar() {
        return _formatador.formatar();
    }
}
