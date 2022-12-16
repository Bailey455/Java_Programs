
/**
 * A test program for the Tile class
 *
 * @author (Luginbuhl)
 * @version (1)
 */
public class TileClient
{
    
    public static void main(String[] args)
    {
        //construct three Tile objects using both constructors
        Tile tile1 = new Tile();
        Tile tile2 = new Tile('A',1);
        Tile tile3 = new Tile('Z',6);
        
        //Do tiles have correct values?
        System.out.println("(Tile 1 should have letter A and value 1)");
        System.out.println("Tile 1 info --> " + tile1.toString());
        System.out.println();
        System.out.println("(Tile 2 should have letter A and value 1)");
        System.out.println("(Tile 2 info --> " + tile2.toString());
        System.out.println();
        System.out.println("(Tile 3 should have letter Z and value 6)");
        System.out.println("Tile 3 info --> " + tile3.toString());
        System.out.println();
        //Do first two tiles have same letter and value?
        System.out.print("Comparing tiles 1 and 2 ");
        System.out.println("(next line should say that tiles are equal)");
        if (tile1.equals(tile2)) {
            System.out.println("Tiles are equal");
        } else {
            System.out.println("Tiles are not equal");
        }
        System.out.println();
        
        //Do second and third tiles have different values?
        System.out.print("Comparing Tiles 2 and 3 ");
        System.out.println("(next line should say that tiles are not equal)");
        if (tile2.equals(tile3)) {
            System.out.println("Tiles are equal");
        } else {
            System.out.println("Tiles are not equal");
        }
        System.out.println();
        
        //Change value of Tile 1 and letter of Tile 3
        System.out.println("Change value of Tile 1 to 5");
        tile1.setValue(5);
        System.out.println("Change letter of Tile 3 to G");
        tile3.setLetter('G');
        System.out.println();
        
        System.out.println("(Tile 1 should now have letter A and value 5)");
        System.out.println("Tile 1 info --> " + tile1.toString());
        System.out.println();
        System.out.println("(Tile 3 should now have letter G and value 6)");
        System.out.println("Tile 2 info --> " + tile3.toString());
        System.out.println();
        
        //Test compareTo
        System.out.println("Comparing tiles 1 and 2 (result should be 4).");
        System.out.println("Tile 1 compared to Tile 2 results in: " + tile1.compareTo(tile2));
        System.out.println();
        
        //Second test of compareTo
        System.out.println("Comparing tiles 1 and 3 (result should be -6).");
        System.out.println("Tile 1 compared to Tile 3 results in: " + tile1.compareTo(tile3));          
    }
}
