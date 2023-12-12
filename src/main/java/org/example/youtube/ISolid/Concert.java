package org.example.youtube.ISolid;

import java.time.LocalDate;

public class Concert implements ICommonEvent {
    private String name;
    private LocalDate date;
    private int hourOfDay;
    private double yield;

    public Concert(String name, LocalDate date, int hourOfDay) {
        this.name = name;
        this.date = date;
        this.hourOfDay = hourOfDay;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    @Override
    public void sellTicket() {
        System.out.println("Vendendo ticket");
    }

    @Override
    public void insertTickets() {
        System.out.println("Aumentando estoque de ticket");
    }

    @Override
    public void calculateYield() {
        System.out.println("Calculando lucro");
    }

    @Override
    public void doPayment() {
        System.out.println("Cliente paga ticket");
    }
}
