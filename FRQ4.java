public void scrambleWord(String str){
  for(int i = 0; i < str.length(); i++){
    if(str.CharAt(i).equals("A") && !str.CharAt(i+1).equals("A"){
      str.substring(i,i+1) = str.CharAt(i+1);
      str.substring(i+1,i+2) = "A";
      i++;
    }

  }
}

public static void scrambleOrRemove(List<String> wordList){
  ArrayList<String> original = new ArrayList<String>();
  for(int i = 0; i < wordList.size(); i++){
    original.add(wordList.get(i));
  }

  for(String item : wordList){
    scrambleWord(item);
  }

  for(int i = 0; i < original.size(); i++){
    for(int i = 0; i < wordList.size(); i++){
      if(original.get(i).equals(wordList.get(i))){
        wordList.remove(i);
      }
    }
  }

}
