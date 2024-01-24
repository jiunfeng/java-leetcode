const matrix = Array.from({ length: 5 }, () => Array.from({ length: 6 }, () => Math.floor(Math.random() * 4) + 1));

// 初始化四個陣列來存儲相同元素的位置
const positions = {
    '1': [],
    '2': [],
    '3': [],
    '4': []
};

// 遍歷矩陣，找到相同元素的位置
for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
        const element = matrix[i][j];
        positions[element].push({ row: i, col: j });
    }
}

// 輸出原始矩陣和位置信息
console.log("原始矩陣:");
console.log(matrix);
console.log("\n位置信息:");
console.log(positions);

// 用位置信息創建新的四個矩陣
const resultMatrices = Object.keys(positions).reduce((result, key) => {
    result[key] = Array.from({ length: 5 }, () => Array(6).fill(null));

    positions[key].forEach(({ row, col }) => {
        result[key][row][col] = +key;
    });

    return result;
}, {});

// 輸出新的四個矩陣
console.log("\n新的四個矩陣:");
for (const key in resultMatrices) {
    console.log(`元素 ${key}:`);
    console.log(resultMatrices[key]);
}
