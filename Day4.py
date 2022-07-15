import numpy as n
xs=int(input("Enter the size of 1st array: "))
x=n.empty(xs)
print("Enter the 1st Array: ")
for i in range(0,xs):
    x[i]=int(input())
ys=int(input("Enter the size of 2st array: "))
y=n.empty(ys)
print("Enter the 2nd Array: ")
for i in range(0,ys):
    y[i]=int(input())
fin=[]
for i in range(0,xs):
    fin.append(x[i])
for i in range(0,ys):
    fin.append(y[i])
fin=n.asarray(fin)
fin=n.sort(fin)
size=xs+ys
if int(size%2)==0:
    print(f"Median of the array is {fin[(int(size/2)-1)]}")
else:
    print(f"Median of the array is {fin[(int((size+1)/2)-1)]}")
