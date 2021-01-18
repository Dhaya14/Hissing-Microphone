check=true;
n=gets.chomp
    for i in 0...n.length 
      if(n[i] =='s' && n[i+1]=='s')
          print "hiss"
          check=false;
          break
      end
    end
    if(check)
       print "no hiss";
    end
