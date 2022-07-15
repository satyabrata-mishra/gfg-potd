import numpy as n
a=int(input("Enter the size of the array:"))
arr=n.empty(a)
print("Enter the array")
for i in range(0,a):
      arr[i]=input()
k=int(input("Enter The Difference:"))
for i in range(0,a):
    for j in range(0,a):
        if int(arr[i])!=int(arr[j]):
            if arr[i]>arr[j]:
                if int(arr[i]) - int(arr[j]) < k and arr[i]!=0 and arr[j]!=0:
                    print(f"( {arr[i]},{arr[j]} )")
                    arr[i]=0
                    arr[j]=0
            elif arr[i]<arr[j]:
                if int(arr[j]) - int(arr[i]) < k and arr[i]!=0 and arr[j]!=0:
                    print(f"( {arr[i]},{arr[j]} )")
                    arr[i]=0
                    arr[j]=0
