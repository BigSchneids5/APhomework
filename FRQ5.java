pubic class Digits{


  priate ArrayList<Integer> digitList;


  public Digits(int num){
    String nums = num.toString();
    for(int i = 0; i < nums.length(); i++){
      if(nums.substring(i,i+1).equals("0")) digitList.add(0);
      else if(nums.substring(i,i+1).equals("1")) digitList.add(1);
      else if(nums.substring(i,i+1).equals("2")) digitList.add(2);
      else if(nums.substring(i,i+1).equals("3")) digitList.add(3);
      else if(nums.substring(i,i+1).equals("4")) digitList.add(4);
      else if(nums.substring(i,i+1).equals("5")) digitList.add(5);
      else if(nums.substring(i,i+1).equals("6")) digitList.add(6);
      else if(nums.substring(i,i+1).equals("7")) digitList.add(7);
      else if(nums.substring(i,i+1).equals("8")) digitList.add(8);
      else  digitList.add(9);

    }
  }

  public boolean isStrictlyIncreasing(){
    for(int i = 0; i < digitList.size()-1; i++){
      if(digitList.get(i).intValue() >= digitList.get(i).intValue()) return false
    }
    return true;
  }

}
