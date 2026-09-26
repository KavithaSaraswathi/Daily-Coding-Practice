a=(input("Enter a number: "))
b=(input("Enter a digit: "))
if b not in a:
    print(b,"is not in the given number")
else:
    count=0
    for i in a:
        if b==i:             #a.count(b)
            count+=1
    print(b,"occures",count,"times")