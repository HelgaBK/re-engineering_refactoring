package refactoring;
public class Game {
    private char _lastSymbol = ' ';
    private Board _board = new Board();

    public void Play(char symbol, int x, int y) throws Exception {
        //in case the first move
        if (_lastSymbol == ' ') {
            //when the player is X
            if (symbol == 'O') {
                throw new Exception("Attention! Invalid first player");
            }
        }
        //in case not first move but 
        /****player repeated*/
        else if (symbol == _lastSymbol) {
            throw new Exception("Attention! Invalid next player");
        }
        
        else if (_board.TileAt(x, y).Symbol != ' ') {
            throw new Exception("Attention! Invalid position");
        }

        _lastSymbol = symbol;
        _board.AddTileAt(symbol, x, y);
    }
    public char TheWinner() {
        //if the positi
        //ons in first row are taken
        if (_board.TileAt(0, 0).Symbol != ' ' &&
                _board.TileAt(0, 1).Symbol != ' ' &&
                _board.TileAt(0, 2).Symbol != ' ') {
            //if first row is full with same symbol
            if (_board.TileAt(0, 0).Symbol ==
                    _board.TileAt(0, 1).Symbol &&
                    _board.TileAt(0, 2).Symbol == _board.TileAt(0, 1).Symbol) {
                return _board.TileAt(0, 0).Symbol;
            }
        }

        //if the positions in first row are taken
        if (_board.TileAt(1, 0).Symbol != ' ' &&
                _board.TileAt(1, 1).Symbol != ' ' &&
                _board.TileAt(1, 2).Symbol != ' ') {
            //if middle row is full with same symbol
            if (_board.TileAt(1, 0).Symbol ==
                    _board.TileAt(1, 1).Symbol &&
                    _board.TileAt(1, 2).Symbol ==
                            _board.TileAt(1, 1).Symbol) {
                return _board.TileAt(1, 0).Symbol;
            }
        }

        //if the positions in first row are taken
        if (_board.TileAt(2, 0).Symbol != ' ' &&
                _board.TileAt(2, 1).Symbol != ' ' &&
                _board.TileAt(2, 2).Symbol != ' ') 
                {
            //if middle row is full with same symbol
            if (_board.TileAt(2, 0).Symbol ==
                    _board.TileAt(2, 1).Symbol &&
                    _board.TileAt(2, 2).Symbol ==
                            _board.TileAt(2, 1).Symbol) {
                
                return _board.TileAt(2, 0).Symbol;
            }
        }

        return ' ';
    }
}

