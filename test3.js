const matrix = [
    [2, 4, 2, 3, 3, 1],
    [1, 3, 1, 1, 4, 1],
    [3, 1, 2, 3, 3, 4],
    [2, 1, 1, 1, 1, 4],
    [2, 4, 3, 2, 2, 1]
]


const adjacentEqualPositions = [];

matrix.map((row, rowIndex) => {
    row.map((element, colIndex) => {
        // 检查右边相邻元素
        if (colIndex < row.length - 1 && element === row[colIndex + 1]) {
            adjacentEqualPositions.push({ row: rowIndex, col: colIndex });
            adjacentEqualPositions.push({ row: rowIndex, col: colIndex + 1 });
        }

        // 检查下边相邻元素
        if (rowIndex < matrix.length - 1 && element === matrix[rowIndex + 1][colIndex]) {
            adjacentEqualPositions.push({ row: rowIndex, col: colIndex });
            adjacentEqualPositions.push({ row: rowIndex + 1, col: colIndex });
        }
    });
});

console.log("相鄰相等的位置:", adjacentEqualPositions);