package uk.ac.aber.cs21120.solution;

import uk.ac.aber.cs21120.interfaces.IGrid;


public class Grid implements IGrid {

    @Override
    public int get(int x, int y) throws BadCellException {
        return 0;
    }

    @Override
    public void set(int x, int y, int val) throws BadCellException, BadDigitException {

    }

    @Override
    public boolean isValid() {
        return false;
    }

    public Grid() {
    }

    public String toString(){
        StringBuilder b = new StringBuilder();
        for(int y=0;y<9;y++){
            for(int x=0;x<9;x++){
                b.append(get(x,y));
            }
            b.append('\n');
        }
        return b.toString();
    }
}
