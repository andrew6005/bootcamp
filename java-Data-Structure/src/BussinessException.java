public class BussinessException extends RuntimeException{
  private int code;

  public BussinessException(int code , String message ){
    super(message);
    this.code=code;
  }
  public static BussinessException of(SysError sysError){
    return new BussinessException(SysError.getCode().sysError.getMessage);
  }
  public int getcode(){
    return this .code;
  }

  
}
