package org.example.youtube.decorator;

public class LowerCase extends FormatadorDecorator{
    public LowerCase(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formatar() {
        return super.formatar().toLowerCase();
    }
}
