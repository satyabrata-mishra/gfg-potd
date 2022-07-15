import numpy as n
s=int(input("Enter the size of the array: "))
print("Enter the array")
arr=n.empty(s)
for i in range(0,s):
    arr[i]=int(input())
tsum=0
for i in range(0,s):
    sum=0
    temp=arr[i]
    while temp!=0:
        x=int(temp%10)
        sum=sum+x
        temp=int(temp/10)
    for j in range(0,s):
        if i!=j:
            sum1=0
            temp1=arr[j]
            while temp1!=0:
                x1=int(temp1%10)
                sum1=sum1+x1
                temp1=int(temp1/10)
            if sum==sum1:
                sumz=arr[i]+arr[j]
                if sumz>tsum:
                    tsum=sumz
if tsum==0:
    print("-1")
else:
    print(tsum)
