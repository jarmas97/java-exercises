
// Implement routeExists() method to check if the road exist

import java.util.*;

class Target{
    public static int row;
    public static int column;
}
class Field {
    private int x;
    private int y;
    public Field(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;
        Field field = (Field) o;
        return x == field.x &&
                y == field.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn, boolean[][] mapMatrix) {

        if (fromColumn == toColumn && fromRow == toRow)return true;
        if (fromRow < 0 || fromColumn < 0 || toRow < 0 || toColumn < 0) return false;
        if (fromRow >= mapMatrix.length || toRow >= mapMatrix.length || fromColumn >= mapMatrix[0].length || toColumn >= mapMatrix[0].length) {
            return false;
        }

        Target.row = fromRow;
        Target.column = fromColumn;
        boolean movedDown, movedUp, movedLeft, movedRight;
        List<Field> fields = new ArrayList<>();
        fields.add(new Field(Target.row, Target.column));
        while (!(Target.row == toRow && Target.column == toColumn)) {
            movedDown = false;
            movedUp = false;
            movedLeft = false;
            movedRight = false;
            Field field;
            if (!((Target.row + 1) >= mapMatrix.length)) {
                if (mapMatrix[Target.row + 1][Target.column]) {
                    field = new Field(Target.row + 1, Target.column);
                    if (!(fields.contains(field))) {
                        Target.row += 1;
                        movedDown = true;
                        fields.add(field);
//                        System.out.println("moving to row:" + Target.row + " column: " + Target.column);
                    }
                }
            }
            if (!((Target.row - 1) < 0)) {
                if (mapMatrix[Target.row - 1][Target.column]) {
                    field = new Field(Target.row - 1, Target.column);
                    if (!(fields.contains(field))) {
                        Target.row -= 1;
                        movedUp = true;
                        fields.add(field);
//                        System.out.println("moving to row:" + Target.row + " column: " + Target.column);
                    }
                }
            }
            if (!((Target.column + 1) >= mapMatrix[0].length)) {
                if (mapMatrix[Target.row][Target.column + 1]) {
                    field = new Field(Target.row, Target.column + 1);
                    if (!(fields.contains(field))) {
                        Target.column += 1;
                        movedRight = true;
                        fields.add(field);
//                        System.out.println("moving to row:" + Target.row + " column: " + Target.column);
                    }
                }
            }
            if (!((Target.column - 1) < 0)) {
                if (mapMatrix[Target.row][Target.column - 1]) {
                    field = new Field(Target.row, Target.column - 1);
                    if (!(fields.contains(field))) {
                        Target.column -= 1;
                        movedLeft = true;
                        fields.add(field);
//                        System.out.println("moving to row:" + Target.row + " column: " + Target.column);
                    }
                }
            }
            if (!movedDown && !movedUp && !movedLeft && !movedRight) {
                break;
            }
        }
        return Target.row == toRow && Target.column == toColumn;
    }
    public static void main(String[] args) {
//        boolean[][] mapMatrix = {
//                {false, false, false, false, false, false, false, false, false},
//                {false, true,  false, false, false, false, false, false, false},
//                {false, true,  false, false, false, false, false, false, false},
//                {false, true,  false, false, false, false, false, false, false},
//                {false, true,  true,  false, false, false, false, false, false},
//                {false, false, true,  false, false, false, false, false, false},
//                {false, false, true,  false, false, true,  true,  false, false},
//                {false, false, true,  false, false, false, true,  false, false},
//                {false, false, true,  false, false, false, true,  false, false},
//                {false, false, true,  true,  true,  true,  true,  false, false},
//                {false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false},
//        };
        boolean[][] mapMatrix = {
                {true, false, false, false},
                {true, false, true, false},
                {true, false, true, false},
                {true, true, true, false}
        };
        System.out.println(routeExists(0, 0, 1, 2, mapMatrix));
    }
}
