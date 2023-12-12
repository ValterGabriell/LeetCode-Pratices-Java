package org.example.youtube.decorator;

public class UpperCase extends FormatadorDecorator{
    public UpperCase(Formatador formatador) {
        super(formatador);
    }
    @Override
    public String formatar() {
        return super.formatar().toUpperCase();
    }
}
