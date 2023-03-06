public class Address {

    public Address(String street,String district,String postcode,String state){
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;

    
    }
    private String street;
    private String district;
    private String postcode;
    private String state;

    //set name
    public void setstreet(String street){
        this.street = street;
    }
    public void setdistrict(String district){
        this.district = district;
    }
    public void setpostcode(String postcode){
        this.postcode = postcode;
    }
    public void setstate(String state){
        this.state = state;
    }
    //getter
    public String getstreet(){
        return street;
    }
    public String getdistrict(){
        return district;
    }
    public String getpostcode(){
        return postcode;
    }
    public String getstate(){
        return state;
    }
    public String toString(){
        return street +" "+district+" "+postcode+" "+state;
    }
}
