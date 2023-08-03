function SmallestElement(arr)
{
    arr.sort();

    let smallest = 1;

    for(let i = 0; i < arr.length; i++)
    {
        if(arr[i] > 0 && arr[i] == smallest)
        {
            smallest++;
        }
    }
    return smallest;
}

let arr = [1,2,0];
console.log(SmallestElement(arr));

