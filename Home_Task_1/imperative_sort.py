def imperative_sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[j] < arr[i]:
                tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
    return arr


print(imperative_sort([4, 10, 0, -2, -4, 1, 5, 3]))
