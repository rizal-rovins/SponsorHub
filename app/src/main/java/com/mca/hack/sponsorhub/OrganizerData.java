package com.mca.hack.sponsorhub;

/**
 * Created by gandharv on 28/10/17.
 */

public class OrganizerData {

    public String ORGANIZERNAME;
    public String EVENTTYPE;
    public String USERNAME;
    public String PASSWORD;

    OrganizerData(String ORGANIZERNAME,String EVENTTYPE, String USERNAME, String PASSWORD){
        this.ORGANIZERNAME=ORGANIZERNAME;
        this.EVENTTYPE=EVENTTYPE;
        this.USERNAME=USERNAME;
        this.PASSWORD=PASSWORD;
    }

}
