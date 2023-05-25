object Solution2 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val cell = Array(9) {mutableListOf<Char>()}
        val row = Array(9) {mutableListOf<Char>()}
        val column = Array(9) {mutableListOf<Char>()}
        board.forEachIndexed { i, rowOfBoard ->
            rowOfBoard.forEachIndexed { j, itemOfRow ->
                val indexOfCell = (i / 3) * 3 + j / 3
                if (row[i].contains(itemOfRow)  ||  column[j].contains(itemOfRow) || cell[indexOfCell].contains(itemOfRow)) return false
                if (itemOfRow != '.') {
                    row[i].add(itemOfRow)
                    column[j].add(itemOfRow)
                    cell[indexOfCell].add(itemOfRow)
                }
            }
        }
        return true
    }
}
