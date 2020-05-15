public int countElectronicsByMaker(String maker){
  int num = 0;
  for(int i = 0; i < purchases.size(); i++){
    if(isElectronic(purchases.get(i)) && getMaker(purchases.get(i)) == maker ){
      num++;
    }
  }
  return num;
}

public boolean hasAdjacentEqualPair(){
  for(int i = 0; i < purchases.size(); i++){
    if(isElectronic(purchases.get(i) && isElectronic(purchases.get(i+1))){
      if(getMaker(purchases.get(i)) == getMaker(purchases.get(i+1) ) ){
        return true;
      }
    }
  }
  return false;
}

public static boolean isValid(int numCheck){
  String test = numCheck.toString()
  int i = getCheck(num);
  String iTest = i.toString();
  if(test.substring(test.length()-1).equals(iTest)) return true;
  else return false;
}
