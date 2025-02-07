package OnlineCompaniesRevisited;

public class OnlineCompany extends Company
{
    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name, null, null, null);
        this.webAddress = webAddress;
    }

    //Return the website address
    @Override
    public String address(){
        return webAddress;
    }

    /**
     * Remember: To get name from superclass, use super.getName()
     * Example:
     * CodeHS
     * www.codehs.com
     */
    @Override
    public String toString(){
        return super.getName() + "\n" + "Website: " + webAddress;
    }
}
