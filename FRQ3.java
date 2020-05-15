public DownloadInfo getDownloadInfo(String title){
    for(DownloadInfo item : downloadList){
      if(item.getTitle().equals(title)){
        return item;
      }
    }
    return null;
}


public void updateDownloads (ArrayList<String> titles){
  for(String title : titles){
    DownloadInfo DL = getDownloadInfo(title);
    if(DL == null){
      downloadList.add(new DownloadInfo(title));
    }else {
      DL.incrimentTimesDownloaded();
    }
  }
}


//======================================================================

public class TokenPass{
  private int[] board;
  private int[] currentPlayer;
}

public TokenPass(int playerCount){
  this.board = new int[playerCount];
  for(int item : board){
    item = (int) (Math.random()*10) + 1;
  }
  currentPlayer = (int) (Math.random()*playerCount) ;
}

public void distributeCurrentPlayerTokens(){
    for(int i = currentPlayer+1; i < playerCount && board[currentPlayer] > 1; i++){
      board[currentPlayer]--;
      board[i]++
      if(i == playerCount){
        i = 0;
      }
    }
}
