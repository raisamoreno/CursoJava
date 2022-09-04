package construtoresSobrecargaEncapsulamento.aplicacao.entidades;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //m�todo construtor. Ele vai obrigar o programa a entrar com os atributos.
    public Product(String name, double price, int quantity){
        //o this serve pra fazer uma refer�ncia ao atributo do objeto. Sem ele, neste exemplo, o name estaria se referindo ao argumento.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Sobrecarga � um recurso que uma classe possui de oferecer mais de uma opera��o com o mesmo nome, por�m com diferentes listas de par�metros.
    //Neste caso, podemos utilizar duas vezes o mesmo construtor, por�m com uma lista diferente de par�metros.
    public Product(String name, double price){
        //o this serve pra fazer uma refer�ncia ao atributo do objeto. Sem ele, neste exemplo, o name estaria se referindo ao argumento.
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    //N�o foi criado um setQuantitiy pq esse atributo deve continuar privado no que diz respeito a atualiza��o do estoque.
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
