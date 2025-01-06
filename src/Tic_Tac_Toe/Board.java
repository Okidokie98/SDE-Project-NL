package Tic_Tac_Toe;

public class Board {
    private Cell[][] cells;

    public Board(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < cells.length; i++) {
            if (cells[i][0].getSymbol() == symbol &&
                    cells[i][1].getSymbol() == symbol &&
                    cells[i][2].getSymbol() == symbol) {
                return true;
            }
        }

        for (int i = 0; i < cells.length; i++) {
            if (cells[0][i].getSymbol() == symbol &&
                    cells[1][i].getSymbol() == symbol &&
                    cells[2][i].getSymbol() == symbol) {
                return true;
            }
        }

        if (cells[0][0].getSymbol() == symbol &&
                cells[1][1].getSymbol() == symbol &&
                cells[2][2].getSymbol() == symbol) {
            return true;
        }

        if (cells[0][2].getSymbol() == symbol &&
                cells[1][1].getSymbol() == symbol &&
                cells[2][0].getSymbol() == symbol) {
            return true;
        }

        return false;
    }


    public boolean checkDraw() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public String checkGameStatus(char currentPlayerSymbol) {
        if (checkWin(currentPlayerSymbol)) {
            return "win";
        }

        if (checkDraw()) {
            return "draw";
        }

        return "continue";
    }

    public void render() {
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                cell.render();
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int x, int y, char symbol) {
        if (cells[x][y].isEmpty()) {
            cells[x][y].setSymbol(symbol);
            return true;
        }
        return false;
    }

    public void undoMove(int x, int y) {
        cells[x][y].setSymbol(' ');
    }
}