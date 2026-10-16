def longest_substring(s,k):
    left=0
    sub=''
    max_len=0
    dic={}
    for right in range(len(s)):
        if s[right] in dic:
            dic[s[right]]+=1
        else:
            dic[s[right]]=1
        while len(dic)>k:
            a=s[left]
            dic[a]-=1
            if dic[a]==0:
                del dic[a]
            left+=1
        
        length=right-left+1
        max_len=max(max_len,length)
    return max_len
print(longest_substring("eceba", 2))
        
        
