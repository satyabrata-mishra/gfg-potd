import numpy as np
n=int(input("Enter the size of the array: "))
arr=np.empty(n)
print("Enter the elements: ")
for i in range(0,n):
    arr[i]=int(input())
count=0
sum=int(input("Enter the sum: "))
for i in range(0,n):
    for j in range(0,n):
        for k in range(0,n):
            for l in range(0,n):
                if arr[i]+arr[j]+arr[k]+arr[l]==sum:
                    count=1
                    break
if(count==1):
    print("Four Elements Sum Exsits")
else:
    print("Four Elements Sum Doesn't Exsits")
