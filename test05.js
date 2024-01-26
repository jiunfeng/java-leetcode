const array1 = new Set();

array1.add([[0, 1], [0, 2], [0, 3], [0, 4]])
array1.add([[1, 2], [2, 2], [3, 2]])
array1.add([[3, 3], [3, 4], [3, 5]])
console.log("初始輸入");
console.log(array1);
console.log("-----------------\n\n\n\n");

const abc = _checkGemSetCombo(array1)
console.log("-----------------\n\n\n\n")
console.log("最終結果");
console.log(abc);



function _checkGemSetCombo(colorGemSet) {
    console.log("函數輸入值");
    console.log(colorGemSet);
    console.log("-----------------\n")
    const adjacentOffsets = [
        [-1, 0], [1, 0], [0, -1], [0, 1]  // 上、下、左、右
    ];
    let remainCheckedGemSet = new Set(colorGemSet)//副本作為巢狀檢查
    let finalGemSet = new Set()
    // 將集合每個combo組取出做檢查
    for (const gemComboArray of colorGemSet) {

        // beCheckedGemSet = new Set([...colorGemSet].filter(subArray => !subArray.every((value, index) => value === gemArray[index])))
        remainCheckedGemSet.delete(gemComboArray)
        console.log("刪除正在迭代元素剩下");
        console.log(remainCheckedGemSet);
        let gemComboArrayAddPosition = new Set(gemComboArray)


        //   將要作為主檢查的集合位置加入上下左右，需過濾掉超出5*6範圍
        Array.from(gemComboArray).forEach(element => {

            for (const direct of adjacentOffsets) {

                const newRow = element[0] + direct[0]
                const newCol = element[1] + direct[1]
                if (newRow >= 0 && newRow < 5 && newCol >= 0 && newCol < 6) {

                    gemComboArrayAddPosition.add([newRow, newCol])
                }
            }
        });


        // 檢查主集合是否包含子集合中的任何一個元素

        for (const iterator of remainCheckedGemSet) {

            const containsAny = iterator.some(element =>
                Array.from(gemComboArrayAddPosition).some(setElement =>
                    JSON.stringify(element) === JSON.stringify(setElement)
                )
            );//true表示 兩個組合相鄰 
            if (containsAny) {
                console.log("主集合包含子集合中的至少一個元素");
                remainCheckedGemSet.delete(iterator)
                finalGemSet.add(gemComboArray.concat(iterator))
                for (const iterator of remainCheckedGemSet) {
                    finalGemSet.add(iterator)
                }
                console.log(finalGemSet);
                _checkGemSetCombo(finalGemSet)
            } else {
                console.log("主集合不包含子集合中的任何元素");
                break

            }
        }

        // const containsAny = Array.from(subSet).some(subArraySet =>
        //     Array.from(subArraySet).some(subArray => mainSet.has(subArray))
        //   );



    }

    return finalGemSet
}




// for (const iterator of array1) {
// const newSet = new Set([...array1].filter(subArray => !arraysAreEqual(subArray, iterator)));
// const newSet = new Set([...array1].filter(subArray => !subArray.every((value, index) => value === iterator[index])));
// console.log(newSet);}
// function arraysAreEqual(arr1, arr2) {
//     return arr1.length === arr2.length && arr1.every((element, index) => element === arr2[index]);
// }


// // // 將陣列轉換為 Set
// const set1 = new Set(array1.map(JSON.stringify));
// const set2 = new Set(array2.map(JSON.stringify));
// console.log(set1);
// console.log(set2);
// // // 取得交集
// const intersection = new Set([...set1].filter(value => set2.has(value)));

// // // 如果交集非空，則表示有相同的子陣列
// const haveCommonSubArray = intersection.size > 0;

// console.log(haveCommonSubArray);


const originalArray = [[0, 1], [0, 2], [0, 3], [0, 4]];

// 將每個元素 +1，+2，並放入集合
// const newArraySet = new Set([...originalArray.map(subArray => [
//     subArray[0] + 1,
//     subArray[1] + 2
// ]), ...originalArray]);
const newArraySet = new Set([...originalArray]);

// console.log(newArraySet);