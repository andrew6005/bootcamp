public enum SysError {
  TIMEOUT (1000000, "connect timeout"),;
  private int code;
  private String mesege;
  private SysError(int code ,String message){
    this.code =code;
    this.mesege = message;
  }
  public int getCode(){
    return this.code;
  }

  public String getMessage(){
    return this.mesege;
  }


  
}
