import math as m
dvd=int(input("Enter the dividend:"))
dsr=int(input("Enter the divisor:"))
a=int(m.exp(m.log(m.fabs(dvd))-m.log(m.fabs(dsr))))
if dsr<0 or dvd<0:
    a=a*-1
print(a)
