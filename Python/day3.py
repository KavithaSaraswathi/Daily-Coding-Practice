#Perfect number
a=int(input("Enter a number:"))
b=list()
for i in range(1,a):
    if(a%i==0):
        b.append(i)
if(sum(b)==a):
    print("Perfect number")
else:
    print("Not a perfect number")