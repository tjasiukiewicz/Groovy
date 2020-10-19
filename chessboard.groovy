def makeChessBoard() {
    def chessboard = [:]
    ('a'..'h').each { colNumber ->
        row = [:]
        (1..8).each { rowNumber ->
            row[rowNumber] = " "
        }
        chessboard[colNumber] = row
    }
    return chessboard
}

makeChessBoard()


















































