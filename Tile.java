public class Tile {
    char letter;
    int value;

    public Tile (char letter, int value)
    {
        this.letter = letter;
        this.value = value;
    }

    public Tile ()
    {
        this.letter = 'A';
        this.value = 1;
    }

    public void setValue(int i)
    {
        this.value = i;
    }

    public void setLetter(char c)
    {
        this.letter = c;
    }

    public char getLetter()
    {
        return this.letter;
    }

    public int getValue()
    {
        return this.value;
    }

    public boolean equals(Tile t)
    {
        boolean isEqual = false;

        if(this.letter == t.getLetter())
        {
            if (this.value == t.getValue())
            {
                isEqual = true;
            }
        }
        
        return isEqual;
    }

    public int compareTo(Tile t)
    {
        int difference = 0;

        if (this.getLetter() == t.getLetter())
        {
            difference = this.getValue() - t.getValue();
        }

        else 
        {
            difference = this.getLetter() - t.getLetter();
        }
        return difference;
    }

    public String toString()
    {
        return "Letter: " + String.valueOf(this.getLetter()) + " Value: " + String.valueOf(this.getValue());  
    }

}
