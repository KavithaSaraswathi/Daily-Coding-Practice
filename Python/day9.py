#Find missing number in range
a=list(map(int,input("Enter range of numbers: ").split()))
b=len(a)+1
d=sum(a)
missing_num=((b*(b+1))/2)-d
print(missing_num)