import numpy as n
def sort012(arr, N):
    arr=n.sort(arr)
    return arr
a=sort012([0,2,1,0,1,2,0,2],8)
for i in range(0,8):
    print(a[i])
