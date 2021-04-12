package model;

public class Produto {
    //Atributos com Get/Set:
    private int codigo;
    private String descricao;
    private int quantidade;
    private float valorUnitario;
    private String dataUltimaCompra;
    //Atributos apenas com Get:
    private float valorTotal;
    private float valorVendaUnitario;
    private float valorVendaTotal;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }
    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }


    public float getValorTotal() {
        return valorTotal;
    }

    public float getValorVendaUnitario() {
        return valorVendaUnitario;
    }

    public float getValorVendaTotal() {
        return valorVendaTotal;
    }
    
    private void calculcar(){
        this.valorTotal = 0;
    }
}
