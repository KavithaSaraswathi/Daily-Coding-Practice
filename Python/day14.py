string=input("Enter a string: ")
dic={}
for i in string:
    if i==' ':
        continue
    if i in dic:
        dic[i]+=1
    else:
        dic[i]=1
flag=1
for i in dic:
    if dic[i]==1:
        print(i)
        flag=0
        break
if flag:
    print("No non-repeating characters")