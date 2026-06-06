public class LibraryInterfaceDemo
{
    public static void main(String[] args)
    {
        System.out.println("----- Kid User Test Case -----");

        KidUsers kid1 = new KidUsers(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println();

        KidUsers kid2 = new KidUsers(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println("\n----- Adult User Test Case -----");

        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}