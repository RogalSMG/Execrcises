import codeWars.Solutions;
import selfTaught.interfaces.ProgramFigure;
import selfTaught.loops.IfWhile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ProgramFigure programFigure = new ProgramFigure();

        IfWhile.treeWithTrunk(10, 3, 3);

        Solutions.getSum(new int[][] {{12,44},{10,11},{93,129},{4,6},{40,39},{1,0}});



//        Tablice.displayArray(array);
//        IfWhile.insertionSorting(array);
//        Tablice.displayArray(array);
//        ScannerFunctions.numberToBinnaryDisplay();

//        Scanner scan = new Scanner(System.in);
//        double bigInteger = Double.parseDouble(scan.nextLine());

//        MyNumber myNumber = new MyNumber(4);
//        myNumber = myNumber.pow(new MyNumber(3));

//        double noe = Double.parseDouble(myNumber.toString());
//        System.out.println(noe);
    }
}
