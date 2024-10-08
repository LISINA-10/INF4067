
public final class Operationmathematique {
    private static Operationmathematique instance = null;

//D'autres attributs, classiques et non "static"
    private int x;
    private int y;
    private int z;

//Constructeur de l'objet.
    private Operationmathematique()
    {
//La presence d'un constructeur prive supprime le constructeur public par defaut
        super();
    }

//Un autre constructeur.
    private Operationmathematique(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

//Methode renvoyant une instance de la classe Operationmathematique
    public static Operationmathematique getInstance()
    {
        if (instance == null)
        {
            instance = new Operationmathematique();
        }
        return instance;
    }

    public static Operationmathematique getInstance(int x, int y, int z)
    {
        if (instance == null)
        {
            instance = new Operationmathematique(x, y, z);
        }
        return instance;
    }

//D'autres methodes classique et non "static"
    public int somme(int x, int y)
    {
        return x+y;
    }
    public float moyenne(int x, int y)
    {
        return somme(x, y)/2;
    }

    public int somme(int x, int y, int z)
    {
        return x+y+z;
    }
    public float moyenne(int x, int y, int z)
    {
        return somme(x, y, z)/3;
    }

    public void affiche()
    {
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + "et y = " + this.y);
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + ", y = " + this.y + "et z = " + this.z);
    }

//Redefinir la methode clone pour empecher son utilisation
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    
}