class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return super.getCost() + 0.6; }
    public String getDescription() { return super.getDescription() + ", Whipped Cream"; }
}