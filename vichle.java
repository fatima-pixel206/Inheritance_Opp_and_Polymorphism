package OPP;

public class vichle {
    private String vichleType;
    private    String vichleName;
    private  int vichleModel;
    private    String VichleNumber;
    private      String ownerNmae;
    private     String address;
    private String vichleNumber;
    public vichle(String vichleType,String vichleName, int vichleModel , String VichleNumber,String ownerNmae, String addres){
        this.vichleType=vichleType;
        this.vichleName=vichleName;
        this.vichleModel=vichleModel;
        this.VichleNumber=VichleNumber;
        this.ownerNmae=ownerNmae;
        this.address=addres;


    }
    public void setVichleType(String vichleType){

        this.vichleType=vichleType;
    }
    public String getVichleType(){
        return vichleType;
    }

    public void setVichlName(String vichleName){

        this.vichleName=vichleName;
    }
    public String getVichlName(){
        return vichleName;
    }

    public void setVichleModel(int vichleModel){
        this.vichleModel=vichleModel;
    }
    public int getVichlModel(){
        return vichleModel;
    }

    public void setVichleNumber(String vichleNumber){

        this.vichleNumber = vichleNumber;
    }
    public String getVichleNumber(){
        return VichleNumber;
    }


    public void setOwnerName(String ownerNmae){

        this.ownerNmae=ownerNmae;
    }
    public String getOwnerName(){
        return ownerNmae;
    }

    public void setAddress(String address){

        this.address=address;
    }
    public String getAddress(){
        return address;
    }

}


