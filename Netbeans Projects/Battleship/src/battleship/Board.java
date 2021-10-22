
package battleship;

public class Board
{
    private char[][] squares = new char[10][10];
    
    public Board()
    {
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares.length; c++)
            {
                squares[r][c] = '-';
            }
        }
    }
    
    public boolean addShip(int row, int col, int len, boolean horizontal)
    {
        if(row < 0 || col < 0 || row >= 10 || col >= 10)
        {
            return false;
        }
        if(horizontal)
        {
            if(col + len > squares[row].length)
            {
                return false;
            }
            else
            {
                for(int i = col; i < col + len; i++)
                {
                    if(squares[row][i] == 'b')
                    {
                        return false;
                    }
                }
                for(int i = col; i < col + len; i++)
                {
                    squares[row][i] = 'b';
                }
                return true;
            }
        }
        if(!horizontal)
        {
            if(row + len > squares.length)
            {
                return false;
            }
            else
            {
                for(int i = row; i < row + len; i++)
                {
                    if(squares[i][col] == 'b')
                    {
                        return false;
                    }
                }
                for(int i = row; i < row + len; i++)
                {
                    squares[i][col] = 'b';
                }
                return true;
            }
        }
        return false;
    }
    
    public int shoot(int row, int col)
    {
        if(row < 0 || col < 0 || row >= 10 || col >= 10)
        {
            return -1;
        }
        else if(squares[row][col] == '-')
        {
            squares[row][col] = 'm';
            return 0;
        }
        else if(squares[row][col] == 'b')
        {
            squares[row][col] = 'x';
            return 1;
        }
        else if(squares[row][col] == 'm' || squares[row][col] == 'x')
        {
            return 2;
        }
        return -1;
    }
    
    public boolean gameOver()
    {
        boolean flag = true;
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares[r].length; c++)
            {
                if(squares[r][c] == 'b')
                {
                    flag = false;
                }
            }
        }
        return flag;
    }
    
    public boolean foundShip(int len)
    {
        int shipCounter = 0;
        //horizontal check
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares[r].length; c++)
            {
                if(squares[r][c] == 'b')
                {
                    shipCounter++;
                }
                if(squares[r][c] != 'b')
                {
                    if(shipCounter == len)
                    {
                        return true;
                    }
                    else
                    {
                        shipCounter = 0;
                    }
                }
            }
        }
        
        //vertical check
        shipCounter = 0;
        for(int c = 0; c < squares.length; c++)
        {
            for(int r = 0; r < squares.length; r++)
            {
                if(squares[r][c] == 'b')
                {
                    shipCounter++;
                }
                if(squares[r][c] != 'b')
                {
                    if(shipCounter == len)
                    {
                        return true;
                    }
                    else
                    {
                        shipCounter = 0;
                    }
                }
            }
        }
        return false;
    }
    
    public String toString()
    {
        String output = "";
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares[r].length; c++)
            {
                output += squares[r][c] + " ";
            }
            output += "\n";
        }
        return output;
    }
}