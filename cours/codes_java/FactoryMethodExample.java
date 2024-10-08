abstract class Produit {
    // Abstract Product Class
public abstract void display();
}

// Concrete Products
class ConcreteProductA1 extends Produit {
    @Override
    public void display() {
        System.out.println("je suis un produit de type A1.");
    }
}

class ConcreteProductA2 extends Produit {
    @Override
    public void display() {
        System.out.println("je suis un produit de type A2.");
    }
}

class ConcreteProductA3 extends Produit {
    @Override
    public void display() {
        System.out.println("je suis un produit de ttype A3.");
    }
}

// Creator Abstract Class
    abstract class Creator {
        public abstract Produit factoryMethod();
    }
    
    // Concrete Creators
    class ConcreteCreatorA extends Creator {
        @Override
        public Produit factoryMethod() {
            return new ConcreteProductA1();
        }
    }
    
    class ConcreteCreatorB extends Creator {
        @Override
        public Produit factoryMethod() {
            return new ConcreteProductA2();
        }
    }

    class ConcreteCreatorC extends Creator {
        @Override
        public Produit factoryMethod() {
            return new ConcreteProductA3();
        }
    }
    
    // Client Code
    public class FactoryMethodExample {
        public static void main(String[] args) {
            Creator creatorA = new ConcreteCreatorA();
            Produit productA = creatorA.factoryMethod();
            productA.display();
    
            Creator creatorB = new ConcreteCreatorB();
            Produit productB = creatorB.factoryMethod();
            productB.display();

            Creator creatorC = new ConcreteCreatorC();
            Produit productC = creatorC.factoryMethod();
            productC.display();
        }
    }


