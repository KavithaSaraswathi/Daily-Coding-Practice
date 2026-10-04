a=input("Enter set of paranthesis:")
def isValid(s):
    stack=[]
    for i in range(len(s)):
        if s[i] in ['[','{','(']:
            stack.append(s[i])
        elif not stack:
            return False
        elif (stack[-1]=='(' and s[i]==')') or (stack[-1]=='[' and s[i]==']') or (stack[-1]=='{' and s[i]=='}'):
            stack.pop()
    if(len(stack)==0):
        return True 
    else:
        return False
print(isValid(a))