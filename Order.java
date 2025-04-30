abstract class Order{
    abstract void display() {
        System.out.println(x:"\nDisplaying customer's order: ")
    }
    class OrderByProductName extends Order{
        //product name field
        private String productName;

        //constructor to set product name
        public OrderByProductName(String productName) {
            this.productName = productName;
        } 

        @Override
        void productName() {
            System.out.println("Order: " + productName)
        }
    }
}