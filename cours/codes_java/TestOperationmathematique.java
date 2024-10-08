//Une classe de Test
//package construction.Operationmathematique;

public class TestOperationmathematique {
    
    public static void main(String[] args)
    {

        int sum = Operationmathematique.getInstance().somme(2, 5);
        System.out.printf("\nLa somme es %d", sum);
    
        int som = Operationmathematique.getInstance().somme(2, 5, 9);
        System.out.printf("\nLa somme est %d", som);
        
    }
}