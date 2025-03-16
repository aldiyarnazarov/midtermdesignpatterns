interface Coffee {
    double getCost();
    String getDescription();
}

class Espresso implements Coffee {
    public double getCost() { return 2.0; }
    public String getDescription() { return "Espresso"; }
}