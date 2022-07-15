import numpy as n
sa=int(input("Enter size of A array:"))
a=n.empty(sa)
print("Enter the array")
for i in range(0,sa):
    a[i]=int(input())
sb=int(input("Enter size of B array: "))
b=n.empty(sb)
print("Enter the array")
for i in range(0,sb):
    b[i]=int(input())
count=0
for i in b:
    for j in a:
        if i==j:
            count=count+1
if count==sb:
    print("B is a subset of A")
else:
    print("B is not a subset of A")
