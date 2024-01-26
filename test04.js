// 生成隨機數字
function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);
}

// 生成陣列
function generateArray() {
    const length = getRandomNumber(3, 6);
    const newArray = Array.from({ length }, () => getRandomNumber(1, 6));

    return newArray

}

// 創建集合
const collection = new Set();
collection.add([6, 4, 1, 3, 5, 2])
collection.add([4, 6, 1, 1, 4, 4])
collection.add([1, 2, 2])
collection.add([1, 4, 2, 5, 5])
collection.forEach(element => {

    console.log(element);

    for (const iterator of collection) {
        if (arraysEqual(iterator, [1, 2, 2]))
            collection.delete(iterator)

    }
})
function arraysEqual(arr1, arr2) {
    return JSON.stringify(arr1) === JSON.stringify(arr2);
}
console.log("-------------------");
collection.forEach(element => {
    // collection.delete([1, 4, 2, 5, 5])
    console.log(element);
})
console.log("-------------------");
collection.forEach(element => {
    console.log(element);
})
console.log("-------------------");