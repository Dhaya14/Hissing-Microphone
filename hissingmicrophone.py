check=True;
n=input()
for i in range(0,len(n)-1): 
  if(n[i] =='s' and n[i+1]=='s'):
      print ("hiss")
      check=False;
      break
if(check):
    print ("no hiss")

