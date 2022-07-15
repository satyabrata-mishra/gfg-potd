import numpy as n
s=int(input("Enter the size of the array "))
arr=n.empty(s)
print("Enter the array")
for i in range(0,s):
    arr[i]=int(input())
arr=n.sort(arr)
sum=0
for i in range(0,s):
    sum=sum+(i*arr[i])
print(sum)
