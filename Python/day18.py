def longest_substring(s):
    sub=''
    lon_len=0
    a=set()
    left=0
    for right in range(len(s)):
        while s[right] in sub:
            sub=sub[1:]
            left+=1
        sub+=s[right]
        leng=len(sub)
        lon_len=max(lon_len,leng)
        a.add(sub)
    return lon_len
s=input("Enter a string:")
print(longest_substring(s))


