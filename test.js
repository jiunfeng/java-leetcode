function removeAndRecordIndices(arr, target) {
    const originalIndices = [];

    // 記錄原始索引
    arr.forEach((value, index) => {
        originalIndices.push({ value, index });
    });

    // 移除目標元素
    const newArr = arr.filter(value => value !== target);

    // 記錄改變後的索引
    const changedIndices = newArr.map((value, newIndex) => {
        const originalIndex = originalIndices.find(item => item.value === value && value !== target)?.index;
        return { originalIndex, newIndex };
    });

    return { newArr, changedIndices };
}

const originalArray = [5, 7, 9, 5, 3];
const targetValue = 9;

const { newArr, changedIndices } = removeAndRecordIndices(originalArray, targetValue);

console.log("改變後的陣列:", newArr);
console.log("元素移動的索引:", changedIndices);
