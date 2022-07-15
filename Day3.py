import numpy as n
s1=int(input("Enter the size of 1st array:"))
s2=int(input("Enter the size of 2nd array:"))
arr1=n.empty(s1)
arr2=n.empty(s2)
arr3=[]
c=int(0)
for i in range(0,s1):
    arr1[i]=int(input())
for i in range(0,s2):
    arr2[i]=int(input())
for i in range(0,s1):
    arr3.append(arr1[i])
for i in range(0,s2):
    arr3.append(arr2[i])
arr3=n.asarray(arr3)
arr3=n.sort(arr3)
k=int(input("Enter the Kth Element: "))
print(int(arr3[k-1]))
