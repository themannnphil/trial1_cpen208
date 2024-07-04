package com.cpen208.trial1.model;

public class coursedescription {
    private String id; //i made this int first but i had an errorto access my array
    private String name; 
    private int level; 
    private String about; 

    public coursedescription (String id, String name, String about, int level ){
        this.id = id;
        this.name = name;
        this.about =about ;
        this.level = level;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String  getAbout(){
        return about;
    }
    public void setAbout( String about){
        this.about = about;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    
}
