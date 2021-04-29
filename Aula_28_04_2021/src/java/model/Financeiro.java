package model;

import java.text.DecimalFormat;

public class Financeiro {

    private double valorFuturo;
    private double meses;
    private double taxa;
    private double investimentoMes;

    public Financeiro() {
    }

    public double getValorFuturo() {
        return valorFuturo;
    }

    public void setValorFuturo(double valorFuturo) {
        this.valorFuturo = valorFuturo;
        setInvestimentoMes();
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
        setInvestimentoMes();
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
        setInvestimentoMes();
    }

    public String getInvestimentoMes() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        String ret = df.format(this.investimentoMes);
        return ret;
    }

    private void setInvestimentoMes() {
        double tx = this.taxa / 100;
        this.investimentoMes = (valorFuturo * tx) / (Math.pow(1 + tx, meses) - 1);
    }

}
