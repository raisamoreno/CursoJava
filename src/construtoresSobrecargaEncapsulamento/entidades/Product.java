package construtoresSobrecargaEncapsulamento.aplicacao.entidades;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //método construtor. Ele vai obrigar o programa a entrar com os atributos.
    public Product(String name, double price, int quantity){
        //o this serve pra fazer uma referência ao atributo do objeto. Sem ele, neste exemplo, o name estaria se referindo ao argumento.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Sobrecarga é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
    //Neste caso, podemos utilizar duas vezes o mesmo construtor, porém com uma lista diferente de parâmetros.
    public Product(String name, double price){
        //o this serve pra fazer uma referência ao atributo do objeto. Sem ele, neste exemplo, o name estaria se referindo ao argumento.
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
    //Não foi criado um setQuantitiy pq esse atributo deve continuar privado no que diz respeito a atualização do estoque.
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
