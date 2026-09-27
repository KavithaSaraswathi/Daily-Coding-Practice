#longest consecutive increasing sequence
a=list(map(int,input("Enter elements of list ").split()))
count=1
max_count=1
for i in range(1,len(a)):
    if(a[i]>a[i-1]):
        count+=1
        if count>max_count:
            max_count=count
    else:
        count=1
print(f"The length of longest consecutive increasing sequence is {max_count}")