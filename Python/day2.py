a=int(input("Enter a number"))
print("Number of digits",len(str(a)))
s=0
maxx=0
while(a!=0):
    b=a%10
    s+=b
    a//=10
    if(b>maxx):
        maxx=b
print("Sum of digits is",s)
print("Largest digit is",maxx)