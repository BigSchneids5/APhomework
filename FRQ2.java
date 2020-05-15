public int countNotInVocab(String[] wordArray){
  int total = 0;
  for(int i = 0; i < wordArray.length; i++){
    if(findWord(wordArray[i]) == false){
        total++;
    }
  }
  return total;
}


public String[] notInVocab(String[] wordArray){
  String[] str = new String[countNotInVocab(wordArray)];
  for(int i = 0; i < wordArray.length; i++){
    if(findWord(wordArray[i]) == false){
      str.add(wordArray[i]);
    }
  }
  return str;
}
//=========================================================================

public int divBySum(int[] arr, int num){
  int sum = 0;

  for(int n : arr){
      if(n%num == 0) sum += n;
  }
  return sum;
}
