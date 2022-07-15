import numpy as n
size=int(input("Enter the size of the array: "))
arr=n.empty(size)
print("Enter the array")
sum=0
count=0
maxcount=0
for i in range(0,size):
    arr[i]=int(input())
for i in range(0,size):
    for j in range(i,size):
        sum=sum+arr[j]
        count=count+1
        if sum==0 and count>maxcount:
            maxcount=count
    count=0
    sum=0
print("Longest Sub Array With Sum 0 is ",maxcount)
